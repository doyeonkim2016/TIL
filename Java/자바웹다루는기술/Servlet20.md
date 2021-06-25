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
 
```



