var name = '<%=session.getAttribute("admin")%>';
/*------------script for focus on menu -------------- */
$("#usermenu").removeClass("parent").addClass("parent parent-focus");
/* $("#usermenu").addClass("active" ); */
$.post("userinfolist.news", function(data) {
	$("#listdetial").html(tblistArticle(data));
	
});
$.post("usertypelist.news",function(data){
	$("#usertype").html(usertypeDropList(data));
});
/* Function Add option to select tag */
function usertypeDropList(data) {
	var str = "";
	for (var i = 0; i < data.length; i++) {
		str += "<option value=" + data[i].user_type + ">"
				+ data[i].user_type;
	}
	str += "</optiont>";
	return str;
}
/* Function Create table For listing User */
function tblistArticle(data) {
	var str = "";
	for (var i = 0; i < data.length; i++) {

		str += "<tr>" + "<td id=cat_code" + data[i].user_id + ">"
				+ data[i].user_name + "</td>" + "<td>" + data[i].user_type
				+ "</td>" + "<td>" + btnAction(i) + "</td>" + "</tr>";
	}
	return str;
}
function btnAction(i) {
	var btn = "<button class='btn btn-success btn-xs' id='btnedit" + i + "'>"
			+ "<i class=fa fa-pencil-square-o></i>"
			+ "&nbsp;&nbsp;Edit</button>"
			+ "<button class='btn btn-danger btn-xs delete' id='btnremove" + i
			+ "'>" + "<i class=fa fa-trash-o></i>&nbsp;&nbsp;Delete</button>";
	return btn;
}
/* Add New User */
function insertNewUser(){
	var name = $("#username").val();
	var pwd=$("#repassword").val();
	var usrtype=$("#usertype option:selected").val();
	//alert(name+"||"+pwd+"||"+usrtype);
	$.post("useradd.news",{
		user_name:name,
		user_pass:pwd,
		user_type:usrtype
	},function(data,status){
		alert(status);
	});
	
}
