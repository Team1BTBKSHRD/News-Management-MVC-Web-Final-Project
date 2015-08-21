<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="Controller.FrontEnd.Category"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<title>news box site...</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
​​<link rel="shortcut icon" href="img/box.png" />
<!-- lib css -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="css/owl.theme.css">
<link rel="stylesheet" href="css/responsive.css">
<!-- end lib css -->
<!-- custom css -->
<link rel="stylesheet" type="text/css" href="css/custom/index.css">
<link rel="stylesheet" type="text/css" href="css/custom/owl.css">
<link rel="stylesheet" type="text/css" href="css/custom/category-btn.css">
<!-- end custom css -->
​​
</head>
<body>
	<%
		session.removeAttribute("admin");
	%>
	<!-- header -->
	<jsp:include page="layouts/header.jsp" />
	<!-- end header -->
	<!-- content area -->
	<div class="container content-area">
		<!-- search panel -->
		<jsp:include page="layouts/searchbar.jsp" />
		<!-- end search panel -->
		<!-- right panel -->
		<div class="col-md-9 col-sm-9 col-xs-9 clear-padding-left left-panel">
			<!-- article header-->
			<div class="category-header col-sm-12 clear-paddings"
				style="overflow: hidden !important;">
				<img
					src="http://cdn.sabay.com/cdn/news.sabay.com.kh/wp-content/uploads/2015/08/CMFgIPLWIAAIZ_w.jpg?ebb82d"
					height="300px" width="100%" alt="Mirror Edge">
				<div class="category-title "
					style="position: absolute; width: 94%; bottom: 7%; overflow: hidden; left: 3%; height: 89px; background-color: #50a253; opacity: 0.97;">
					<h4 class="article-name" style="color: #FFE4F4; font-size: 30px;">ព័ត៌មានកីឡា</h4>
				</div>
			</div>
			<div class="panel panel-primary clear-paddings"
				style="margin-top: 16px;">

				<div class="panel-body" id="panelCategory">
					<!-- End of panel body -->
					
					<%-- <%ResultSet rs=(ResultSet)request.getAttribute("rs"); %> --%>	
					<c:forEach var="record" items="${rs.rows}">
						<div class='card-1' id='card-1'>
							<a href='${record.news_path}' target='_blank' id='link-1'>
								<div class='col-md-3 col-sm-3 col-xs-3 clear-paddings'>
									<img src='${record.news_img}' class='img-responsive' height='153px' id='img-1'>
								</div>
								<div class='col-md-8 col-sm-8 col-xs-8 card-details'>
									<h5 class='text-h5-2 article-title' id='title-1'> ${record.news_title}</h5>
									<p class='text-3 news-description' id='des-1'> ${record.news_desc} </p>
									<div class='col-md-12 col-sm-12 col-xs-12 clear-paddings news-info' id='info-1'>
										អាន   ${record.count_visited} |   ${record.news_date}  |  ${record.full_name} 
									</div> 
								</div> 
							</a>
						</div>
						<hr/>
					</c:forEach>
				</div>
			</div>
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
	​
	<!-- lib js -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<!-- end lib js -->
	<!-- custom js -->
	<script src="js/custom/owl.js"></script>
	<script src="js/custom/right-panel.js"></script>
	<!-- end custom js -->
	<!-- #####################end javascript#################### -->
</body>
</html>