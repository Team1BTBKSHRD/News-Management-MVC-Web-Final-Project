$("[id=" + window.location.search.substr(4) + "]").attr('class', 'active');

$('body').on('click', '.previous', function() {
	getResult(pageNumber -= countItems);
});
$('body').on('click', '.next', function() {
	getResult(pageNumber += countItems);
});
var cat_code = window.location.search.substr(4);

/*
 * $.post("countNewsByCatCodeMonthly.json", {categoryCode:cat_code},
 * function(data){ alert(data[0].result); $.cookie("items", data[0].result); });
 */
var countItems = 15;
var pageNumber = 0;
function getResult(pageNumber) {
	$
			.post(
					"listnewscategorybymonthly.json",
					{
						c_code : window.location.search.substr(4),
						limit : countItems,
						offset : pageNumber
					},
					function(news, status) {
						if (news.length > 0) {
							var str = "";
							for (var i = 0; i < news.length; i++) {
								if (news[i].news_path == '')
									news[i].news_path = 'article?id='
											+ news[i].news_id;
								str += "<div class='card-1 col-sm-12 clear-paddings' id='"
										+ news[i].news_id
										+ "'>"
										+ "<a href='"
										+ news[i].news_path
										+ "' target='_blank' id='link-1'>"
										+ "<div class='col-md-4 col-sm-4 col-xs-4 clear-paddings'>"
										+ "<div class='card-1-image' style='background-image: url("
										+ news[i].news_img
										+ "), url(img/404.jpg);' alt='item slider'></div>"
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
										+ news[i].news_published_date
										+ " | "
										+ news[i].full_name
										+ "</div>"
										+ "</div>" + "</a>" + "</div>";
							}
							str += "<ul class='pager clear-padding-right'>"
									+ "<li class='previous'><a href='#' class='btn btn-lg btn-primary'>ទំព័រមុខ</a></li>"
									+ "<li class='next'><a href='#' class='btn btn-lg btn-primary'>ទំព័រក្រោយ</a></li>"
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
var owl = $("#owl-demo");
owl.owlCarousel({
	autoPlay : 5000,
	loop : true,
	pagination : false,
	slideSpeed : 300,
	items : 1,
	responsive : true,
	responsiveRefreshRate : 200,
	responsiveBaseWidth : window,
	itemsDesktop : [ 1199, 1 ],
	itemsDesktopSmall : [ 979, 1 ],
	itemsTablet : [ 750, 1 ],
	afterMove : function() {
		var cars = $('.cate-title');
		$('.cate-title').removeClass('category-title-active');
		$(cars[this.owl.currentItem]).addClass('category-title-active');
	}
});
$.post("showNewsCategoryTop.json", {
	c_code : window.location.search.substr(4)
}, function(data) {
	var left = "";
	var right = "";
	for (var i = 0; i < data.length; i++) {
		if (data[i].news_path == '')
			data[i].news_path = 'article?id=' + data[i].news_id;
		left += "<div class='item'>"
				+ "<div class='owl-image' style='background-image: url("
				+ getBigImage(data[i].news_img) + "), url(img/404.jpg)'></div>"
				+ "<div class='news-title-background'><p class='owl-desc clear-margin-bottom'>"
				+ data[i].news_desc +"</p></div>" + "</div>";		
		right += "<div class='cate-title' id='" + data[i].news_id + "'>"
				+ "<a href='" + data[i].news_path
				+ "' class='text-h5-2'  target='_blank'>" + data[i].news_title
				+ "</a>" + "</div>";
	}
	$('.category-head-left').html(right);
	owl.data('owlCarousel').addItem(left);
	var cars = $('.cate-title');
	$(cars[0]).addClass('category-title-active');
});