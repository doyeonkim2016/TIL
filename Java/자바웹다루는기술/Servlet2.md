## Form Tag 이용하여 서블릿에 요청하기.

  - JSP,ASP,PHP가 나오기 전에는 HTML,CSS,JS로 웹프로그랩을 만들었습니다. 
  - 서블릿과JSP는 이러한 HTML,CSS<JS와 같은 기능을 추가하여 서로 연동함
                              
                              
```html
<form name="frmLogin" method"get" action="login" encType="UTF-8">
  Id: <input type="text" name ="user_id"></br>
  PW: <inpuy type="password" name="user_pw"><br>
<input type = "submit" value ="Login"> <input type="reset" value" 다시입력">
</form>
```


## HttpServlet Request로 요청처리 실습

1. 위와 같은 html창을 작성한다. 로그인창에서 ID와 비밀번호를 입력 받은 후 서블릿으로 전송하는 내용이다.

2. LoginServlet.java 코드를 작성한다.HttpServletRequest 클래스의 getParameter()메서드로 전송된 ID와 비밀번호를 받아옵니다.

```java
package sec01.ex01;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
  public void init() throws Servlet Exception{
    System.ouot.println("init 메서드 호출");
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    request.setCharacterEncoding("utf-8");
    String user_id = request.getParameter("user_id");
    String user_pw = request.getParameter("user_pw");
    System.out.println(user_id);
    System.out.println(user_pw);
  }
  
 public void destroy(){
 }

}

```
3. 단 서블릿이 처리한 후의 응답 기능은 아직 구현하지 않았으므로 웹브라우저에는 아무것도 출력이 안됨.

### 여러 개의 값을 전송할 때의 요청 처리

```html
<form name="frmLogin" method"get" action="login" encType="UTF-8">
  Id: <input type="text" name ="user_id"></br>
  PW: <inpuy type="password" name="user_pw"><br>
  <input type ="checkbox" name ="subject" value ="java" checked>Java
  <input type ="checkbox" name ="subject" value -"C"> C
  <input type ="checkbox" name = :subject value"JSP">JSP
  <br><br> 
  <input type = "submit" value ="Login"> 
  <input type="reset" value" 다시입력">
</form>
```

1. InputServlet 클래스를 다음과 같이 작성한다. getParameterValues()를 이용해 input, html 에서 체크박스의 name 인 subject로 전송된 값들을 받아와서 문자열 배열에 저장
```java

package sec01.ex01;


@WebServlet("/input")
public class InputServlet extends HttpServlet{
  public void init() throws ServletException{
    System.out.println("init method");
  }
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    request.setCharacterEncoding("utf-8");
    String user_id = request.getParameter("user_id");
    String user_pw = request.getParameter("user_pw");
    String[] subject request.getParameterValues("subject");
    for (String str: subject){
      System.out.println(str);
    }
    
  }
  
 }
}
```



