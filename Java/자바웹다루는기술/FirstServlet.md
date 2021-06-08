
서블릿은 서버쪽에서 실행되면서 클라이언트의 요청에따라 동적으로 서비스를 제공하는 자바 클래스.
서블릿은 자바로 작성되어잇으며, 자바의 일반적인 특징을 모두 가진다.
서블릿은 서버에서 실행되다가, 웹브라우저에서 요청을 하면 해당 기능을 수행한 후 웹 브라우저에 결과를 전송한다.
클라이언트가 웹서버에 요청하면 웹 서버는 그 요청을 톰캣과 같은 웹 애플리케이션 서버에 위임. 그러면 WAS는 각 요청에 해당하는 서블릿을 실행.

## 특징

1.서버쪽에서 실행되면서 기능을 수행
2.기존의 정적인 웹 프로그램의 문제점을 보완하여 동적인 여러가지 기능 제공
3.스레드 방식으로 실행
4.자바로 만들어져 자바의 특징 가짐
5.컨테이너에서 실행
6.컨테이너 종류에 상관없이 실행
7.보안기능 적용하기 쉬움
8.웹 브라우저에서 요청 시 기능을 수행

## 서블릿의 생명주기 메서드

서블릿도 자바 클래스 이므로 실행하면 당연히 초기화 과정 그리고 메모리에 인스턴스를 생성하여 서비스를 수행한 후 다시 소면하는 과정을 거친다.
이 과정을 거칠 때마다 서블릿 클래스의 ㅁ서드가 호출되어 초기화, 데이터 베이스 연동, 마무리 작업 수행.

init()- 서블릿 요청 시 맨 처음 한 번만 호출됨,서블릿 생성시 초기화 작업을 주로 수행
doGet(),doPost()- 서블릿 요청 시 매번 호출됩니다. 실제로 클라이언트가 요청하는 작업을 수행
destroy() - 서블릿이 기능을 수행하고 메모리에서 소멸될 때 호출됩니다. 서블릿의 마무리 작업을 주로 수행.

## FirstServlet 을 이용한 실슴
1. 사용자 정의 서블릿 클래스 만들기
 - 실제 웹 프로그래밍에서 사용되는 사용자 정의 서블릿은 HttpServlet 클래스를 상속받아서 만든다. 오버라이딩 가능

2. 서블릿 생명주기 메서드 구현
- Class Path 설정하기-Add servlet-api.jar in Tomcat9 file.

```java
package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet.Reseponse;

public class FirstServlet extends HttpServlet{
  @Override
  public void init() throws ServletException{
    System.out.println("init Method");
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp){
    throws ServletException, IOException{
      System.out.println("doGet Method");
  @Override
  public void destroy(){
    System.out.println("destroy Method");
  }
}
```

3. 서블릿 매핑 작업
- 각 프로젝트에 있는 web.xml에 설정
- <servlet>태그와 <servlet-mapping> 태그 이용
- 여러개의 서블릿 매핑 시에는 <servlet> 태그를 먼저 정의하고 <servlet-mapping> 태그를 정의
 
```xml
<servlet>
  <servlet-name> aaa</servlet-name>
  <servlet-class>sec01.ex01.FirstServlet</servlet-class>
</servlet>
  
<servlet-mapping>
  <servlet-name>aaa</servlet-name>
  <url-pattern>first</url-pattern>
</servlet-mapping>
```
- 웹 브라우저에서 /first로 요청할 경우 aaa값을 가지는 servlet 태그를 찾아 실제 서블릿인 sec01.ex01.FirstServlet을 실행

4. 웹 브라우저에서 서블릿 매핑 이름으로 요청하기

  
## 서블릿 동작 과정
  - 클라 1이 요청하면 톰캣은 FirstServlet 이 메모리에 로드되어있는지 확인. init() -> doGet()-> doPost()
  - 클라 2 가 다시 동일한 서블릿을 요청하면 톰캣은 다시 FirstServlet이 메모리에 로드 되어있는지 확인. 결국 init() 미실행 
  - 메모리에 존재하는 서블릿을 재사용 함으로써 훨씬 빠르고 효율 적으로 동작

## Annotation 
 ```java
  @WEbServlet("/first");
  public class firstServlet extendsHttpServlet{
  ...
  }
```
  
