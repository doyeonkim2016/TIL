# Servlet 3

## 웹 브라우저에서 서블릿으로 데이터 전송하기

### GET/Post전송

1. GET방식은 URL주소 뒤에 데이터를 붙여서 전송한다
2. POST방식은 전송하는 데이터를 숨겨서 전송하므로 보안성이 좋다.

| GET         | POST        |
| ----------- | ----------- |
|  서블릿에 데이터를 전송할 때는 데이터가 URL뒤에 name= value 형태로 됨| 서블릿에 데이터를 전송할 때는 TCP/IP 프로토콜 데이터의 HEAD영역에 숨겨진채 전송됨     |
|  여러개의 데이터를 전송할 때는 &로 구분해서 전송한다   | 전송 시 서블릿에서는 또다시 가져오는 작업을 해야하므로 처리 속도가 GET보다는 느리다.|
|  웹 브라우저에 직접 입력해서 전송가능|서블릿에서는 doPost()를 이용해 데이터를 처리함|

## GET 방식과 POST방식 요청 동시에 처리하기
-doHandle
-doHandle(request,response)로 GET,POST둘다 모든방식의 요청 처리가능..


## 자바스크립트로 서브릿에 요청하기

앞절에서는 <form> 태그에서 바로 서블릿으로 데이터를 전송했지만 전송전에 로그인하면 ID와 비밀번호 입력 유무 체크하기처럼 전송데이터에 대해 유효성 검사를 하는 경우가 많습니다.
서블릿에 요청할때 <form>태그에서 직접 요청하는 것이 아니라 자바스크립트 함수를 호출하고 유효성 검사를 항 후 자바스크립트 함수에서 서블릿에 요청하는 예제 
   
```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <script type ="text/javascript">
       function fn_validate(){
            var frmLogin = document.frmLogin;
            var user_id = frmLogin.user_id.value;
            var user_pw = frmLogin.user_pw.value;
        
            if((user_id.length ==0 || user_id ==""_|| user_pw.length==0 || user_pw ==""){
                alert("ID and PW ");
            }else{
                fromLogin.method="post"
                frmLogin.action= :"login5:l
                frmLogin.submit();
            }
        
      }
        
    </script>
    
```
