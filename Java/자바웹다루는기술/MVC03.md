# 게시판 글쓰기

1. 글 목록창 listArticles.jsp에서 글쓰기창 요청
2. 글쓰기창에서 글을 입력하고 컨트롤러에  /board/addArticle.do로 글쓰기를 요청합니다.
3. 컨트롤러에서 Service클래스로 글쓰기창에서 입력한 글정보를 전달해 테이블에 글을 추가.
4. 새 글을 추가하고 컨트롤러에서 다시 /board/listArticles.do로 요청하여 전체 글을 표시



5.
컨트롤러를 담당하는 BoardControleer 클래스를 작성. action 값이 articleForm.do면 글쓰기창을 브라우저에 표시하고, action 값이 /addArticle.do면 다음 과정으로 새글을 추가합니다. 
- upload() 메서드를 호출해 글쓰기창에서 전송된 글 관련 정보를 Map에 key/Value 쌍으로 저장합니다.
- 파일을 첨부한 경우 먼저 파일 이름을 Map에 저장한 후 첨부한 파일을 저장소에 업로드합니다.
- upload 메서드를 호출한 후에는 반환한 Map에서 새 글 정보를 가져온다. 그런다음 Service 클래스의 addArticle() 메서드 인자로 새 글 정보를 전달하면 새글이 등록
``` java
@WebServlet("/board/*")
public class BoardController extends HttpServlet{
  private static String Article_Image_Repo =" c://board//article_image";
  BoardService boardService;
  ArticleVO articleVO;
  
  public void init(ServletConfig config) throws ServletException{
    boardService = new BoardService();
    articleVO = new ArticleVO();
  }
  
  private void doHandle(HttpServletRequest request, HttpServletResponse response)throws SErvletExcetpion,IOException{
  //...
    }else if(action.equals("/articleForm.do")){
      nextPage ="/boad02/articleForm.jsp";
    }else if (action.equals("/addArticle.do"){
      Map<String, String > article Map = upload(request,response);
      String title = articleMap.get("title");
      String content = articleMap.get("content");
      String imageFileName= articleMap.get("imageFileName");
      
      articleVO.setParentNO(0);
      articleVO.setID("hong");
      articleVO.setTitle(title);
      articleVO.setContent(content);
      articleVO.setImageFleName(imageFileName);
      boardService.addArticle(articleVO);
      next{age= "/board/listArticles.do";
   }
   
   RequestDispathcer dispatch = request.getRequestDispatcher(nextPage);
   dispatch.forward(request,response);
   }catch(Exception e){
    e.printStackTrace();
   }
  }
  
  private Map<String, String> upload(HttpServletRequest request, HttpSErvletResponse response)  throws ServletException,IOException{
    Map<String,String> articleMap = new HashMap<String, String>();
    String encoding= "utf-8";
    File currentDirPath = new File (ARTICLE_IMAGE_REPO);
    DiskFileItemFactory factory = new DiskFileItemFactory();
    factory.setRepository(currentDirPath);
    factory.setSizeThreshold(1024*1024);
    ServletFileUpload upload = new ServletFileUpload(factory);
    try{
      List items = upload.parseRequest(request);
      for (int i= 0; i <items.size(); i++){
        FileItem fileItem = (FileItem) items.get(i);
        if(fileItem.isFormField()){
          System.out.println(fileItem.getFieldName() +'='+ fileItem.getString(encoding));
          articleMap.p;ut(fileItem.getFieldName(),fileItem.getString(encoding));
       }else{
        if(fileItem.getSize() >0){
          int idx = fileItem.getName().lasIndexOf("\\");
          if(idx==-1){
            idx =fileItem.getName().lastIndexOf("/");
          }
          String fileName = fileItem.getName().substring (idx+1);
          articleMap.put(fileItem.getFieldName().fileName);
          File uploadFile = new File(currentDirPath);
          fileItem.write(uploadFile);
          }
         }
        }
      }catch(Exception e){
        e.printStackTrace();
      }
      return articleMap;
    }
  }

```
6. BoardDAO 클래스의insertNewArticle() 메서드를 호출하면서 글 정보를 인자로 전달.
```java
package sec03.brd02;

public class BoardService{
BoardDAO boardDAO;

public void addArticle(ArticleVO article){
  boardDAO.insertNewArticle(article);
}

}

```

7. insertNewArticle()메서드의 SQL문을 실행하기 전에 getNew ArticleNo() 메서드 호출해 새글에 대한 글 번호를 먼저 가져옵니다.
```java
package sec03.brd02;

public class BoardDAO{
  private DataSource dataFactory;
  Connection conn;
  PreparedStatement pstmt;
  
  private int getNewArticleNO(){
    try{
      conn = dataFactory.getConnection();
      String query = "Select max(articleNO) from t_board";
      pstmt = conn.prepareStatement(query);
      ResultSet rs = pstmt.executeQuery();
      if(rs.next())
        return (rs.getInt(1) +1);
      rs.close();
      pstmt.close();
      conn.close();
     }catch(Exception e){
      e.printStackTrace();
     }
     return 0;
    }
  }
  
  public void insertNewArticle(ArticleVO article){
    try{
      conn = dataFactory.getConnection();
      int  articleNO = getNewArticleNO();
      int parent NO = article.getParentNO();
      String title = article.getTitle();
      String content = article.getContent();
      String id = article.getId();
      String imageFileName= article.getImageFileName();
      String query = "INSERT INTO t_board (articleNO, parentNO, title, content, imageFileName, id)" +VALUEs(?,?,?,?,?,?);
      pstmt = conn.prepareStatement(query);
      pstmt.setInt(1,articleNO);
      pstmt.setInt(2,parentNO);
      pstmt.setString(3,title);
      pstmt.setString(4,content);
      pstmt.setString(5,imageFileName);
      pstmt.setString(6,id);
      pstmt.executeUpdate();
      pstmt.close();
      conn.close();
     }catch(Exception e){
      e.p;rintStackTrace();
     }
   }
  }
    



```
