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
$.post("categorylistwithcode.json", function(data) {
	$("#lstcategory").html(listCategory(data));
});
/* list Category Drop */
function listCategory(data) {
	var str = "<li id=''><a href=#>ប្រភេទព័ត៌មានទូទៅ</a></li>";
	for (var i = 0; i < data.length; i++) {
		str += "<li id=" + data[i].cat_code + "><a href=#>" + data[i].cat_name
				+ "</a></li>";
	}
	return str;
}
/* list Source Drop */
function listSource(data) {
	var str = "<li id=''><a href=#>ប្រភពព័ត៌មានទូទៅ</a></li>";
	for (var i = 0; i < data.length; i++) {
		str += "<li id=" + data[i].user_info_code + "><a href=#>"
				+ data[i].full_name.toUpperCase() + "</a></li>";
	}
	return str;
}
/* list Time */
function listTime() {
	var lst = "<li id=''><a href=#>ពេលវេលាណាមួយ</a></li>";
	lst += "<li id='daily'><a href=#>២៤ ម៉ោងមុន</a></li>"
			+ "<li id='weekly'><a href=#>សប្តាហ៍មុន</a></li>"
			+ "<li id='monthly'><a href=#>ខែមុន</a></li>"
	return lst;
}
/* function add popular */
// ###################################select value drop down
$('body').on('click', '#lstnewsources li', function() {
	$('#showNews').text($(this).text());
	$('#showNews').attr('value', $(this).attr("id"));
});
$('body').on('click', '#lstcategory li', function() {
	$('#showCategory').text($(this).text());
	$('#showCategory').attr('value', $(this).attr("id"));
});
$('#lsttime li').on('click', function() {
	$('#showTime').text($(this).text());
	$('#showTime').attr('value', $(this).attr("id"));
});
$('body').on('click', '#btnSubmit', function() {
	$.post("listResult.json", {
		title : $('#txtsearch-input').val(),
		newsCode : $('#showNews').attr('value'),
		categoryCode : $('#showCategory').attr('value'),
		timeCode : $('#showTime').attr('value'),
		pageCode : "0"
	}, function(data, status) {	
		var str = "";
		for (var i = 1; i < data.length; i++) {
			str +=
			"<div class='col-sm-12 search-result'><a href='"+ data[i].news_path +"' target='_blank'>"+
			"<div class='col-md-3 col-sm-3 col-xs-3 clear-paddings'>"+
			"<img src='"+ data[i].news_img +"' class='col-md-12 col-sm-12 col-xs-12 clear-paddings'"+ 
			"height='119.5px' id='img-1'></div>"+
			"<div class='col-md-9 col-sm-9 col-xs-9 clear-padding-right'>"+
			"<h5 class='article-name clear-margin-top'>"+ data[i].news_title +"</h5>"+
			"<strong>ផ្សាយ <kbd>"+ data[i].news_published_date +"</kbd></strong>"+
			"<p class='clear-margin-bottom text-2'>"+ data[i].news_desc +"</p>"+
			"<strong class='news-source'>ប្រភពពត៌មាន<kbd>"+ data[i].full_name +"</kbd></strong>"+
			"</div><div class='clearfix'></div></a></div>";
		}
		if(data.length == 15){
			str += 
				"<ul class='pager  clear-padding-right'>"+
			      "<li class='previous'><a href='#'>Previous</a></li>"+
			      "<li class='next'><a href='#'>Next</a></li>"+
			    "</ul>";
		}
		$('.search-result-wrapper').html(str);		
	});
});