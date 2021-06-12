#  서블릿 포워드 기능 사용

- 하아의 서블릿에서 다른 서블릿이나 JSP와 연동하는 방법을 forward 라고 한다

## Forwarding method

1. Redirect
- HttpSErvletResponse 객체의 sendRedirect() 메서드 사용
- 웹 브라우저에 재요청하는 방식
- 형식 : sendRedirect("포워드 할 서블릿");

```java
//First Servlet Java 
package sec01.ex01;

@WebServlet("/first");
public class FirstServlet extends HttpServlet{
  protected void doGet(HttpServletRequest request, HttpSErvletResponse response) throws ServletException, IOException{
    response.setContentType("text/html; charset=utf-8");
    PrintWriter out = response.getWriter();
    response.sendRedirect("second");
  }
}


```

```java
package sec01.ex01;

@WebServlet("/second");
public class SecondServlet extends HttpSErvlet{
  protected void doGet(HttpServletRequest request, HttpServletREsponse response) throws ServletException, IOException{
    PrintWriter out = response.getWriter();
    out.println("redirect Test");
  }
}

```

2. Refresh
- HttpServletResponse 객체의 addHeader() 메서드 이용
- 웹 브라우저에 재요청
- 형식: response.addHeader("Refresh",경과시간(초);url=요청할 서블릿 또는 JSP");

3. Location
- 자바스크립트 location객체의 href 속성 이용
- 자바스크립트에서 재요청
- 형식: location.href= '요청할 서블릿 또는 JSP'

4.dispatch
- 일반적으로 포워딩 기능 지칭
- 서블릿이 직접 요청하는 방법
- RequestDispatcher 클래스의 forward()메서드 이용
- 형식: RequestDispatcher dis = request.getRequestDispatcher("JSP");
- dispatch를 이용한 포워딩 과정이 redirect 방법과 다른 점은 클라이언트의 웹 브라우저를 거치지 않고 바로 서버에서 포워딩이 진행된다는 것.
- 따라서 웹 브라우저 주소창의 URL이 변경 안됨. 즉 클라이언트 측에서는 포워드가 진행되었는지 알 수없다.\

```java
//First Servlet Java 
package sec01.ex01;

@WebServlet("/first");
public class FirstServlet extends HttpServlet{
  protected void doGet(HttpServletRequest request, HttpSErvletResponse response) throws ServletException, IOException{
    response.setContentType("text/html; charset=utf-8");
    RequestDispatcher dispatch = request.getRequestDispatcher("second");
    dispatch.forward(request, response);
  }
}


```


```java
package sec01.ex01;

@WebServlet("/second");
public class SecondServlet extends HttpSErvlet{
  protected void doGet(HttpServletRequest request, HttpServletREsponse response) throws ServletException, IOException{
    
    PrintWriter out = response.getWriter();
    out.println("dispatch");
  }
}

```







## Redirect 방식으로 다른 서블릿에 데이터 전달하기
-Redirect 방식을 이용하면 웹 브라우저를 통해 다른 서블릿을 호출하면서 원하는 데이터를 전달 할 수도 있다.

```java
//First Servlet Java 
package sec01.ex01;

@WebServlet("/first");
public class FirstServlet extends HttpServlet{
  protected void doGet(HttpServletRequest request, HttpSErvletResponse response) throws ServletException, IOException{
    response.setContentType("text/html; charset=utf-8");
    PrintWriter out = response.getWriter();
    response.sendRedirect("second");
    response.sendRedirect("second?name=lee");
  }
}


```


```java
package sec01.ex01;

@WebServlet("/second");
public class SecondServlet extends HttpSErvlet{
  protected void doGet(HttpServletRequest request, HttpServletREsponse response) throws ServletException, IOException{
    String name = request.getParameter("name");
    PrintWriter out = response.getWriter();
    out.println("name");
  }
}

```
