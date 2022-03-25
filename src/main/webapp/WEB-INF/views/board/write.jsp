<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<title>글쓰기</title>
<style>
	.lightgray{background-color: #d3d3d3;}
	table{border-collapse : collapse;}
</style>
</head>
<body>
<form method="post" id="writeForm">
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
			<td><textarea name="content" cols="40" rows="10"></textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="새글 등록"> 
			</td>
		</tr>
	</table>

</form>

</body>
</html>