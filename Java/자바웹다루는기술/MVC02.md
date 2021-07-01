# 답변형 게시판 구현하기

1. BoardController 클래스를 작성. getPathInfo() 메서드를 이용해 action 값을 가져오고 action 갑이 null 이거나 .istArticles.do 일 경우 BodardService클래스의 listArticlesI()메서드를 호출해 전체 글을 조회함.그리고 조회한 글을 ariclesList속성으로 binding하고 글 목록창(listArticles.jsp)로 forward

```java
package sec03.brd01;

@WebServlet("/board/*");
public class BoardController extends HttpServlet{
  BoardService boardService;
  ArticleVO articleVO;
  
  public void init() throws ServletException{
    boardService = new BoardService();
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
    doHandle(request,response);
  }
  
  protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    doHandles(request,response);
  }
  
  private void doHandle(HttpServletReqeust request,HttpServletResponse response)throws ServletException,IOException{
    String nextPage="";
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");
    String action = request.getPathInfo();
    System.out.println(action);
    
    
    try{
      List<ArticleVO> articlesList =new ArrayList<ArticleVO>();
      if(action == null){
        articlesList =boardService.listArticles();
        request.setAttribute("articlesList",articlesList);
        nextPage = "/board01/listArticles.jsp";
      }else if(action.equals("/listArticles.do")){
        articlesList =boardService.listArticles();
        requeset.setAttribute("articlesList",articlesList);
        nextPage = "/board01/listArticles.jsp"";
      }
      RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
      dispatch.forward(request,response);
      }catch(Exception e){
        e.printStackTrace();
      }
    }
  }

```

2.  BoardService클래스를 작성.BoardDAO 객체를 생성 후 select AllArticle() 메서드를 호출해 전체 글을 가져온다.

```java
packages sec03.brd01;

public class Boardservice{
  BoardDAO boardDAO;
  
  public BoardService(){
    boardDAO = new BoardDAO();
  }
  
  public List<ArticleVO> listArticles(){
    List<ArticleVO> articlesList = boardDAO.selectAllArticles();
    return articlesList;
  }
 }

```
3. BoardDAO 클래스를 작성.BoardService클래스에서 BoardDAO의 selectAllArticles()메서드를 호출하면 계층형 SQL문을 이용해 계층형 구조로 전체 글을 조회후 반환.
```java
package sec03.brd01;

public class BoardDAO{
  private DataSource dataFactory;
  Connection conn;
  PreparedStatement pstmt;
  
  public BoardDAO(){
    try{
      Context ctx = new InitialContext();
      Context envContext =(Context) ctx.lookup("java:/com[/env");
      dataFactory =(DataSource) envContext.lookup("jdbc/oracle");
    }catch (Exception e){
      e.printStackTrace();
    }
  }
  
  public List <ArticleVO> selectAllArticles(){
    List<ArticleVO> = new ArrayList();
    try{
      conn = dataFactory.getConnection();
      String query = "SELECT LEVEL, articleNO, parentNO, title, content, id, writeDate" 
                    + " from t_board"
                    +"START WITH parentNO= 0"
                    +"CONNECT BY PRIOR articleNO=parentNO"
                    +"ORDER SIBLINGS BY articleNO DESC";
   pstmt =conn.prepareStatement(query);
   ResultSet rs = pstmt.executeQuery();
   while(rs.next()){
    int level = rs.getInt("level");
    int articleNO =rs.getInt("articleNO");
    int parentNO = rs.getInt("parentNO");
    String title = rs.getString("title");
    String content = rs.getString("content")
    Date writeDate = rs.getDate("writeDate");
    ArticleVO article = new ArticleVO();
    article.setLevel(level);
    
   //... so on
   articlesList.add(article);
   }
   rs.close(0;
   pstmt.close(0;
   conn.close();
   }catch(Exception e){
    e.printStackTrace()
   } 
   return articlesList;
  }
 }
```

4. ArticleVO클래스를 작성. 조회한 글을 저장하는 ArticleVO클래스에 글의 깊이를 저장하는 level 속성 추가

5. 이제 JSP에 글 목록을 표시. listArticles.jsp를 다음과 같이 작성. 첫 번째 <forEach> 태그를 이용해 articlesList속성으로 포워딩된 글 목록을 차례로 전달받아 표시. 
  - forEach 태그 반복 시 각 글의 level 값이 1보다 크면 답글이므로 다시 내부 forEach 태그를 이용해 1부터 level 값까지 반복하면서 공백을 만들고 답글을 표시합니다. 이때 level 값이 1보다 크지 않으면 부모글이므로 공백없이 표시

```jsp
<%@ page language ="java" contentType="text/html; charset=UTF-8" pageEncoding ="UTF-8" isELIgnored ="false" %>
  <%@ taglib prefix ="fmt" uri ="http:// java.sun.com/jsp/jstl/fmt"%>
  <%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>
  <c:set var ="contextPath" value "${pageContext.request.contextPath}"/>
  <% 
     request.setCharacterEncoding("UTF-8");
  %>
  <!DOCTYPE html>
  <html>
  <head>
    <style>
      .cls1{text-decoration: none;
    }
      .cls2{
        text-align:center;
        font-size: 30px;
     }
    </style>
    <title> Title</title>
  </head>
  <body>
    <table align="center" border ="1" width ="80%">
    <tr height ="10" align ="center" bgcolor="lightgreen">
      <td> Num</td>
      <td>Author</td>
      <td>Title</td>
      <td>Date</td>
    </tr>
    <c:choose>
      <c:when test ="${empty articlesList}">
        <tr height ="10">
          <td colspan ="4">
            <p align ="center">
              <b><span style="font-size:9pt;">No registerd word</span></b>
            </p>
          </td>
        </tr>
      </c:when>
      <c:when test ="${!empty articlesList}">
        <c:forEach var="article" items ="${articlesList}" varStatus="articleNum">
          <tr align ="center">
            <td width ="5%"> $ {articleNum.count}</td>
            <td witdh ="10%"${article.id} </td>
            <td align ='left' width-"35%">
              <span style ="padding-right:30px"></span>
              <c:choose>
                <c:when test='${article.level >1}'>
                  <c:forEach begin ="1" end ="${article.level}" step ="1">
                    <span style ="padding-left:20px"></span>
                  </c:forEach>
                  <span style ="font-size:12px;">[Reply]</span>
                  <a class='cls1' href="${contextPath}/board/viewArticle.do/articleNO=${article.articleNO}"${article.title}</a>
                </c:when>
 </body>
</html>
```                  
  
```
