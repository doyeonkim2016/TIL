# JSP에서 파일 업로드.
1. 파일 업로드 라이브러리 설치  -jakarta.apache.org -> FileUpload -> 프로젝트의 WEB-INF 하위에 있는 lib 폴더에 붙여 넣는다.

2. 파일 업로드 관련 APi
 - 파일 업로드 라이브러리에서 제공하는 클래스에는 DiskFileItemFactory, ServletFileUpload 가 있다.
 - setRepository() 파일을 저장할 디렉터리를 설정합니다. (DiskFileItemFactory)
 - setSizeThreadhold () 최대 업로드 가능한 파일 크기 설정 (DiskFileItemFactory)
 - parseRequest() 전송된 매개변수를 List 객체로 얻습니다. (ServletFileUpload)
 - getItemIterator() 전송된 매개변수를 Iterator 타입으로 얻습니다. (ServletFileUpload)

3. UploadForm.jsp - 파일 업로드창에서 파일을 업로드할 때 <form> 태그의 encType 속성은 반드시 multipart/form-data로 지정하기

  
```jsp
<body> 
  <form action ="${contextPath}/upload.do"
        method ="post" enctype ="multipart/form-data">
   파일1 : <input type ="file" name ="file1" ><br>
   파일2 : <input type ="file" name ="file2" ><br>
   매개변수 :<input type ="text" name ="param1"><br>
   매개변수 :<input type ="text" name ="param2"><br>
   매개변수 :<input type ="text" name ="param3"><br>
   <input type ="submit" value= "업로드">
 </form>
</body>  
```
4. 파일 업로드를 처리하는 서블릿인 FileUpload클래스를 다음과 같이 작성합니다. 라이브러리 에서 제공하는 DiskFileitemFactory클래스를 이용해 저장위치와 업로드 가능한 최대 파일크기 설정. 그리고 ServletFileUpload클래스를 이용해서 파일 업로드창에서 업로드 된 파일과 매개변수에 대한 정보를 가져와 파일을 업로드 하고 매개변수 값을 출력
 
```java
package sec01.ex01;
 
@WebServlet("upload.do")

public class FileUpload extends HttpServlet{
 proteted void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
  doHandle(request,response);
 }
 protected void doPost(HttpServletRequest request, HttpSErvletResponse response)throws ServletException, IOException{
  doHandle(request,response);
 }
 private void doHandle(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
  request.setCharacterEncoding("utf-8");
  String encoding ="utf-8";
  File currentDirPath =new File("C:\\file_repo");
  DiskFileItemFactory factory = new DiskFileItemFactory);
  factory.setRepository(currentDirPath);
  factory.setSizeThreshold(1024*1024);
  ServletFileUpload upload = new ServletFileUpload(factory);
  try{
   List items = upload.parseRequest(request);
   for(int i= 0; i< items.size() ;i++){
     FileItem fileItem =(FileItem) items.get(i);
     if(fileItem.isFormField()){
      System.out.println(fileItem.getFieldName);
     }else{
       if(fileItem.getSize() >0){
         int idx = fileItem.getName().lastIndexOf("\\");
         if( idx ==1){
           idx = fileItem.getName().lastIndexOf("/");
         }
         String fileName = fileItem.getName().substring(idx+1);
         File uploadFile = new File(currentDirPath +"\\"+fileName);
         fileItemm.write(uploadFile);
         }
      }
   }
 }catch(Exception e){
  e.printstackTrace();
}
}
```
# JSP 파일 다운로드
1. JSP에서 다운로드할 ㅇ미지 파일 이름은 두번째 JSP로 전달하도록 first.jsp를 작성
```jsp
<body>
 <form method ="post" action ="result.jsp">
  <input type=hidden name ="param1" value="duke.png"/> <br>
  <input type=hidden name ="param2" value ="duke2.jpg" /> <br>
 </form>
</body>
```

2. result.jsp작성 이미지 파일 표시창에서 <img> 태그의 src속성에 다운로드를 요청할 서블릿 이름 download.do 와 파일 이름을 GET방식으로 전달합니다.
 
```jsp
<%@ page language ="java" contentType="text/html; charset=UTF-8" pageEncoding ="UTF-8" isELIgnored="false"%>
<%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<c:set var = "contextPath" value ="${pageContext.request.contextPath}" />
<% request.setCharacterEncoding("utf-8"); %>
 
<html>
 <head>
  <c:set var ="file1" value ="${param.param1}" />
  <c:set var ="file2" value ="${param.param2}" />
  <title> 이미지 파일 출력</title>
 </head>
<body>
 <c: out value ="${file1} /><br>
 <c: out value ="${file2}" /><br>
 <c: if test ="${not empty file1 }">
   <img src ="${contextPath}/download.do?fileName=${file1}" width=300 height=300/><br>
 </c:if>
 <br>
</body>
</html>                                                       
```
3. 파일 다운로드 기능을 할 서블릿인 FileDownload 클래스를 다음과 같이 작성.파일 다운로드 기능은 자바 IO를 이용하여 구현. 먼저response.getOutputStream()l를 호출해 OutputStream을 가져온다.그리고 배열로 버퍼를 만든 후 while 반복문을 이용해 파일에서 데이터를 한번에 8kb씩 버퍼에 읽어온다.
                
