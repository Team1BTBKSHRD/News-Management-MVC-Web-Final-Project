$("#btnSubmit").click(function() {
	alert(111);
	$.post("Login.news", {
		userName : $("#username").val(),
		password : $("#password").val()
	}, function(data, status) {
		if (data == "Success")
			window.location.href = "../Admin/index.jsp";

	});
});