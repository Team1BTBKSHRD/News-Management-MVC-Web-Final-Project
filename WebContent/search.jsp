<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>news box site...</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- #####################stylesheet#################### -->
<!-- lib css -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="css/owl.theme.css">
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<!-- end lib css -->
<!-- custom css -->
<link rel="stylesheet" type="text/css" href="css/custom/index.css">
<link rel="stylesheet" type="text/css" href="css/custom/search.css">
<!-- end custom css -->
<!-- #####################end stylesheet#################### -->
</head>
<body>
	<!-- header -->
	<jsp:include page="layouts/header.jsp" />
	<!-- end header -->
	<!-- content area -->
	<div class="container content-area">
		
		<!-- left panel -->
		<div
			class="col-sm-9 content-left clear-padding-left clear-margin-bottom left-panel">
			<!-- search form -->
			<div class="panel panel-primary container-fluid clear-margin-right">
				<form role="search" action="search" method="post">
					<div class="col-sm-6 form-group clear-paddings search-wrapper">
						<input type="text" placeholder="ស្វែងរក..." name="title" id="txtsearch-input" value="${param['title']}">
						<button type="submit" class="btn btn-primary ">ស្វែងរក</button>
					</div>
					<div class=" form-group col-sm-6">
						<div class="btn-group combo-news">
							<a href="#" class="btn btn-default  search-filter">ប្រភេទព័ត៌មាន</a>
							<a href="#" class="btn btn-default  dropdown-toggle"
								data-toggle="dropdown" aria-expanded="false"><span
								class="caret"></span></a>
							<!-- category news-->
							<ul class="dropdown-menu drop-category" id="lstcategory">
								

							</ul>
							<!--end category news-->
						</div>
						<div class="btn-group combo-news drop-source">
							<a href="#" class="btn btn-default search-filter">ប្រភពព័ត៌មាន</a>
							<a href="#" class="btn btn-default dropdown-toggle"
								data-toggle="dropdown" aria-expanded="false"><span
								class="caret"></span></a>
							<!--news source-->
							<ul class="dropdown-menu" id="lstnewsources">
								
							</ul>
							<!--end news source-->
						</div>
						<!-- --------------------------------------- -->
						<div class="btn-group combo-news">
							<a href="#" class="btn btn-default  search-filter">ពេលវេលា</a>
							<a href="#" class="btn btn-default  dropdown-toggle"
								data-toggle="dropdown" aria-expanded="false"><span
								class="caret"></span></a>
							<!-- category news-->
							<ul class="dropdown-menu drop-category" id="lsttime">
							</ul>
							<!--end category news-->
						</div>
					</div>
					<div class="clearfix"></div>
				</form>
			</div>
			<!-- end search form -->
			
			<!-- result list -->
			<div class="panel panel-primary col-sm-12 search-result-wrapper">
				<!-- search result -->
				<div class="col-sm-12 search-result">
					<a href="#">
						<h5 class="article-name clear-margin-top">សេដ្ឋី​វ័យ​ក្មេង​ឥណ្ឌា​បញ្ជូន​កូន​ស្រី​ទៅ​ធ្វើ​ព្រះ​...</h5>
						<strong>ផ្សាយ <kbd> 2015/03/07 </kbd></strong>
						<p class="clear-margin-bottom text-2">
							Lorem ipsum dolor sit amet, consectetur adipisicing elit. Unde exercitationem similique ducimus iusto reprehenderit vitae, ab nihil, deleniti incidunt optio ad illum aspernatur. Assumenda, officia, et! Est repudiandae officiis dolore necessitatibus. Alias quod consequatur nesciunt? Magnam ad odio commodi quasi assumenda quae harum eaque quos, autem voluptates ab ipsa deleniti aliquam eligendi nemo nobis illum excepturi delectus cupiditate adipisci soluta rerum repellat corporis libero cumque. Eos harum incidunt fuga, obcaecati, delectus eveniet pariatur voluptas mollitia alias facere? Tenetur quibusdam quas voluptate quod sapiente dolorem et tempora animi repellat quisquam, soluta esse facilis est recusandae dicta, quae illum beatae nostrum ex!
						</p> 
						<strong class="news-source">ប្រភពពត៌មាន<kbd>Sabay</kbd></strong>
						<div class="clearfix"></div>
					</a>
				</div>
				<!--end search result -->
				
				
				<!-- pagination navigation -->
				<ul class="pager  clear-padding-right">
					<li class="previous"><a href="#">Previous</a></li>
					<li class="active"><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li class="next"><a href="#">Next</a></li>
				</ul>
				<!--end pagination navigation -->
			</div>
			<!--end result list -->
		</div>
		<!-- end left panel -->
		<!-- right panel -->
		<jsp:include page="layouts/right-panel.jsp" />
		<%-- <jsp:include page="layouts/topfive.jsp" /> --%>
		<!-- end right panel -->
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
	<!-- end lib js -->
	<!-- custom js -->
	<script src="js/custom/search.js"></script>
	<script src="js/custom/exchange.js"></script>
	<!-- end custom js -->
	<!-- #####################end javascript#################### -->
	​​
</body>
</html>
