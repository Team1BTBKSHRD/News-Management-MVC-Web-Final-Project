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
		/*------------------------End of List All News-----------------------------*/
		/* function add popular */