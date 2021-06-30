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
