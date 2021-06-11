# 서블릿의 비즈니스 로직 처리 방법

서블릿 비즈니스 처리 작업이란 서블릿이 클라이언트로부터 요청을 받으면 그 요청에 대해 작업을 수행하는 것을 의미한다.
웹 프로그램에서 대부분의 비즈니스 처리 작업은 데이터베이스 연동 관련 작업이지만 그 외에 다른 서버와 연동해서 데이터를 얻는 작업도 수행.

## 서블릿으로 회원정보 테이블의 회원정보 조회
1. 웹 브라우저가 서블릿에게 회원 정보를 요청합니다.
2. MemberServlet은 요청을 받은 후 MemberDAO 객체를 생성하여 listMembers() 메서드를 호출합니다.
3. listMembers()에서 다시 connDB() 메서드를 호출하여 데이터베이스와 연결후 SQL실행
4. 조회된 회원 정보를 MemberVO 속성에 설정한 후 다시 ArrayList에 저장
5. ArrayList를 다시 메서드를 호출한 MemberServlet으로 반환한 후 ArrayList의 MemberVO를 차례대로 가져와 회원 정보를 HTML태그의 문자열로 만든다
6. 만들어진 HTML태그를 웹 브라우저로 전송해서 회원 정보를 출력

### 브라우저의 요청을 받는 MemberServlet
```java
package sec01.ex01;

@WebServlet("(/member")
protected class MemberServlet extends HttpServlet{
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter();
    MemberDAO dao = new MemberDAO();
    List<MemberVO> list = dao.listMembers();
    
    for(int i=0; i < list.size(); i++){
      MemberVO memberVO = list.get(i);
      String id = memberVO.getId();
      String pwd = memberVO.getPwd();
      String name = memberVO.getName();
      String email = memberVO.getEmail();
      Date joinDate = memberVO.getJoinDate();
    }
  }
}

```
### MemberDAO 클래스를 다음과 같이 작성
```java
package sec01.ex01;

public class MemberDAO{
  private Statement stmt;
  private Connection con;
  
  public List<MemberVO> listMembers(){
    List<MemberVO> list = new ArrayList<MemberVO>();
    try{
      connDB();
      String query = "select * from t_member";
      ResultSet = rs = stmt.executeQuery(query);
      while(rs.next()){
        String id = rs.getString("id");
        String pwd = rs.getString("pwd");
        MemberVO vo = new MemberVO();
        vo.setId(id);
        vo.setPwd(pwd);
        list.add(vo);
      }
      rs.close();
      stmt.close();
      con.close();
      }catch(Exception e){
        e.printStackTrace();
      }
      return list;
     }
     
    private void connDB(){
      try{
        Class.forName(driver);
        con= DriverManager.getConnection(url,user,pwd);
        stmt=con.createStatement();
      }catch(Exception e){
        e.printStackTrace();
      }
    }
  }
  
```

### MemberVO 클래스를 다음과 같이 작성. 이는 값을 전달하는데 사용되는 VO(Value Object)클래스
```java
import java.sql.Date;

public class MemberVO{
  private String id;
  private String pwd;
  private String name;
  private String email;
  private Date joinDate;
}
public MemberVO(){
}
//getter and setter for all the variables.

```








