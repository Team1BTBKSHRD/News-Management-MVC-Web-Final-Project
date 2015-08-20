/*----------------------------List All News----------------------------------*/
$
		.post(
				"listallnews.json",
				function(news) {

					var panel = "";
					var panelRight = "";
					var panelRecommend = "";
					for (var i = 1; i < news.length; i++) {
						if (news[i].count_visited >= 10000) {
							panelRight += "<ul class='list-group clear-margin-bottom'>"
									+ "<a href='"
									+ news[i].news_path
									+ "' class='list-group-item  clear-paddings' target='_blank'>"
									+ "<img src='"
									+ news[i].news_img
									+ "' height='50px' width='64px'>"
									+ "<h6 class='text-h6-2 article-title'>"
									+ news[i].news_title
									+ "</h6>"
									+ "</a>"
									+ "</ul>";
							// alert(panelRight);
						}
						if (news[i].news_like >= 10000) {
							panelRecommend += "<ul class='list-group clear-margin-bottom'>"
									+ "<a href='"
									+ news[i].news_path
									+ "' class='list-group-item  clear-paddings' target='_blank'>"
									+ "<img src='"
									+ news[i].news_img
									+ "' height='50px' width='64px'>"
									+ "<h6 class='text-h6-2 article-title'>"
									+ news[i].news_title
									+ "</h6>"
									+ "</a>"
									+ "</ul>";
							// alert(panelRight);
						}
					}
					panel += "<div class='clearfix'></div>";
					$("#panelCategory").html(panel);
					$("#panelRigth").html(panelRight);
					$("#panelRightDown").html(panelRecommend);
				});
/*------------------------End of List All News-----------------------------*/
/* Load Time Drop */
$("#lsttime").html(listTime());
$.post("sourcelistwithcode.json", function(data) {
	$("#lstnewsources").html(listSource(data));
});
$.post("categorylistwithcode.json",function(data){
	$("#lstcategory").html(listCategory(data));
});
/* list Category Drop */
function listCategory(data) {
	var str = "<li id="+data[0].cat_code+"><a href=#>"+data[0].cat_name+"</a></li>";
	for (var i = 1; i < data.length; i++) {
		str += "<li id=" + data[i].cat_code + "><a href=#>" + data[i].cat_name+"</a></li>";
	}
	return str;
}
/* list Source Drop */
function listSource(data) {
	var str = "<li id="+data[0].user_info_code+"><a href=#>"+data[0].full_name.toUpperCase()+"</a></li>";
	for (var i = 1; i < data.length; i++) {
		str += "<li id=" + data[i].user_info_code + "><a href=#>" + data[i].full_name.toUpperCase()+"</a></li>";
	}
	return str;
}
/* list Time */
function listTime() {
	var lst = "";
	lst += "<li><a href=#>២៤ ម៉ោងមុន</a></li>"
			+ "<li><a href=#>សប្តាហ៍មុន</a></li>"
			+ "<li><a href=#>ខែមុន</a></li>"
	return lst;
}

/* function add popular */