# 쿠키를 이용한 웹 페이지 연동 기능

1. 쿠키란?(COOKIE)

  - 웹 페이지들 사이의 공유 정보를 클라이언트 PC에 저장해 놓고 필요할 때 여러 페이지들이 공유해서 사용할 수 있도록 매개 역할을 하는 방법.
  - 정보가 클라이언트 PC에 저장됩니다.
  - 저장 정보 용량에 제한이 있습니다.(4kb)
  - 보안이 취약합니다.
  - 클라이언트 브라우저에서 사용 유무를 설정할 수 잇습니다.
  - 도메인당 쿠키가 만들어집니다. [웹 사이트당 하나의 쿠키가 만들어집니다]
  - 쿠키는 클라이언트 PC에 정보를 저장해서 사용하므로 보안에 취약합니다. 보안과 무관한 경우에 사용.
  
 2. 쿠키 기능 실행 과정
 
  - 브라우저로 사이트에 접속합니다.
  - 서버는 정보를 저장한 쿠키를 생성합니다.
  - 생성된 쿠키를 브라우저로 전송합니다.
  - 브라우저는 서버로부터 받은 쿠키 정보를 쿠키파일에 저장합니다.
  - 브라우저가 다시 접속해 서버가 브라우저에게 쿠키전송을  요청하면 브라우저는 쿠키정보를 서버에 넘겨줍니다.
  - 서버는 쿠키정보를 이용해 작업을 합니다.
  
 3. 쿠키 API
 
  -실제로 서블릿에서 쿠키 기능 사용 시 이와 관련된 API에 대해 알아보자.쿠키는 Cookie 클래스 객체를 생성하여 정보를 저장한 후 클라이언트로 전송해 파일로 저장.
  
  - javax.sevlet.http.Cookie를 이용합니다.
  - HttpServletResponse 의 addCookie()메서드를 이용해 클라이언트 브라우저에 쿠리를 전송한 후 저장합니다.
  - HttpServletRequest 의 getCookie() 메서드를 이요해 쿠키를 서버로 가져옵니다.
  
  4. 서블릿에서 쿠키 사용하기
  
  - GetCookieValue, SetCookieValue 클래스 파일을 준비합니다.
  - SetCookieValue 클래스를ㄹ 다음과 같이 작성합니다. Cookie 객체를 생성한 후 쿠키 이름을 cookieTest로 값을 저장합니다.
  - setMaxAg() 메서드에 쿠키 유효 시간을 24시간으로 설정 다음 response의 addCookie()메서드를 이용해 생성된 쿠키를 브라우저로 전송
  
  ```java
  //setcookieValue
  WebServlet("/set")
  public class SetCookieValue extends HttpServlet{
    protetcted void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
      response.setContentType("text/html;charset=utf-8")
      PrtintWriter out = response.getWriter();
      Date d = new DAte();
      //쿠키 객체를 생성하고 cookieTest이름으로 쿠키에 저장.
      Cookie c = new Cookie("cookieTest",URLEncoder.encode("JSP","utf-8");
      c.setMaxAge(24*60*60);
      response.addcookie(c);
    }
  }
  ```
  
5. GetCookieValue 클래스를 다음과 같이 작성합니다.request의 getcookiser() 메서드를 호출해 브라우저로부터 쿠키를 전달 받습니다. 전달된 쿠키에서 저장할 때 사용한 이름인 cookieTest로 검색해 값을 가져옵니다.
```java
@WebServlet("/get")
public class GetcookieValue extends HttpServlet{
  protected void doGet(HttpServletREquest request,HttpSErvletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter9);
    Cookie[] allValues = request.getCookies()
    for(int i =0 ; i <allValues.length ; i++){
    if(allValues[i].getName().equals("cookieTest")){
      out.println(URLDecoder.decod(allValues[i].getValue(),"utf-8");\
    }
  }
}
```
6. 세션 쿠키 사용하기
- 다음은 쿠키를 파일에 저장하는 것이 아닌, 브라우저가 사용하는 메모리에 저장하는 Session 쿠키를 만들어보겠습니다.
- 다음과 같이 Cookie의 setMaxAge() 메서드를 이요해 유효시간을 -1로 설정하면 세션 쿠키가 생성됩니다.

```java
  //setcookieValue
  WebServlet("/set")
  public class SetCookieValue extends HttpServlet{
    protetcted void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
      response.setContentType("text/html;charset=utf-8")
      PrtintWriter out = response.getWriter();
      Date d = new DAte();
      //쿠키 객체를 생성하고 cookieTest이름으로 쿠키에 저장.
      Cookie c = new Cookie("cookieTest",URLEncoder.encode("JSP","utf-8");
      c.setMaxAge(-1);
      response.addcookie(c);
    }
  }
```

7. 쿠키 이용해 팝업창 제한하기
- 쿠키를 이용해 팝업창을 제한하는 기능을 구현해 보겠다. 팝업창 제어는 서버에서 쿠키를 다루지 않고 자바스크립트를 이용해 쿠키에 직접 접근한다.
- 먼저 popupTest.html을 다음과 같이 작성한다. 웹페이지가 브라우저에 로드될때 pageLoad()함수를 호출한 후 쿠키에 접근해 팝업창 관련 정보를 가져옵니다. getCookieValue()함수를 호출하여 쿠키이름 notShowPop 의 값이 true가 아니면 팝업창을 나타낸다.
```html
<html>
  <head>
    <meta charset="UTF-8">
    <title> 자바스크립트의 쿠키사용</title>
    <script type= "text/javascript">
      //브라우저에 웹페이지가 로드될 때 pageLoad 함수를 호출하여 실행합니다.
      window.onload=pageLoad;
      function pageLoad(){
        notShowPop = getCookieValue();
        if(notShowPop!="true"){
          window.open("popUp.html","pop""width =400,height=500,history=no,resizeable =no, status =no,scrollbars=yes,menubar=no");
        }
      }
      
      


```

