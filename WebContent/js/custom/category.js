$('body').on('click', '.previous', function() {
	getResult(pageNumber -= countItems);
});
$('body').on('click', '.next', function() {
	getResult(pageNumber += countItems);
});
var cat_code = window.location.search.substr(4);

/*$.post("countNewsByCatCodeMonthly.json",
		{categoryCode:cat_code},
	function(data){
			alert(data[0].result);
	$.cookie("items", data[0].result);
});*/
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

/*------------------------------------------------------------------*/

var owl = $("#owl-demo"), i = 0, textholder, booleanValue = false;

owl.owlCarousel({
	// //Set AutoPlay to 3 seconds
	autoPlay : 6000,
	loop : true,
	pagination : false,
	slideSpeed : 300,
	items : 1,
	responsive : true,
	responsiveRefreshRate : 200,
	responsiveBaseWidth : window,
	itemsDesktop : [ 1199, 1 ],
	itemsDesktopSmall : [ 979, 1 ],
	itemsTablet : [ 750, 1 ]
});

$.post("recentnews.json", function(data) {
	var allItem = "";
	for ( var i in data) {
		if(data[i].news_path=='') data[i].news_path = 'article?id=' + data[i].news_id;
		allItem += "<div class='item clear-margins'> " + "<img src='" + data[i].news_img
				+ "' alt='item slider'>"
				+ "<div class='news-title-background' id='"+ data[i].news_id +"'>" + "<a href='"
				+ data[i].news_path + "' target='_blank'>"
				+ "<div class='owl-news-title'>"
				+ "<h5 class='text-h5-2-slider clear-margin-top'>"
				+ data[i].news_title + "</h5>"
				+ "<p class='text-5 clear-margin-bottom'>" + data[i].news_desc
				+ "</p>" + "</div>" + "<div class='owl-news-source'>"
				+ "<strong>ប្រភពពត៌មាន <kbd>" + data[i].full_name
				+ "</kbd></strong>" + "</div>" + "</a>" + "</div>" + "</div>";
	}
	owl.data('owlCarousel').addItem(allItem);
});