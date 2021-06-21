# 스크립트 요소 이용해 실습하기
1. 로그인 예제
로그인 창에서 ID와 비밀번호를 입력한 후 JSP로 전송하여 출력하는 예제.

2. login.html 작성. 로그인창에서 ID와 비밀번호를 입력한 후 action의 result.jsp로 전송.
```html
<!DOCTYPE html>
<html>
  <body>
    <form name ="frmLogin" method="post" action ="result.jsp" encType="utf-8">
      아이디 :<input type ="text" name="user_id"><br>
      비밀번호: <input type="password" name ="user_pw"><br>
      <input type="submit" value ="로그인">
      <input type ="reset" value- "다시입력">
    </form>
  </body>
</html>


```

3. 스크립트릿을 이용해 전송된 ID와 비밀번호를 가져온 후 표현식을 이용해 변수의 값을 출력.

```jsp
<%@ page language="java" contentType="text/html;charset="UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title> 결과 출력창 </title>
</head>
<body>
  <h1> 결과 출력</h1>
  
<% 
  request.setCharacterEncoding("utf-8");
  String user_id = request.getParameter("user_id");
  String user_pw = request.getParameter("user_pw");
%>
  <h1> ID: <%= user_id %></h1>
  <h1> PW: <%= user_pw %></h1>
</body>
</html>
```

4. 스크립트릿 안에 자바코드를 사용해 ID가 정상적으로 입력되었는지 체크한 후 정상 입력 여부에 따라 동적으로 다른 결과를 출력하도록 구현.

```jsp
<% if(user_id == null || user_id.length()==0{
%>
  ID.<br>
  <a href ="/pro12/login.html">로그인하기</a>
  <%
   }else{
  %>
  <h1> HI <%= user_id %></h1>
  <%
  }
  %>


```
