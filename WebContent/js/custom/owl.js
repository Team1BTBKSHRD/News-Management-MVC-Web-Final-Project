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
		allItem += "<div class='item'> " + "<img src='" + data[i].news_img
				+ "' alt='item slider'>"
				+ "<div class='news-title-background'>" + "<a href='"
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