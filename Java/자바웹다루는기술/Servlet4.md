# 실습 예제 1: 서블릿에 로그인 요청시 유효성 검사하기

## ID를 정상적으로 입력했을 때는 로그인 메시지를 표시하고, ID를 입력하지 않았을 때는 다시 로그인하라는 메시지를 표시하도록 작성하시오.

1. login.html

```html
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Login</title>
</head>
<body>
  <form name ="frmLogin" method ="post" action="/pro06/loginTest" encType="UTF-8">
     아이디: <input type="text" name ="user_id"><br>
     비밀번호:<input type="password" name ="user pw"><br>
     <input type="submit" value="로그인">
     <input type="reset" value ="다시 입력">
  </form>
</body>
</html>
```

2. LoginTest.java

```java
package sec04.ex01;

@WebServlet("/loginTest")
public class LoginTest extends HttpServlet{
  public void init(){
    System.out.println("init method");
  }
  
  protected void doPost(HttpServletRequest request,HttpServletResonse response) throws Servlet Exception, IOException{
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter();
    String id = request.getParameter("user_id");
    String pw = request.getParameter("user_pw");
    
    if(id!= null && id,length()!= 0{
      out.print("Logged in");
    }else{
      out.print("<a href'http;//localhost:8090/pro06/test01/login.html'>
    }
  }
  public void destroy(){
    System.out.println("destroy method");
  }
}
```



  

    
