$(document).ready(function(){
		$.post("listexchange.json", function(data) {
			var str = "";
			//alert(data.length);
			for (var i = 0; i < data.length; i++) {

				str += "<tr><td>" + data[i].currency + "</td><td>"
						+ data[i].bid + "</td><td>" + data[i].ask
						+ "</td></tr>";
			}
			$("#tbodyExchange").html(str);
		});	
	});
$
		.post(
				"getpopularnews.json",
				function(news) {
					var str = "";					
					for (var i = 0; i < news.length; i++) {
						str += "<a href='"
								+ news[i].news_path
								+ "' class='list-group-item  clear-paddings' target='_blank' id='"
								+ news[i].news_id + "'>"
								+ "<div style='background-image: url("+ news[i].news_img+"), url(img/404.jpg)'></div>"
								+ "<h6 class='text-h6-2 article-title'>"
								+ news[i].news_title + "</h6>" + "</a>";
					}					
					$('#panel-body-popular').html(str);
				});
$
.post(
		"getrecommendnews.json",
		function(news) {
			var str = "";					
			for (var i = 0; i < news.length; i++) {
				str += "<a href='"
					+ news[i].news_path
					+ "' class='list-group-item  clear-paddings' target='_blank' id='"
					+ news[i].news_id + "'>"
					+ "<div style='background-image: url("+ news[i].news_img+"), url(img/404.jpg)'></div>"
					+ "<h6 class='text-h6-2 article-title'>"
					+ news[i].news_title + "</h6>" + "</a>";
			}					
			$('#panel-body-recommend').html(str);
		});