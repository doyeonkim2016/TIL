1. 글쓰기와 관련된 JSP 페이지 작성. listArticles.jsp 작성

```jsp
<a class "cls1" href="${contextPath}/board/articleForm.do">
  <p class ="cls2">글쓰기</p>
</a>

```

2. articleForm.jsp를 작성. 글쓰기 작업 할 때 첨부 파일도 같이 업로드 할 수 있도록 <form> 태그의 enctype속성을 multipart/form-data로 설정
  
```jsp
<body>
  <h1 style ="text-align:center"> 새글 쓰기 </h1>
  <form name  ="articleForm" method ="post" actrion ="${contextPath}/board/addArticle.do" enctype ="multipart/form-data">
    <table border ="0" align ="center">
       <tr>
         <td align ="right">글제목:  </td>
         <td colspan="2"><input type ="text" size "67" maxlength ="500" name ="title"/></td>
      </tr>
      <tr>
        <td align ="right" valign ="top"><br>글내용: </td>
        <td colspan =2><textarea name ="content" row = "10" cols"65" maxlength ="4000"></textarea></td>
      </tr>
      <tr>
        <td align ="right">Image</td>
        <td> <input type ="file" name ="imageFileName onchange ="readURL(this;"/></td>
        <td><img id="preview" src ="3" width = 200 height =200/></td>
      </tr>
      <tr>
          <td align ="right"> </td>
          <td colspan ="2">
          <input type ="submit value ="글쓰기"/>
          <input type = button value ="List" onClick = backToList(this.form)"/>
          </td>
      </tr>
    </table>                                                                   
    </form>                                                          
   </body>                                                                           
```
