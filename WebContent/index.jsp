<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript"
	src="WebContent/WEB-INF/assets/js/lib/jquery-min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
</head>
<body>
	<form>
		input : <input type="text" id="txtinput" /> <input type="button"
			value="submit" id="btnclick" />
	</form>
	<script>
		$("#btnclick").click(function() {
			$.post("newsCategory.news", function(data, status) {
				//
				alert(data.myArrayList[1].map.cat_name + "||" + status);
				//alert(1212);
			});
		});
	</script>
</body>
</html>