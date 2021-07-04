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
public 

```
