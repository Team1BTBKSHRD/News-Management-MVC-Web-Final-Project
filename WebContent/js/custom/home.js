$("#btn-home").click(function() {
			$('html, body').animate({
				scrollTop : $("#owl-demo").offset().top - 75
			}, 500);
		});
	
		$("#btn-localnews").click(function() {
			$('html, body').animate({
				scrollTop : $("#localnews-scroll").offset().top - 75
			}, 500);
		});

		$("#btn-technews").click(function() {
			$('html, body').animate({
				scrollTop : $("#technews-scroll").offset().top - 75
			}, 500);
		});
		$("#btn-sportnews").click(function() {
			$('html, body').animate({
				scrollTop : $("#sportnews-scroll").offset().top - 75

			}, 500);
		});
		
		$("#btn-knowledgenews").click(function() {
			$('html, body').animate({
				scrollTop : $("#knowledgenews-scroll").offset().top - 75

			}, 500);
		});
		$("#btn-socialnews").click(function() {
			$('html, body').animate({
				scrollTop : $("#socialnews-scroll").offset().top - 75

			}, 500);
		});
		$("#btn-Economynews").click(function() {
			$('html, body').animate({
				scrollTop : $("#economicnews-scroll").offset().top - 75

			}, 500);
		});
		$("#btn-EntertainmentNews").click(function() {
			$('html, body').animate({
				scrollTop : $("#entertainmentnews-scroll").offset().top - 75

			}, 500);
		});
		$("#btn-LifeAndJobs").click(function() {
			$('html, body').animate({
				scrollTop : $("#lifeandjobsnews-scroll").offset().top - 75

			}, 500);
		});

		/*Bo Response*/
		setData("B020101", "month", "#panelBody_cam");
		setData("B010105", "month", "#panelBody_tech");
		setData("B020201", "month", "#panelBody_sport");
		setData("B020501", "month", "#panelBody_knowledge");
		setData("B030102", "month", "#panelBody_social");
		setData("B030401", "month", "#panelBody_economy");
		setData("B010302", "month", "#panelBody_entertainment");
		setData("B010505", "month", "#panelBody_lifeandjob");
		$("#listLocal li").click(function() {
			$('#showLocal').text($(this).text());
			setData("B020101", $(this).attr('value'), "#panelBody_cam");

		});

		$("#listTech li").click(function() {
			$('#showTech').text($(this).text());
			setData("B010105", $(this).attr('value'), "#panelBody_tech");
		});

		$("#listSport li").click(function() {
			$('#showSport').text($(this).text());
			setData("B020201", $(this).attr('value'), "#panelBody_sport");
		});

		$("#listKnowledge li").click(function() {
			$('#showKnowledge').text($(this).text());
			setData("B020501", $(this).attr('value'), "#panelBody_knowledge");
		});

		$("#listSocial li").click(function() {
			$('#showSocial').text($(this).text());
			setData("B030102", $(this).attr('value'), "#panelBody_social");
		});

		$("#listEconomy li").click(function() {
			$('#showEconomy').text($(this).text());
			setData("B030401", $(this).attr('value'), "#panelBody_economy");
		});

		$("#listEnterain li").click(
				function() {
					$('#showEnterain').text($(this).text());
					setData("B010302", $(this).attr('value'),
							"#panelBody_entertainment");
		});
		
		$("#listlifeandjobs li").click(
				function() {
					$('#showLifeandJobs').text($(this).text());
					setData("B010505", $(this).attr('value'),
							"#panelBody_lifeandjob");
		});
		function setData(code, time_limit, element) {
			var request = "";
			if (time_limit == "day")
				request = "listnewscategorybydaily.json";
			else if (time_limit == "week")
				request = "listnewscategorybyweekly.json";
			else
				request = "listnewscategorybymonthly.json";
			$
					.post(
							request,
							{
								c_code : code,
								limit : 11,
								offset : 0
							},
							function(news) {
								if (news.length <= 0) {
									alert("No Data");
									return;
								}
								if(news[0].news_path=='') news[0].news_path = 'article?id=' + news[0].news_id;
								var data = "<div class='card-1' id='" + news[0].news_id + "'>"
										+ "<a href='"+ news[0].news_path +"' target='_blank' id='link-1'>"
										+ "<div class='col-md-4 col-sm-4 col-xs-4 clear-paddings'>"
										+ "<img src='"
										+ news[0].news_img
										+ "' class='col-md-12 col-sm-12 col-xs-12 clear-paddings' height='153px' id='img-1'>"
										+ "</div>"
										+ "<div class='col-md-8 col-sm-8 col-xs-8 card-details pull-right '>"
										+ "<h5 class='text-h5-2 article-title' id='title-1'>"
										+ news[0].news_title
										+ "</h5>"
										+ "<p class='text-3 news-description' id='des-1'>"
										+ news[0].news_desc
										+ "</p>"
										+ "<div class='col-md-12 col-sm-12 col-xs-12 clear-paddings news-info' id='info-1'>"
										+ "អាន "
										+ news[0].count_visited
										+ " | "
										+ news[0].news_date
										+ " | "
										+ news[0].full_name
										+ "</div>"
										+ "</div>"
										+ "</a>"
										+ "</div><hr/>";
								for (var i = 1; i < news.length; i++) {
									if(news[i].news_path=='') news[i].news_path = 'article?id=' + news[i].news_id;
									data += "<div class='card-2 col-md-6 col-sm-6 col-xs-6 clear-paddings'id='" + news[i].news_id + "'>"
											+ "<a href='"
											+ news[i].news_path
											+ "' target='_blank' id='link-2'>"
											+ "<div class='col-md-4 col-sm-4 col-xs-4 clear-paddings'>"
											+ "<img src='"
											+ news[i].news_img
											+ "' class='col-md-12 col-sm-12 col-xs-12 clear-paddings' height='85px' width='90px' id='img-2'>"
											+ "</div>"
											+ "<div class='col-md-8 col-sm-8 col-xs-8 card-details'>"
											+ "<h6 class='text-h6-2 article-title' id='title-2'>"
											+ news[i].news_title
											+ "</h6>"
											+ "<div class='col-md-12 col-sm-12 col-xs-12 clear-paddings text-2 news-info' id='info-2'>អាន "
											+ news[i].count_visited
											+ " | "
											+ news[i].news_date
											+ " | "
											+ news[i].full_name
											+ "</div>"
											+ "</div>" + "</a>" + "</div>";
								}//End of for loop;
								$(element).html(data);
							});
		}//End of function;
		/*------------End Bo Response------------*/