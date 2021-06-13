# Binding

- 전달하는 데이터 양이 적을 때는 Get 방식이 편하다. 하지만 서블릿에서 다른 서블릿 또는 JSP로 대량의 데이터 공유할 때는 바인딩 사용
- setAttribute(String name, Object obj): 자원을 각 객체에 바인딩합니다.
- getAttribute(String name) : 각 객체에 바인딩 된 자원을 name으로 가져옵니다.

```java
//FirstServlet

@WebServlet("/first")
public class FirstServlet extends HttpServlet{
  protected vopid doGet(HttpServletRequest resquest, HttpServletResponse reponse) throws ServletException, IOException{
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");
    request.setAttribute("adderess","seoul");
    //RequestDispatcher dispatch = request.getRequestDispatcher("second:);
    disptach.forward(request,resposne);
    
    response.sendRedirect("second");
  }
}

```

- 두번 째 서블릿에서는 HttpSErvletRequest의 getAttribute()메서드 이용하여 전달된 주소를 받음.

```java
@WebServlet("/second");

public class SecondServlet extends HttpServlet{
  protected void doGet(HrrpServletRequest request, HttpServletResponse response) thrwos ServletException , IOException{
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html; charset=utf-8");
    PrintWriter out  = response.getWriter();
    String address= (String) rqeuest.getAttribute("address);
  }
}
//This DOESNT WORK !! OKAY-Redirect 방식으로는 서블릿에서 바인딩한 데이터를 다른 서블릿으로 전송할 수 없다.
```
-모델 2, 스트럿츠 스프링 프레임워크로 개발할 때는 dispatch 방식으로 바인딩된 데이터를 서블릿이나 JSP로 전달한다.
