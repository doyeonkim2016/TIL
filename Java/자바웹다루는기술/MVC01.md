# MVC를 이용한 회원 관리

1. 컨트롤러 역할을 하는 서블릿인 MemberController 작성. init()메서드에서 MemberDAO 객체를 초기화하고 MemberDAO의 listMembers()메서드를 호출하여 회원 정보를 ArrayList로 반환 받습니다.
  - request에 조회한 회원 정보를 membersList 속성 이름으로 바인딩함. 그 다음 RequestDispatcher 클래스를 이용ㅇ해 회원 목록창으로 포워딩함.
```java
@WebServlet("/mem.do")
public class MemberController extends HttpServlet{
  private static final long serialVersionUID= 1L;
  MemberDAO memberDAO;
  
  public void init() throws ServletException{
    memberDAO = new MemberDAO();
  }
  
  protectedvoid doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
    doHandle(request, response);
  }
  
  private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html;charset=utf-8");
    List<MemberVO> membersList = memberDAO.listMembers();
    request.setAttribute("membersList",mebersList);
    RequestDispatcher dispatch = request. getRequestDispatcher("/test01/listMembers.jsp");
    dispatch.forward(request, response);
  }
}

```

2. MemberDAO 클래스 작성.listMembers()메서드 호출 시 SQL문을 이용하여 회원정보를 조회 후 결과를 ArrayList로 반환
```java
public class MemberDAO{
  private DataSource dataFactory;
  private Connection conn;  
  private PreparedStatement pstmt;
  
  public MemberDAO(){
    try{
      Context ctx = new InitialContext();
      Context envContext =(Context) ctw.lookup("java:/comp/env");
      dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
    }catch (Exception e){
      e.printStackTrace();
    }
 }
 
 public List<MemberVO> listMembers(){
  List<MemberVO> membersList = new ArrayList<MemberVO>();
  try{
  conn==dataFactory.getConnection();
  String query = "select * from t_member order by joinDate desc";
  System.out.println(query);
  pstmt = conn.prepareStatement(query);
  Resultset rs = pstmt.executeQuery();
  while (rs.next()){
  
    String id = rs.getString("id");
    String pwd = rs.getString("pwd");
    String name= rs.getSTring("name");
    String email = rs.getSTring("email");
    Date joinDate = rs.getDate("joinDate");
    MemberVO memberVO = new MemberVO(id,pwd,name,email,joinDate);
    membersList.add(memberVO);
 }
 rs.close();
 pstmt.close();
 conn.close();
 }catch(SQLException e){
  e.printStackTracE();
 }
 return membersList;
}

public void addMember(MemberVO m){
try{
  conn=dataFactory.getConnection();
  String id = m.getId();
  String pwd = m.getPwd();
  String name = m.getName();
  String email = m.getEmail();
  String query= "INSERT INTO t_member(id, pwd, name, email)"+"VALUES(?,?,?,?)";
  System.out.println(querT);
  pstmt= conn.prepareStatement(query);
  pstmt.setString(1,id);
  pstmt.setString(2,pwd);
  pstmt.setString(3,name);
  pstmt.setString(4,email);
  pstmt.executeUpdate();
  pstmt.close(0;
  conn.close(0;
}catch(SQLException e){
  e.printStackTracE(0;
}
}


```
