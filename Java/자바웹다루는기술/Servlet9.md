1. <hidden> 태그와 URL Rewriting 이용해 웹 페이지 연동하기
- <hidden> tag는 브라우저에는 표시되지 않지만 미리 저장된 정보를 서블릿으로 전송할 수 있습니다. 
 
- login.html을 작성. 로그인창에서ID와 비밀번호를 입력하면 미리 <hidden>태그에 저장된 주소, 이메일, 휴대폰 번호를 서블릿으로 전송한다.
  
```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title> 로그인창</title>
</head>
<body>
  <form name = "frmLogin" method ="post" action = "login" encType= "UTF-8">
    아이디: <input type= "text" name = "user_id"><br>
    비밀번호: <input type="password" name = "user_pw"><br>
    <input type ="submit" value= "로그인">
    <input type ="reset" value="다시 입력">
    <input type ="hidden" name ="user_address" value ="Seoul"/>
    <input type ="hidden" name ="user_email" value="test@gmail.com"/>
    <input type ="hidden" name = "user_hp" value ="000000"/>
  </form>
 </body>
</html>
  
    
```
  
  
2. LoginServlet 클래스를 다음과 같이 작성한다. getParameter() 메서드를 이용해 전송된 회원 정보를 가져온 후 브라우저로 다시 출력한다.
  
```java

String user_pw = request.getParameter("user_pw");
String user_address =request.getParameter("user_address");
  
```
