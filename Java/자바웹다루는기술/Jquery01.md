# ID 중복 여부 확인하기.
1. MemberServlet 클래스 작성. 클라이언트에서 Ajax로 전송된 ID를 받아서 MemberDAO의 overlappedID() 메서드로 전달. 그리고 그 결과를 이용해 클라이언트에게 다른 메세지 전달.
```java
@WebServlet("/mem")
public class MemberServlet extends HttpServlet{
  private void doHandle(HttpServletRequest request, HttpServletResponse response) throws Servlet Exception,IOException{
    request.setCharacterEncoding("utf-8");
    response.setContentType("text/html");
    PrintWriter writer = response.getWriter();
    String id =(String)request.getParameter("id");
    MemberDAO memberDAO = new MemberDAO();
    boolean overlappedID = memberDAO.overlappedID(id);
    
    if(overlappedID == true){
      writer.print("not usable");
    }else{
      writer.print("usable");
    }
  }
}


```
2. MemberDAO 작성. 서블릿에서 전달된 ID로 SQL문의 조건식에 설정한 후 ID에 대한 회원 정보를 조회하여 그 결과를 true또는 false 로 반환
```java
public class MemberDAO{
  boolean result =false;
  try{
    con = dataFactory.getConnection();
    String query = "select decode(count(*), 1,'true','false') as result from t_member";
    query += "where id=?"
    System.out.println("prepareStatement:" + query);
    pstmt = con.prepareStatement(query);
    pstmt.setString (1,id);
    ResultSet rs= pstmt.executeQuery();
    rs.nexT();
    result = Boolean.parseBoolean(rs.getString("result"));
    pstmt.close();
  }



```

3. ID 중복체크하기 
```html
<script type="text/javascript">
  function fn_process(){
  var_id =$("#t_id").val();
  if(_id == ''){
    alert("ID를 입력");
    return ;
  }
  $.ajax({
    type:"post",
    async: true,
    url :"http://localhost:8090/pro16/mem",
    dataType="text",
    data: {id: _id},
    success: function (data, textStatus){
      if(data =='usable'){
        $('#message').text("Cannot use");
        $('#btn_duplicate').prop("disabled",true);
    }else{
      $('#message').text("can use");
    }
  },
</script>
</head>
<body>
   <input type="text" id ="t_id" />
   <input type="button" id ="btn_duplicate" value ="ID doublecheck" onClick ="fn_process()/>
   <div id ="message"></div>
</body>
</html>
                 

```
