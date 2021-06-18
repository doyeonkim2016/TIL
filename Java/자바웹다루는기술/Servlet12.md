# 세션을 이용한 웹페이지 연동기능

- 세션 역시 웹 페이지들 사이의 공유 정보를 서버에 저장해두고 웹페이지들을 매개해 주는 방법이라는 점에서 쿠키와 같다.
- 세션은 서버의 메모리에 생성되어서 정보를 저장한다.
- 웹 페이지에서 사용되는 정보 중에 로그인 정보처럼 보안이 요구되는 정보는 세션을 이용한다.
- 세션은 브라우저당 한개 즉 사용자당 한개가 생성된다.


1. 세션 기능 실행과정
- 클라이언트의 브라우저가 서버에 최초 접속하면 서버의 서블릿은 세션 객체를 생성한 후 세션 객체에 대한 세션 id를 브라우저에 전송한다.
- 이 세션 id를 브라우저가 사용하는 세션 쿠키에 저장합니다. 즉, 서버로부터 전송된 세션id도 쿠키.


2. 서블릿에서 세션 API이용
- sessionTest클래스를 준비
- request의 인자없는 getSession()메서드를 호출하여 세션이 없으면 새로 생성하고, 세션이 있으면 기존 세션을 가져옵니다.

```java
//SessionTest
@webServlet("/sess")
public class SessionTest extends HttpServlet{
  protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter();
    HttpSession session = request.getSession();
    out.println(session.getId());
    out.println(session.getCreationTime());
    out.println(session.getLastAccesssedTime());
    out.println(session.getMaxInactiveInterval());
    //invalidate를 호출하여 생성된 세션 객체를 강제로 삭제합니다.
    session.invalidate()


```
