var name = '<%=session.getAttribute("admin")%>';
/*------------script for focus on menu -------------- */
$("#usermenu").removeClass("parent").addClass("parent parent-focus");
/* $("#usermenu").addClass("active" ); */
$.post("userinfolist.news", function(data) {
	$("#listdetial").html(tblistArticle(data));
	
	/*sarin load data table*/
	$('#list').dataTable({
		  "lengthMenu": [[5, 10, 30, -1], [5, 10, 30, "All"]] 
	});
	
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
				+ "</td>" + "<td style='text-align: center;' >" + btnAction(i) + "</td>" + "</tr>";
	}
	return str;
}
function btnAction(i) {  /* sarin edit button to disable and enable*/
	var btn = "<button class='btn btn-success btn-xs' id='btnenable" + i + "'>"
			+ "<i class='fa fa-thumbs-up'></i>"
			+ "&nbsp;&nbsp;Enable</button>&nbsp;"
			+ "<button class='btn btn-danger btn-xs delete' id='btndisable" + i
			+ "'>" + "<i class='fa fa-thumbs-down'></i>&nbsp;&nbsp;Disable</button>";
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
