# JSP 페이지 구성 요소

- JSP의 동작 원리를 알았으니 이번에는 JSP에서 HTML태그와 같이 사용되는 여러가지 JSP구성 요소들의 기능을 알아보자.

1. Directive Tag
JSP페이지의 전반적인 정보를 설정할 때 사용합니다.

2. Include Directive Tag
공통으로 사용하는 JSP페이지를 다른 JSP페이지에 추가할 때 사용합니다.

3. TagLib Directive Tag
개발자나 프레임워크에서 제공하는 태그를 사용할 때 사용합니다.


``` jsp
//Hello2.jsp
<%@ page language="java" contentType ="text/html; charset=UTF-8" pageEncoding ="UTF-8"\
    import ="java.util.*" language ="java" session ="true" buffer="8kb" autoFlush ="true" isThreadSafe ="true" isErrorPage ="false" 
    errorPage = "" %>
<html>
  <head>
    <meta charset="UTF-8">
    <title> 첫번째 JSP페이지 </title>
  </head>
  <body>
    <h1> Hello JSP!</h1>
    <h1> JSP 실습입니다!.</h1>
  </body>
</html>
```

- hello2.jsp 를 브라우저에서 요청시 톰캣 컨테이너는 JSP 파일을 자바 파일로 변환합니다.


4.Include Directive tag 정의와 사용법
JSP페이지로 웹페이즈를 만들다 보면 제목이나 로고를 표시하는 상단, 메뉴를 표시하는 왼쪽 단은 화면이 바뀌더라도 일정하게 유지도니느 경우가 많습니다.





