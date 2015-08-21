<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>news box site...</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<!-- lib css -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="css/owl.theme.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<!-- end lib css -->
<!-- custom css -->
<link rel="stylesheet" type="text/css" href="css/custom/index.css">
<link rel="stylesheet" type="text/css" href="css/custom/owl.css">
<link rel="stylesheet" type="text/css"
	href="css/custom/bottom-slider.css">
<link rel="stylesheet" type="text/css"
	href="css/custom/category-btn.css">
<!-- end custom css -->
</head>
<body>
	<%
		session.removeAttribute("admin");
	%>​​
	<!-- header -->
	<jsp:include page="layouts/header.jsp" />
	<!-- end header -->
	<!-- content area -->
	<jsp:include page="layouts/left-sidebar-button.jsp" />
	<div class="container content-area">
		<!-- search panel -->
		<jsp:include page="layouts/searchbar.jsp" />
		<!--end search panel -->
		<!-- right panel -->
		<div class="col-md-9 col-sm-9 col-xs-9 clear-padding-left left-panel">
			<!-- slider -->
			<jsp:include page="layouts/slider.jsp" />
			<!-- end slider -->
			<!-- news sections -->
			<!-- Social News -->
			<div class="panel panel-primary" id="localnews-scroll">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ព័ត៌មានជាតិទូទៅ</h3>
					<div class="btn-group">
						<a class="btn search-filter" id="showLocal">ប្រចាំថ្ងៃ</a> <a
							href="#" class="dropdown-toggle btn-date" data-toggle="dropdown"
							aria-expanded="false"><span class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu" id="listLocal">
							<li value="day"><a>ប្រចាំថ្ងៃ</a></li>
							<li value="week"><a>ប្រចាំសប្តាស៍</a></li>
							<li value="month"><a>ប្រចាំខែ</a></li>
						</ul>
						<!--end category news-->
					</div>

				</div>
				<div class="panel-body" id="panelBody_cam"></div>
				<!-- End of panel body -->
			</div>

			<div class="panel panel-primary" id="technews-scroll">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ព័ត៌មានបច្ចេកវិទ្យា</h3>
					<div class="btn-group">
						<a class="btn search-filter" id="showTech">ប្រចាំថ្ងៃ</a> <a
							class="dropdown-toggle btn-date" data-toggle="dropdown"
							aria-expanded="false"><span class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu" ​ id="listTech">
							<li value="day"><a>ប្រចាំថ្ងៃ</a></li>
							<li value="week"><a>ប្រចាំសប្តាស៍</a></li>
							<li value="month"><a>ប្រចាំខែ</a></li>
						</ul>
						<!--end category news-->
					</div>
				</div>
				<div class="panel-body" id="panelBody_tech"></div>
				<!-- End of panel body -->
			</div>

			<div class="panel panel-primary" id="sportnews-scroll">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ព័ត៌មានកីឡា</h3>
					<div class="btn-group">
						<a class="btn search-filter" id="showSport">ប្រចាំថ្ងៃ</a> <a
							href="#" class="dropdown-toggle btn-date" data-toggle="dropdown"
							aria-expanded="false"><span class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu" id="listSport">
							<li value="day"><a>ប្រចាំថ្ងៃ</a></li>
							<li value="week"><a>ប្រចាំសប្តាស៍</a></li>
							<li value="month"><a>ប្រចាំខែ</a></li>
						</ul>
						<!--end category news-->
					</div>
				</div>
				<div class="panel-body" id="panelBody_sport"></div>
				<!-- End of panel body -->
			</div>
			<div class="panel panel-primary" id="knowledgenews-scroll">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ចំនេះដឺងទូទៅ</h3>
					<div class="btn-group">
						<a class="btn search-filter" id="showKnowledge">ប្រចាំថ្ងៃ</a> <a
							href="#" class="dropdown-toggle btn-date" data-toggle="dropdown"
							aria-expanded="false"><span class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu" ​ id="listKnowledge">
							<li value="day"><a>ប្រចាំថ្ងៃ</a></li>
							<li value="week"><a>ប្រចាំសប្តាស៍</a></li>
							<li value="month"><a>ប្រចាំខែ</a></li>
						</ul>
						<!--end category news-->
					</div>
				</div>
				<div class="panel-body" id="panelBody_knowledge"></div>
				<!-- End of panel body -->
			</div>

			<div class="panel panel-primary" id="socialnews-scroll">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ព័ត៌មានសង្គម</h3>
					<div class="btn-group">
						<a class="btn search-filter" id="showSocial">ប្រចាំថ្ងៃ</a> <a
							href="#" class="dropdown-toggle btn-date" data-toggle="dropdown"
							aria-expanded="false"><span class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu" id="listSocial">
							<li value="day"><a>ប្រចាំថ្ងៃ</a></li>
							<li value="week"><a>ប្រចាំសប្តាស៍</a></li>
							<li value="month"><a>ប្រចាំខែ</a></li>
						</ul>
						<!--end category news-->
					</div>
				</div>
				<div class="panel-body" id="panelBody_social"></div>
				<!-- End of panel body -->
			</div>
			<div class="panel panel-primary" id="economicnews-scroll">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ព័ត៌មានសេដ្ឋកិច្ចទូទៅ</h3>
					<div class="btn-group">
						<a class="btn search-filter" id="showEconomy">ប្រចាំថ្ងៃ</a> <a
							href="#" class="dropdown-toggle btn-date" data-toggle="dropdown"
							aria-expanded="false"><span class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu" id="listEconomy">
							<li value="day"><a>ប្រចាំថ្ងៃ</a></li>
							<li value="week"><a>ប្រចាំសប្តាស៍</a></li>
							<li value="month"><a>ប្រចាំខែ</a></li>
						</ul>
						<!--end category news-->
					</div>
				</div>
				<div class="panel-body" id="panelBody_economy"></div>
				<!-- End of panel body -->
			</div>

			<div class="panel panel-primary" id="entertainmentnews-scroll">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ព័ត៌មានកម្សាន្ត</h3>
					<div class="btn-group">
						<a class="btn search-filter" id="showEnterain">ប្រចាំថ្ងៃ</a> <a
							href="#" class="dropdown-toggle btn-date" data-toggle="dropdown"
							aria-expanded="false"><span class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu" id="listEnterain">
							<li value="day"><a>ប្រចាំថ្ងៃ</a></li>
							<li value="week"><a>ប្រចាំសប្តាស៍</a></li>
							<li value="month"><a>ប្រចាំខែ</a></li>
						</ul>
						<!--end category news-->
					</div>
				</div>
				<div class="panel-body" id="panelBody_entertainment"></div>
				<!-- End of panel body -->

			</div>

			<div class="panel panel-primary" id="lifeandjobsnews-scroll">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ជីវិត និងការងារ</h3>
					<div class="btn-group">
						<a class="btn search-filter" id="showLifeandJobs">ប្រចាំថ្ងៃ</a> <a
							href="#" class="dropdown-toggle btn-date" data-toggle="dropdown"
							aria-expanded="false"><span class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu" id="listlifeandjobs"> 
							<li value="day"><a>ប្រចាំថ្ងៃ</a></li>
							<li value="week"><a>ប្រចាំសប្តាស៍</a></li>
							<li value="month"><a>ប្រចាំខែ</a></li>
						</ul>
						<!--end category news-->
					</div>
				</div>
				<div class="panel-body" id="panelBody_lifeandjob"></div>
				<!-- End of panel body -->

			</div>
			<!-- end news sections -->
		</div>
		<!-- end right panel -->
		<!-- left panel -->
		<jsp:include page="layouts/right-panel.jsp" />
		<!-- end left panel -->
	</div>
	<!-- end content area -->
	<!-- footer -->
	<jsp:include page="layouts/footer.jsp" />
	<!-- end footer -->
	<!-- #####################javascript#################### -->
	​​
	<!-- lib js -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<!-- end lib js -->
	<!-- custom js -->
	<script src="js/custom/owl.js"></script>
	<script src="js/custom/exchange.js"></script>
	<!-- <script src="js/custom/index.js"></script> -->
	<script>
		$("#btn-localnews").click(function() {
			$('html, body').animate({
				scrollTop : $("#localnews-scroll").offset().top - 70

			}, 500);
		});

		$("#btn-technews").click(function() {
			$('html, body').animate({
				scrollTop : $("#technews-scroll").offset().top - 70
			}, 500);
		});
		$("#btn-sportnews").click(function() {
			$('html, body').animate({
				scrollTop : $("#sportnews-scroll").offset().top - 70

			}, 500);
		});
		$("#btn-socialnews").click(function() {
			$('html, body').animate({
				scrollTop : $("#socialnews-scroll").offset().top - 70

			}, 500);
		});
		$("#btn-Economynews").click(function() {
			$('html, body').animate({
				scrollTop : $("#economicnews-scroll").offset().top - 70

			}, 500);
		});
		$("#btn-EntertainmentNews").click(function() {
			$('html, body').animate({
				scrollTop : $("#entertainmentnews-scroll").offset().top - 70

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
								limit : 12
							},
							function(news) {
								if (news.length <= 0) {
									alert("No Data");
									return;
								}
								var data = "<div class='card-1' id='card-1' onclick='countview("
										+ news[0].news_id
										+ ")'>"
										+ "<a href=article.jsp target='_blank' id='link-1'>"
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
										+ "<center>អាន "
										+ news[0].count_visited
										+ " | "
										+ news[0].news_date
										+ " | "
										+ news[0].full_name
										+ "</center>"
										+ "</div>"
										+ "</div>"
										+ "</a>"
										+ "</div><hr/>";
								for (var i = 1; i < news.length; i++) {
									data += "<div class='card-2 col-md-6 col-sm-6 col-xs-6 clear-paddings' onclick='countview("
											+ news[i].news_id
											+ ")'>"
											+ "<a href='"
						+ news[i].news_path
						+ "' target='_blank' id='link-2'>"
											+ "<div class='col-md-4 col-sm-4 col-xs-4 clear-paddings'>"
											+ "<img src='"
						+ news[i].news_img
						+ "' class='col-md-12 col-sm-12 col-xs-12 clear-paddings' height='85px' width='80px' id='img-2'>"
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
								}//End of for loop;
								$(element).html(data);
							});
		}//End of function;
		/*------------End Bo Response------------*/
	</script>
	<!-- end custom js -->
	<!-- #####################end javascript#################### -->
	​​
</body>
</html>