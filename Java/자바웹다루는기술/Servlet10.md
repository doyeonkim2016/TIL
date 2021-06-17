2. URL rewriting 을 이용한 세션 트래킹 실습

이번에는 URL Rewriting을 이용해 로그인창에서 입력 받은ID와 비밀번호를 다른 서블릿으로 전송하여 로그인 상태를 확인해보겠습니다.

- LoginServlet 클래스를 다음과 같이 작성합니다. 로그인창에서 입력받은 ID 와 비밀번호<A> 태그의 두번째 서블릿으로 보내기를 클릭하면로그인창에서 입력한 ID 와 다른 정보를 GET방식으로 전송
  
```LoginServlet.java
package sec01.ex02;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
  public void init(){
    System.out.println("init 메서드 호출");
  }
  protected void doPost (HttpServletRequest request, HttpServletResponse response) throws SErvletException, IOException{
    reqeust.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter();
    String user_id = request.getParameter("user_id");
    String user_pw = request.getParameter("useR_pw");
    String user_address= request.getParameter("user_address");
    String user_ email = requeest.getParameter('user_email");
    String user_hp = request.getParameter("user_hp");
  
    user_address=URLEncoder.encode(user_address,"utf-8");
  //..
  }
}
 
```
  
2. SecondServlet 클래스를 작성, 첫 번째 서블릿에서 전송한 데이터 중 ID와 비밀번호를 가져왔으면 이미 첫번째 서블릿에서 로그인한 것이므로 로그인 상태를 유지
3. 첫번째 서블릿에서 전달받은 로그인 정보를 출력한 후 두번째 서블릿으로 보내기. -> 로그인 상태 확인 가능
- 만약 브라우저에서 로그인 창을 거치지 않고 바로 서블릿 /second를 요청하면 로그인 하지 않았다고 뜸
  
4. 지금까지 <hidden> 태그와 GET방식으로 웹페이지들을 연동하는 방법을 알아봄. 그런데 이러한 방법은 여러가지 단점이있다.
  - 일단 웹 페이지가 많아지면 일일이 로그인 상태를 확인하기 위해 로그인 정보를 다른 웹 페이지로 전송해야 한다.
  - ID 와 비밀번호를 GET방식으로 전송하므로 브라우저에 노출되어 보안상으로도 좋지 않습니다.
  - 전송하는 데이터 용량에도 한계가 있다.
  - 따라서 이 방식은 웹페이지 사이에 간단한 정보정도를 공유할 때만 사용하는 것이 좋다.
