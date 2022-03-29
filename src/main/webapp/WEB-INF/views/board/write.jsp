<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>글쓰기</title>
<style>
	.lightgray{background-color: lightgray; width: 50px;}
	table{border-collapse : collapse; width: 800px;}
</style>
</head>
<body>
<h3>글쓰기</h3>
<form method="post" id="writeForm" action="/board/write">
	<table border="1">
		<tr>
			<td class="lightgray">제목</td>
			<td><input name="title"/></td>
		</tr>
		<tr>
			<td class="lightgray">작성자</td>
			<td><input name="id" value="${user.id}" readonly></td>
		</tr>
		<tr>
			<td class="lightgray">내용</td>
			<td><div id="smarteditor">
			<textarea name="content" id="editorTxt" cols="40" rows="10" placeholder="내용을 입력해주세요"
                  style="width: 700px"></textarea>
			</div></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="button" id="save" value="새글 등록"> 
			</td>
		</tr>
	</table>

</form>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="/smarteditor/js/HuskyEZCreator.js" charset="utf-8"></script>

<script>
     let oEditors = []

    smartEditor = function() {
      //console.log("Naver SmartEditor") 없어도 됨
      nhn.husky.EZCreator.createInIFrame({
        oAppRef: oEditors,
        elPlaceHolder: "editorTxt",
        sSkinURI: "/smarteditor/SmartEditor2Skin.html",
        fCreator: "createSEditor2"
      })
    } 

    $(document).ready(function() {
  
      smartEditor() 
      
      $("#save").click(function(){
    	  oEditors.getById["editorTxt"].exec("UPDATE_CONTENTS_FIELD", []);
    	  $("#writeForm").submit();
      });
      
    })
  </script>
</body>
</html>