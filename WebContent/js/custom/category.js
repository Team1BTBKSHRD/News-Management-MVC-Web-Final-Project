$('body').on('click', '.previous', function() {
	getResult(pageNumber -= countItems);
});
$('body').on('click', '.next', function() {
	getResult(pageNumber += countItems);
});
var countItems = 15;
var pageNumber = 0;
function getResult(pageNumber) {
	$
			.post(
					"listnewscategorybymonthly.json",
					{
						c_code : window.location.search.substr(4),
						limit : countItems,
						offset: pageNumber
					},
					function(news, status) {
						if (news.length > 0) {							
							var str = "";
							for (var i = 1; i < news.length; i++) {
								if(news[i].news_path=='') news[i].news_path = 'article?id=' + news[i].news_id;
									str += "<div class='card-1' id='" + news[i].news_id + "'>"
										+ "<a href='"+ news[i].news_path +"' target='_blank' id='link-1'>"
										+ "<div class='col-md-4 col-sm-4 col-xs-4 clear-paddings'>"
										+ "<img src='"
										+ news[i].news_img
										+ "' class='col-md-12 col-sm-12 col-xs-12 clear-paddings' height='153px' id='img-1'>"
										+ "</div>"
										+ "<div class='col-md-8 col-sm-8 col-xs-8 card-details pull-right '>"
										+ "<h5 class='text-h5-2 article-title' id='title-1'>"
										+ news[i].news_title
										+ "</h5>"
										+ "<p class='text-3 news-description' id='des-1'>"
										+ news[i].news_desc
										+ "</p>"
										+ "<div class='col-md-12 col-sm-12 col-xs-12 clear-paddings news-info' id='info-1'>"
										+ "អាន "
										+ news[i].count_visited
										+ " | "
										+ news[i].news_date
										+ " | "
										+ news[i].full_name
										+ "</div>"
										+ "</div>"
										+ "</a>"
										+ "</div><hr/>";
							}
							str += "<ul class='pager clear-padding-right'>"
									+ "<li class='previous'><a href='#' class='btn btn-lg btn-primary'>ទំព័រក្រោយ</a></li>"
									+ "<li class='next'><a href='#' class='btn btn-lg btn-primary'>ទំព័របន្ទាប់</a></li>"
									+ "</ul>";
							$('#panelCategory').html(str);
							if (news.length < countItems) {
								$('.next a').addClass('disabled');
								$('body').off('click', '.next a');
							}
							if (pageNumber == 0) {
								$('.previous a').addClass('disabled');
								$('body').off('click', '.previous a');
							}
						} else {
							
						}
					});
}
/*		----------------------------List All News----------------------------------
		$
				.post(
						"listallnews.json",
						function(news) {

							var panel = "";
							var panelRight = "";
							var panelRecommend = "";
							for (var i = 1; i < news.length; i++) {
								
								if (news[i].cat_name == "កីឡាជាតិ" || news[i].cat_name == "កីឡាអន្តរជាតិ"
										&& news[i].count_visited >= 7000) {
									
									panel += "<div class='card-1' id='card-1'>"
										+ "<a href="+news[i].news_path+" target='_blank' id='link-1'>"
										+ "<div class='col-md-3 col-sm-3 col-xs-3 clear-paddings'>"
										+ "<img src='"+news[i].news_img+"' class='img-responsive' height='153px' id='img-1'>"
										+ "</div>"
										+ "<div class='col-md-8 col-sm-8 col-xs-8 card-details'>"
										+ "<h5 class='text-h5-2 article-title' id='title-1'>"
										+ news[i].news_title
										+ "</h5>"
										+ "<p class='text-3 news-description' id='des-1'>"
										+ news[i].news_desc
										+ "</p>"
										+ "<div class='col-md-12 col-sm-12 col-xs-12 clear-paddings news-info' id='info-1'>"
										+ "អាន " + news[i].count_visited
										+ " | " + news[i].news_date + " | "
										+ news[i].full_name 
										+ "</div>" + "</div>" + "</a>"
										+ "</div><hr/>";
								}
								if (news[i].count_visited >= 10000) {
									panelRight += "<ul class='list-group clear-margin-bottom'>"
											+ "<a href='"+news[i].news_path+"' class='list-group-item  clear-paddings' target='_blank'>"
											+ "<img src='"+news[i].news_img+"' height='50px' width='64px'>"
											+ "<h6 class='text-h6-2 article-title'>"
											+ news[i].news_title
											+ "</h6>"
											+ "</a>" + "</ul>";
									//alert(panelRight);
								}
								if (news[i].news_like >= 10000) {
									panelRecommend += "<ul class='list-group clear-margin-bottom'>"
											+ "<a href='"+news[i].news_path+"' class='list-group-item  clear-paddings' target='_blank'>"
											+ "<img src='"+news[i].news_img+"' height='50px' width='64px'>"
											+ "<h6 class='text-h6-2 article-title'>"
											+ news[i].news_title
											+ "</h6>"
											+ "</a>" + "</ul>";
									//alert(panelRight);
								}
							}
							panel += "<div class='clearfix'></div>";
							$("#panelCategory").html(panel);
							$("#panelRigth").html(panelRight);
							$("#panelRightDown").html(panelRecommend);
						});
		------------------------End of List All News-----------------------------
		 function add popular 
		//var prmstr = window.location.search.substr(4);*/