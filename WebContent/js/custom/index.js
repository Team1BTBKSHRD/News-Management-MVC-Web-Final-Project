		/*----------------------------List All News----------------------------------*/
		$
				.post(
						"listallnews.news",
						function(news) {

							var panel = "<div class='card-1' id='card-1' onclick='countview("+ news[0].news_id +")'>"
									+ "<a href=article.jsp target='_blank' id='link-1'>"
									+ "<div class='col-md-4 col-sm-4 col-xs-4 clear-paddings'>"
									+ "<img src='"+news[0].news_img+"' class='col-md-12 col-sm-12 col-xs-12 clear-paddings' height='153px' id='img-1'>"
									+ "</div>"
									+ "<div class='col-md-8 col-sm-8 col-xs-8 card-details pull-right '>"
									+ "<h5 class='text-h5-2 article-title' id='title-1'>"
									+ news[0].news_title
									+ "</h5>"
									+ "<p class='text-3 news-description' id='des-1'>"
									+ news[0].news_desc
									+ "</p>"
									+ "<div class='col-md-12 col-sm-12 col-xs-12 clear-paddings news-info' id='info-1'>"
									+ "<center>អាន " + news[0].count_visited
									+ " | " + news[0].news_date + " | "
									+ news[0].full_name + "</center>"
									+ "</div>" + "</div>" + "</a>"
									+ "</div><hr/>";
							var panelRight = "";
							var panelRecommend = "";
							var technology = "";
							var sport = "";
							var knowledge="";
							for (var i = 1; i < news.length; i++) {
								if (news[i].parent_desc == "ពត៌មានជាតិ"
										&& news[i].count_visited >= 7000) {
									
									panel += "<div class='card-2 col-md-6 col-sm-6 col-xs-6 clear-paddings' onclick='countview("+ news[i].news_id +")'>"
											+ "<a href='"+news[i].news_path+"' target='_blank' id='link-2'>"
											+ "<div class='col-md-4 col-sm-4 col-xs-4 clear-paddings'>"
											+ "<img src='"+news[i].news_img+"' class='col-md-12 col-sm-12 col-xs-12 clear-paddings' height='85px' width='80px' id='img-2'>"
											+ "</div>"
											+ "<div class='col-md-8 col-sm-8 col-xs-8 card-details'>"
											+ "<h6 class='text-h6-2 article-title' id='title-2'>"
											+ news[i].news_title
											+ "</h6>"
											+ "<div class='col-md-12 col-sm-12 col-xs-12 clear-paddings news-info' id='info-2'>អាន "
											+ news[i].count_visited
											+ " | "
											+ news[i].news_date
											+ " | "
											+ news[i].full_name
											+ "</div>"
											+ "</div>" + "</a>" + "</div>";
								}
								if (news[i].count_visited >= 10000) {
									panelRight += 
											 "<a href='"+news[i].news_path+"' class='list-group-item  clear-paddings' target='_blank' onclick='countview("+ news[i].news_id +")'>"
											+ "<img src='"+news[i].news_img+"' height='50px' width='64px'>"
											+ "<h6 class='text-h6-2 article-title'>"
											+ news[i].news_title
											+ "</h6>"
											+ "</a>" ;
									//alert(panelRight);
								}
								if (news[i].news_like >= 10000) {
									panelRecommend += 
											 "<a href='"+news[i].news_path+"' class='list-group-item  clear-paddings' target='_blank' onclick='countview("+ news[i].news_id +")'>"
											+ "<img src='"+news[i].news_img+"' height='50px' width='64px'>"
											+ "<h6 class='text-h6-2 article-title'>"
											+ news[i].news_title
											+ "</h6>"
											+ "</a>" ;
									//alert(panelRight);
								}
								/*Knowledge News*/
								//alert(news[i].cat_name);
								if (news[i].cat_name == "ព័ត៌មានបច្ចេកវិទ្យា") {

									technology += "<div class='card-2 col-md-6 col-sm-6 col-xs-6 clear-paddings' onclick='countview("+ news[i].news_id +")'>"
											+ "<a href='"+news[i].news_path+"' target='_blank' id='link-2'>"
											+ "<div class='col-md-4 col-sm-4 col-xs-4 clear-paddings'>"
											+ "<img src='"+news[i].news_img+"' class='col-md-12 col-sm-12 col-xs-12 clear-paddings' height='85px' width='80px' id='img-2'>"
											+ "</div>"
											+ "<div class='col-md-8 col-sm-8 col-xs-8 card-details'>"
											+ "<h6 class='text-h6-2 article-title' id='title-2'>"
											+ news[i].news_title
											+ "</h6>"
											+ "<div class='col-md-12 col-sm-12 col-xs-12 clear-paddings news-info' id='info-2'>អាន "
											+ news[i].count_visited
											+ " | "
											+ news[i].news_date
											+ " | "
											+ news[i].full_name
											+ "</div>"
											+ "</div>" + "</a>" + "</div>";
								}
								if (news[i].cat_name == "កីឡាជាតិ"
										&& news[i].full_name == "sabay") {

									sport += "<div class='card-2 col-md-6 col-sm-6 col-xs-6 clear-paddings' onclick='countview("+ news[i].news_id +")'>"
											+ "<a href='"+news[i].news_path+"' target='_blank' id='link-2'>"
											+ "<div class='col-md-4 col-sm-4 col-xs-4 clear-paddings'>"
											+ "<img src='"+news[i].news_img+"' class='col-md-12 col-sm-12 col-xs-12 clear-paddings' height='85px' width='80px' id='img-2'>"
											+ "</div>"
											+ "<div class='col-md-8 col-sm-8 col-xs-8 card-details'>"
											+ "<h6 class='text-h6-2 article-title' id='title-2'>"
											+ news[i].news_title
											+ "</h6>"
											+ "<div class='col-md-12 col-sm-12 col-xs-12 clear-paddings news-info' id='info-2'>អាន "
											+ news[i].count_visited
											+ " | "
											+ news[i].news_date
											+ " | "
											+ news[i].full_name
											+ "</div>"
											+ "</div>" + "</a>" + "</div>";
								}
								if (news[i].cat_name == "យល់ដឹង") {

									knowledge += "<div class='card-2 col-md-6 col-sm-6 col-xs-6 clear-paddings' onclick='countview("+ news[i].news_id +")'>"
										+ "<a href='"+news[i].news_path+"' target='_blank' id='link-2'>"
										+ "<div class='col-md-4 col-sm-4 col-xs-4 clear-paddings'>"
										+ "<img src='"+news[i].news_img+"' class='col-md-12 col-sm-12 col-xs-12 clear-paddings' height='85px' width='80px' id='img-2'>"
										+ "</div>"
										+ "<div class='col-md-8 col-sm-8 col-xs-8 card-details'>"
										+ "<h6 class='text-h6-2 article-title' id='title-2'>"
										+ news[i].news_title
										+ "</h6>"
										+ "<div class='col-md-12 col-sm-12 col-xs-12 clear-paddings news-info' id='info-2'>អាន "
										+ news[i].count_visited
										+ " | "
										+ news[i].news_date
										+ " | "
										+ news[i].full_name
										+ "</div>"
										+ "</div>" + "</a>" + "</div>";
							}
							}
							
							
					
							panel += "<div class='clearfix'></div>";
							//panelRigth += "<div class='clearfix'></div>";
							$("#popular").html(panelRight);
							$("#recommend").html(panelRecommend);
							//alert($("#panelRight").html());
							//alert(panelRigth);
							$("#panelBody_cam").html(panel);
							$("#panelBody_tech").html(technology);
							$("#panelBody_sport").html(sport);
							$("#panelBody_social").html(knowledge);
						});
		/*------------------------End of List All News-----------------------------*/
		/* function add popular */