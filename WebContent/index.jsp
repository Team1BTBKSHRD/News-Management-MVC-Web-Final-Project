<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#btnclick").click(function() {
			test();
			//alert(1212);
		});
	});
	function test(){
		$.post("newsCategory.news", {
		}, function(data) {
			alert(data.myArrayList[1].map.subcategory);
		});
	}
</script>
</head>
<body>
	<form>
		input : <input type="text" id="txtinput" />
		<button id="btnclick">submit</button>
		<!-- <input type="submit"
			value="submit" id="btnclick" /> -->
	</form>
</body>
</html>