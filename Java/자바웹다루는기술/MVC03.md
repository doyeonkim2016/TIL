# 게시판 글쓰기

1. 글 목록창 listArticles.jsp에서 글쓰기창 요청
2. 글쓰기창에서 글을 입력하고 컨트롤러에  /board/addArticle.do로 글쓰기를 요청합니다.
3. 컨트롤러에서 Service클래스로 글쓰기창에서 입력한 글정보를 전달해 테이블에 글을 추가.
4. 새 글을 추가하고 컨트롤러에서 다시 /board/listArticles.do로 요청하여 전체 글을 표시
