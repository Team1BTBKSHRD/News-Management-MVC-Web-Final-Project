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
			<div class="panel panel-primary"  id="localnews-scroll">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ព័ត៌មានជាតិទូទៅ</h3>
					<div class="btn-group">
						<a class="btn search-filter" id="showLocal">ប្រចាំថ្ងៃ</a>
						<a href="#" class="dropdown-toggle btn-date"
							data-toggle="dropdown" aria-expanded="false"><span
							class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu" id="listLocal">
							<li><a>ប្រចាំថ្ងៃ</a></li>
							<li><a>ប្រចាំសប្តាស៍</a></li>
							<li><a>ប្រចាំខែ</a></li>
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
						<a class="btn search-filter" id="showTech">ប្រចាំថ្ងៃ</a>
						<a class="dropdown-toggle btn-date"
							data-toggle="dropdown" aria-expanded="false"><span
							class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu"​ id="listTech">
							<li><a>ប្រចាំថ្ងៃ</a></li>
							<li><a>ប្រចាំសប្តាស៍</a></li>
							<li><a>ប្រចាំខែ</a></li>
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
						<a class="btn search-filter" id="showSport">ប្រចាំថ្ងៃ</a>
						<a href="#" class="dropdown-toggle btn-date"
							data-toggle="dropdown" aria-expanded="false"><span
							class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu" id="listSport">
							<li><a>ប្រចាំថ្ងៃ</a></li>
							<li><a>ប្រចាំសប្តាស៍</a></li>
							<li><a>ប្រចាំខែ</a></li>
						</ul>
						<!--end category news-->
					</div>
				</div>
				<div class="panel-body" id="panelBody_sport"></div>
				<!-- End of panel body -->
			</div>
			<div class="panel panel-primary" id="sportnews-scroll">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ចំនេះដឺងទូទៅ</h3>
					<div class="btn-group">
						<a class="btn search-filter" id="showKnowledge">ប្រចាំថ្ងៃ</a>
						<a href="#" class="dropdown-toggle btn-date"
							data-toggle="dropdown" aria-expanded="false"><span
							class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu"​ id="listKnowledge">
							<li><a>ប្រចាំថ្ងៃ</a></li>
							<li><a>ប្រចាំសប្តាស៍</a></li>
							<li><a>ប្រចាំខែ</a></li>
						</ul>
						<!--end category news-->
					</div>
				</div>
				<div class="panel-body" id="panelBody_sport"></div>
				<!-- End of panel body -->
			</div>
			
			<div class="panel panel-primary" id="socialnews-scroll">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ព័ត៌មានសង្គម</h3>
					<div class="btn-group">
						<a class="btn search-filter" id="showSocial">ប្រចាំថ្ងៃ</a>
						<a href="#" class="dropdown-toggle btn-date"
							data-toggle="dropdown" aria-expanded="false"><span
							class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu" id="listSocial">
							<li><a>ប្រចាំថ្ងៃ</a></li>
							<li><a>ប្រចាំសប្តាស៍</a></li>
							<li><a>ប្រចាំខែ</a></li>
						</ul>
						<!--end category news-->
					</div>
				</div>
				<div class="panel-body" id="panelBody_social"></div>
				<!-- End of panel body -->
			</div>
						<div class="panel panel-primary" id="socialnews-scroll">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ព័ត៌មានសេដ្ឋកិច្ចទូទៅ</h3>
					<div class="btn-group">
						<a class="btn search-filter" id="showEconomy">ប្រចាំថ្ងៃ</a>
						<a href="#" class="dropdown-toggle btn-date"
							data-toggle="dropdown" aria-expanded="false"><span
							class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu" id="listEconomy">
							<li><a>ប្រចាំថ្ងៃ</a></li>
							<li><a>ប្រចាំសប្តាស៍</a></li>
							<li><a>ប្រចាំខែ</a></li>
						</ul>
						<!--end category news-->
					</div>
				</div>
				<div class="panel-body" id="panelBody_social"></div>
				<!-- End of panel body -->
			</div>
			
			<div class="panel panel-primary" id="socialnews-scroll">
				<div class="panel-heading">
					<h3 class="panel-title" id="title-panel">ព័ត៌មានកម្សាន្ត</h3>
					<div class="btn-group">
						<a class="btn search-filter" id="showEnterain">ប្រចាំថ្ងៃ</a>
						<a href="#" class="dropdown-toggle btn-date"
							data-toggle="dropdown" aria-expanded="false"><span
							class="glyphicon glyphicon-list"></span></a>
						<!-- category news-->
						<ul class="dropdown-menu" id="listEnterain">
							<li><a>ប្រចាំថ្ងៃ</a></li>
							<li><a>ប្រចាំសប្តាស៍</a></li>
							<li><a>ប្រចាំខែ</a></li>
						</ul>
						<!--end category news-->
					</div>
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
	<script src="js/custom/index.js"></script>
	<script>
	$("#btn-localnews").click(function() {
	    $('html, body').animate({
	        scrollTop: $("#localnews-scroll").offset().top - 70
	        
	    }, 500);
	});
	
	$("#btn-technews").click(function() {
	    $('html, body').animate({
	        scrollTop: $("#technews-scroll").offset().top - 70
	    }, 500);
	});
	$("#btn-sportnews").click(function() {
	    $('html, body').animate({
	        scrollTop: $("#sportnews-scroll").offset().top - 70
	        
	    }, 500);
	});
	$("#btn-socialnews").click(function() {
	    $('html, body').animate({
	        scrollTop: $("#socialnews-scroll").offset().top - 70
	        
	    }, 500);
	});
	
	$("#listLocal li").click(function(){
		$('#showLocal').text($(this).text());
	});
	
	$("#listTech li").click(function(){
		$('#showTech').text($(this).text());
	});
	
	$("#listSport li").click(function(){
		$('#showSport').text($(this).text());
	});
	
	$("#listKnowledge li").click(function(){
		$('#showKnowledge').text($(this).text());
	});
	
	$("#listSocial li").click(function(){
		$('#showSocial').text($(this).text());
	});
	
	$("#listEconomy li").click(function(){
		$('#showEconomy').text($(this).text());
	});
	
	$("#listEnterain li").click(function(){
		$('#showEnterain').text($(this).text());
	});
	</script>
	<!-- end custom js -->
	<!-- #####################end javascript#################### -->​​
</body>
</html>