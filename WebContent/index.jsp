<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>news box site...</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

​​
<!-- lib css -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="css/owl.theme.css">
<link rel="stylesheet" href="css/responsive.css">
<!-- end lib css -->
<!-- custom css -->
<link rel="stylesheet" type="text/css" href="css/custom/index.css">
<link rel="stylesheet" type="text/css" href="css/custom/owl.css">
<link rel="stylesheet" type="text/css" href="css/custom/bottom-slider.css">
<!-- end custom css -->

​​
</head>
<body>
	<%
		session.removeAttribute("admin");
	%>​​
	<!-- header -->
	<jsp:include page="layouts/header.jsp" />
	<!-- end header -->
	<!-- content area -->
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
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ពត៌មានក្នុងស្រុក
						<a href="http://www.google.com">
							<span style="color: white; font-size: 1em;" class="glyphicon glyphicon-list pull-right"></span>
						</a>
					</h3>			
				</div>
				<div class="panel-body" id="panelBody_cam"></div>
				<!-- End of panel body -->
			</div>

			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ព័ត៌មានបច្ចេកវិទ្យា
						<a href="#">
							<span style="color: white; font-size: 1em;" class="glyphicon glyphicon-list pull-right"></span>
						</a>
					</h3>
				</div>
				<div class="panel-body" id="panelBody_tech"></div>
				<!-- End of panel body -->
			</div>

			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">កីឡា
						<a href="#">
							<span style="color: white; font-size: 1em;" class="glyphicon glyphicon-list pull-right"></span>
						</a>
					</h3>
				</div>
				<div class="panel-body" id="panelBody_sport"></div>
				<!-- End of panel body -->
			</div>

			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">សង្គម
						<a href="#">
							<span style="color: white; font-size: 1em;" class="glyphicon glyphicon-list pull-right"></span>
						</a>
					</h3>
				</div>
				<div class="panel-body" id="panelBody_social"></div>
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
	<!-- #####################javascript#################### -->​​
	<!-- lib js -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<!-- end lib js -->
	<!-- custom js -->
	<script src="js/custom/owl.js"></script>
	<script src="js/custom/exchange.js"></script>
	<script type="text/javascript">
		/*----------------------------List All News----------------------------------*/
		$
				.post(
						"listallnews.news",
						function(news) {

							var panel = "<div class='card-1' id='card-1'>"
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
								//if(news[i].news_status==true)
								if (news[i].parent_desc == "ពត៌មានជាតិ"
										&& news[i].count_visited >= 7000) {
									panel += "<div class='card-2 col-md-6 col-sm-6 col-xs-6 clear-paddings'>"
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
								/*Knowledge News*/
								//alert(news[i].cat_name);
								if (news[i].cat_name == "ព័ត៌មានបច្ចេកវិទ្យា") {

									technology += "<div class='card-2 col-md-6 col-sm-6 col-xs-6 clear-paddings'>"
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

									sport += "<div class='card-2 col-md-6 col-sm-6 col-xs-6 clear-paddings'>"
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

									knowledge += "<div class='card-2 col-md-6 col-sm-6 col-xs-6 clear-paddings'>"
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
							$("#panelRigth").html(panelRight);
							$("#panelRightDown").html(panelRecommend);
							//alert($("#panelRight").html());
							//alert(panelRigth);
							$("#panelBody_cam").html(panel);
							$("#panelBody_tech").html(technology);
							$("#panelBody_sport").html(sport);
							$("#panelBody_social").html(knowledge);
						});
		/*------------------------End of List All News-----------------------------*/
		/* function add popular */
	</script>

	<!-- end custom js -->
	<!-- #####################end javascript#################### -->
	​​
</body>
</html>