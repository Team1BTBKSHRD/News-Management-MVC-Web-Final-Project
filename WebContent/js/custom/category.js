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
							for (var i = 0; i < news.length; i++) {
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
										+ "Ã¡Å¾Â¢Ã¡Å¾Â¶Ã¡Å¾â€œ "
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
									+ "<li class='previous'><a href='#' class='btn btn-lg btn-primary'>Ã¡Å¾â€˜Ã¡Å¸â€ Ã¡Å¾â€“Ã¡Å¸ï¿½Ã¡Å¾Å¡Ã¡Å¾â‚¬Ã¡Å¸â€™Ã¡Å¾Å¡Ã¡Å¸â€žÃ¡Å¾â„¢</a></li>"
									+ "<li class='next'><a href='#' class='btn btn-lg btn-primary'>Ã¡Å¾â€˜Ã¡Å¸â€ Ã¡Å¾â€“Ã¡Å¸ï¿½Ã¡Å¾Å¡Ã¡Å¾â€�Ã¡Å¾â€œÃ¡Å¸â€™Ã¡Å¾â€˜Ã¡Å¾Â¶Ã¡Å¾â€�Ã¡Å¸â€¹</a></li>"
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

$.post("showNewsCategoryTop.json", {c_code:window.location.search.substr(4)},
	function(data) {
	var allItem = "";
	for (var i = 0; i < data.length; i++) {
		//if(data[i].news_path=='') data[i].news_path = 'article?id=' + data[i].news_id;
		allItem += "<a href='"+data[i].url+"'>"+
		"<div class='img-slider-items'>"+
		"<img src='"+ data[i].img +"' class='img-responsive'>"+
		"<div class='items-background'></div>"+
		"<div class='items-category'>"+
		"<h5 class='title-category'>"+ data[i].n_title +"</h5>"+
		"<span class='desc-category'>"+ data[i].n_desc +"</span>"+
		"</div>"+
		"</div>"+
		"</a>";
	}
	owl.data('owlCarousel').addItem(allItem);
});