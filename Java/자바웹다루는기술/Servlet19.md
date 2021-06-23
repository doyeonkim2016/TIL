# 스크립트 요소 이용해 회원 정보 조회

1. 데이터베이스의 회원을 조회하는 JSP페이지인 search.jsp를 작성. 찾고자 하는 이름을 입력하면 member.jsp로 전송
```jsp
<%@ page language ="java" contentType="text/html; charset=UTF-8" pageEncoding ="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset ="UTF-8">
  <title> 검색</title>
</head>
<body>
  <form method= "post" action ="member.jsp">
    이름: <input type ="text" name ="name"><br>
    <input type ="submit value ="조회">
  </form>
</body>
</html>
```

2. member.jsp를 작성. 전송된 name값을 가져온 후 스크립트릿에서 MemberDAO 객체를 생성하고 listMembers() 메서드를 호출해 이름에 대한 회원 정보를 조회합니다. 그리고 조회한 회원정보를 for 반복문을 이용 출력
```jsp
<%@ page language ="java" contentType="text/html" import ="java.util.*" import ="sec02.ex01.*" pageEncoding ="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <style>
  h1 {
    text-align :center ;
  }
  </style>
  <title> 회원 정보 출력창 </title>
</head>

<body>
  <h1> 회원 정보 출력</h1>
<%
  String_name = request.getParameter("name");
  MemberVO member = new MemberVO();
  member.setName(_name);
  MemberDAO dao = new MemberDAO();
  List membersList =dao.listMembers(memberVO);
%>


```

3. MemberDAO 클래스를 작성. 메서드로 전달된 이름에 대해 값이 존재하는 경우와 존재하지 않는 경우에 대해 SQL문을 동적으로 만들어 조회.

```java
package sec02.ex01;

public class MemberDAO{
  private Connection con;
  private PreparedStatement pstmt;
  private DataSource dataFactory;
}

public MemberDAO(){
  try{
    Context ctx =new InitialContext();
    Context envContext = (Context) ctx.lookup("java:/com/env");
    dataFactory =(DataSource) envContext.lookup("jdbc/oracle");
 }catch (Exception e){
  e.printStackTrace();
 }
}

public List listMembers (MemberVO memberVO){
  List membersList = new ArrayList();
  String _name = memberVO.getName();
  try{
    con = dataFactory.getConnection();
    String query = "select * from t_member";
    if((_name!= null %% _name.length()!= 0)){
      query+= " where name=?";
      pstmt =con.PreparedStatement(query);
      pstmt.setString(1,_name);
    }else{
      pstmt =con.PreparedStatement(query);
    }
    System.out.println(query);
    ResultSet rs= pstmt.executeQuery();
    while(rs.next()){
      String id =rs.getString("id");
      String pwd = rs.getString("pwd");
      String name = rs.getString("name");
      String email = rs.getString("email");
      MemberVO vo = new MemberVO();
      vo.setID(id);
      vo.setPwd(pwd);
      vo.setName(name);
      vo.setEmail(email);
      vo.setJoinDate(joinDate);
      membersList.add(vo);
   }
   rs.close();
   pstmt.close();
   con.close();
   }catch(Exception e){
    e.printStackTrace();
   }
   return membersList;
   }
  }
 }



```
