/* category Control --------------------------------------------------------------*/
$("#btnlistCate").click(function() {
	alert("list");
	$.post("listcategory.news", function(data, status) {
		alert(data[0].cat_name + "<-1-->" + status);
	});
});
$("#btnaddCate").click(function() {
	alert("list111");
	var cat_name1 = $("#cat_name").val();
	var cat_desc1 = $("#cat_desc").val();
	$.post("addcategory.news", {
		cat_name : cat_name1,
		cat_desc : cat_desc1
	}, function(data, status) {
		alert(data + "<--->" + status);
	});
});
/* User Control -------------------------------------------------------------- */
$("#btnuseradd").click(function() { // Add user
	var name = $("#user_name").val();
	var pass = $("#user_pass").val();
	var type = $("#user_type option:selected").val();
	$.post("useradd.news", {
		user_name : name,
		user_pass : pass,
		user_type : type
	}, function(data, status) {
		alert(data + "<--->" + status);
	});
});

$("#btnuserlist").click(function() { // List user
	$.post("userlist.news", function(data, status) {
		alert(data[0].user_type + "<--->" + status);
	});
});
$("#btnuserremove").click(function() { // Remove user
	var id = $("#user_name").val();
	$.post("userremove.news", {
		user_id : id
	}, function(data, status) {
		alert(data.length + "<--->" + status);
	});
});
$("#btnuseredit").click(function() {
	var id = 3;
	var name = $("#user_name").val();
	var pass = $("#user_pass").val();
	var type = $("#user_type option:selected").val();
	$.post("useredit.news", {
		user_id : id,
		user_name : name,
		user_pass : pass,
		user_type : type
	}, function(data, status) {
		alert(data + "<--->" + status);
	});
});
$("#btnusersearch").click(function() { // Search user
	var id = $("#user_name").val();
	$.post("userfind.news", {
		user_id : id
	}, function(data, status) {
		alert(data[0].user_name + "<--->" + status);
	});
});

/*
 * @param : data is JSon generate <option> value </option> for dropdownlist
 * class
 */
function categoryDropList(data) {
	var str = "";
	str += "<option value=''>All</option>;";
	for (var i = 0; i < data.length; i++) {
		str += "<option value=" + data[i].cat_name + ">" + data[i].cat_name;
	}
	str += "</option>";
	return str;
}
/*
 * @param : data is JSon generate <option> value </option> for dropdownlist
 * university
 */
function resourceDropList(data) {
	var str = "";
	str += "<option value=''>All</option>;";
	for (var i = 0; i < data.length; i++) {
		str += "<option value=" + data[i].full_name + ">" + data[i].full_name;
	}
	str += "</optiont>";
	return str;
}
/*
 * www.abc.com/admin/
 */
/*
 * get data from url and put into function with param
 */
function droplist() {
	$.post("categoryDropList.news", function(data) {
		$("#selectEcategory").html(categoryDropList(data));
		$("#newsTitlecategory").html(categoryDropList(data));

	});
	$.post("sourceDropList.news", function(data) {
		$("#selectEsource").html(resourceDropList(data));
	});
	$.post("sourceDropList.news", function(data, status) {
		alert(status);
		$("#newsUserinfo1").html(resourceDropList(data));
	});
	$.post("sourceDropList.news", function(data) {
		$("#newsUserinfo").html(resourceDropList(data));
	});
	funCount();
}
/* Add News by own user */
$("#btnNewsAdd")
		.click(
				function() {
					var newstitle = $("#txtnewstitle").val();
					var newsUserinfo = $("#newsUserinfo option:selected").val();
					var newstitlecategory = $(
							"#newsTitlecategory option:selected").val();
					var newscontent = $("#txtnewsContent").val();
					var newsdesc = $("#txtnewsDesc").val();
					var newspath = $("#txtnewsPath").val();
					alert(newstitle + " | " + newsUserinfo + " | "
							+ newstitlecategory + " | " + newscontent + " | "
							+ newsdesc + " | " + newspath);
					$.post("newsarticleadd.news", {
						user_info_code : newsUserinfo,
						news_title : newstitle,
						cat_name : newstitlecategory,
						news_content : newscontent,
						news_desc : newsdesc,
						news_path : newspath
					}, function(data, status) {
						alert(data + "<----->" + status);
					});
				});
/* List Article in Table */
/*
 * create tag <tr><td> value </td></tr> follow data
 */
function listobjectdetails(data) {
	var str = "";
	for (var i = 0; i < data.length; i++) {

		str += "<tr>" + "<td>" + (i + 1) + "</td>" + "<td>"
				+ data[i].news_title + "</td>" + "<td>" + data[i].news_date
				+ "</td>" + "</tr>";
	}

	str += "</table>";

	return str;
}
function listArticle() {
	var fullname = $("#newsUserinfo1 option:selected").val();
	// alert(fullname);
	$.post("listarticle.news", {
		full_name : fullname
	}, function(data) {
		$("#tblist").html(listobjectdetails(data));
	});

}
function funCount() {
	$.post("counts.news", function(data) {
		// alert(data.length);
		for (var i = 0; i < data.length; i++) {
			if (i == 0) {

				$("#lblaccounts").text(data[i].count);
			} else if (i == 1) {

				$("#lblarticles").text(data[i].count);
			} else if (i == 2) {

				$("#lblcategories").text(data[i].count);
			}
		}
	});
}
/* Load function */
droplist();
