# Filter API
- 필터란 브라우저에서 서블릿에 요청하거나 응답할 때 미리 요청이나 응답과 관련해 여러가지 작업을 처리하는 기능입니다.
- 필터는 용도에 따라 크게 요청 필터와 응답 필터로 나뉘며 다음과 같은 API가 있습니다.
- 요청필터 ( 사용자 인증 및 권한 심사, 요청시 요청 관련 로그 작업, 인코딩)
- 응답필터 ( 응답 결과에 대한 암호화 작업, 서비스 시간 측정)
- 필터 관련 API -> javax.servlet.(Filter,FilterChain,FilterConfig)


1. 사용자 정의 Filter 만들기
사용자 정의 필터는 반드시 Filter 인터페이스를 구현해야합니다. 그리고 init() ,doFilter(),destroy()의 추상 메서드를 구현해 주어야 합니다.필터를 매핑하는 방법은 두가지
-Annotation
-Web.xml에 설정

A. login.html 작성
B. @WebFilter애너테이션으로 필터 생성확인
C. EncoderFilter클래스 작성. 사용자 정의 필터 클래스는 반드시 Filter인터페이스를 구현해야 합니다. 브라우저 요청시 doFilter()메서드의 매개변수로 request와 response 가 전달되며, doFilter() 메서드는 FilterChain 타입인 chain을 세번째 매개변수로 가진다.

```java

@WebFilter("*/")// WebFilter 애너테이션을 이용해 모든 요청이 필터를 거치게 합니다.
public class EncoderFilter implements Filter{
  Servletcontext context;
  public void init(FilterConfig fConfig) throws ServletException{
    context = fConfig.getServletContext();
  }
  
  public void doFilter(Servletrequest request, ServletResponse response, FilterChain chain) throws ServletException,IOException{
    request.setCharacterEncoding ("utf-8");
    String context (HttpServletrequest)request).getcontextPath();
    String pathinfo =(HttpServletReqeust)reqeust).getRequestURI();
    String realPath= request.getRealPath(pathinfo);
    long begin = System.currentTiemMillis();
    chain.doFilter(request,response)
    long end = System.currentTimeMillis();
    System.out.println((end-begin)+"ms");
 }
}
```


