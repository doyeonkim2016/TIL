# JSP 스크립트 요소의 기능
- JSP 스크립트 요소란 JSP 페이지에서 여러 가지 동적인 처리를 제공하는 기능으로 <% %> 기호 안에 자바 코드로 구현합니다.
- <% %> 기호를 스크립트릿이라고 부릅니다.
- 선언문 (declaration tag) : JSP에서 변수나 메서드를 선언할 때 사용합니다.
- 스크립트릿(scriptlett): JSP에서 자바 코드를 작성할 때 사용합니다.
- 표현식 (expression tag) : JSP에서 변수의 값을 출력할 때 사용합니다.

1. 선언문 사용

선언문은 JSP 페이지에서 사용하는 멤버 변수나 멤버 메서드를 선언할 때 사용. 선언문 안의 멤버는 서블릿 변환 시 서블릿 클래스의 멤버로 변환됨.

```jsp
<%@ page language ="java" contentType="text/html; charset= UTF-8" pageEncoding="UTF-8" %>

<%!
  String name = "Duke";
  public String getName(){return name;}
%>

<!DOCTYPE html>
<html>
<head>
  <meta charset ="UTF-8">
  <title> Declaration Tage </title>
</head>
<body>
  <h1> Hi <%=name%></h1>
</body>
</html>
```

2. 스크립트릿 사용하기
<% %>-안에는 자바 코드만 사용 가능함.
```jsp
<%@ page language ="java" contentType="text/html; charset= UTF-8" pageEncoding="UTF-8" %>

<%!
  String name = "Duke";
  public String getName(){return name;}
%>

<% String age = request.getParameter("age");%>

<!DOCTYPE html>
<html>
<head>
  <meta charset ="UTF-8">
  <title> Declaration Tage </title>
</head>
<body>
  <h1> Hi <%=name%></h1>
  <h2> <%=age %></h2>
  
</body>
</html>
```
-http://localhost:8090/pro12/hello2.jsp?age=22로 요청합니다.

3. 표현식 사용하기

표현식은 JSP 페이지의 정한 위치에 값을 출력하는 기능.즉, JSP페이지에서 변수 메서드의 결과값 등을 브라우저에 출력하는 용도로 사용.
<%= 값 or 자바변수 or 자바 식 %> ; 이 있으면 안됨.

