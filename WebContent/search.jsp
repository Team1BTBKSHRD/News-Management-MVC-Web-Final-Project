<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>news box site...</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- #####################stylesheet#################### -->
​​
<!-- lib css -->
<link rel="stylesheet" href="css/font-google-open-sans.css">
<link rel="stylesheet" href="css/font-google-roboto-condensed.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/owl.carousel.css">
<link rel="stylesheet" href="css/owl.theme.css">
<link rel="stylesheet" href="css/owl.transitions.css">
<link rel="stylesheet" href="css/responsive.css">
<!-- end lib css -->
<!-- custom css -->
<link rel="stylesheet" type="text/css" href="css/custom/index.css">
<link rel="stylesheet" type="text/css" href="css/custom/search.css">
<link rel="stylesheet" type="text/css" href="css/custom/owl.css">
<!-- end custom css -->
<!-- #####################end stylesheet#################### -->
</head>
<body>
	​​
	<!-- header -->
	<jsp:include page="layouts/header.jsp" />
	<!-- end header -->
	<!-- content area -->
	<div class="container content-area">
		<!-- right panel -->
		<div
			class="col-sm-3 content-right clear-paddings clear-margins pull-right">
			<jsp:include page="layouts/topfive.jsp" />
		</div>
		<!-- end right panel -->
		<!-- left panel -->
		<div
			class="col-sm-9 content-left clear-padding-left clear-margin-bottom">
			<!-- search form -->
			<div class="panel panel-primary container-fluid clear-margin-right">
				<form role="search">
					<div class="col-sm-7 form-group clear-paddings search-wrapper">
						<input type="text" placeholder="ស្វែងរក..." id="txtSearch">
						<button type="submit" class="btn btn-primary ">ស្វែងរក</button>
					</div>
					<div class=" form-group col-sm-5">
						<div class="btn-group combo-news">
							<a href="#" class="btn btn-default  search-filter">ប្រភេទព័ត៌មាន</a>
							<a href="#" class="btn btn-default  dropdown-toggle"
								data-toggle="dropdown" aria-expanded="false"><span
								class="caret"></span></a>
							<!-- category news-->
							<ul class="dropdown-menu">
								<li><a href="#">ជីវិត&amp;សង្គម</a></li>
								<li><a href="#">សេដ្ឋកិច្ច</a></li>
								<li><a href="#">កីឡា</a></li>
								<li><a href="#">កំសាន្ត</a></li>
								<li><a href="#">បច្ចេកវីទ្យា</a></li>
								<li><a href="#">អាហារូបករណ៍</a></li>

							</ul>
							<!--end category news-->
						</div>
						<div class="btn-group combo-news">
							<a href="#" class="btn btn-default search-filter">ប្រភពព័ត៌មាន</a>
							<a href="#" class="btn btn-default dropdown-toggle"
								data-toggle="dropdown" aria-expanded="false"><span
								class="caret"></span></a>
							<!--news source-->
							<ul class="dropdown-menu">
								<li><a href="#">sabay news</a></li>
								<li><a href="#">kohsantepheab</a></li>
								<li><a href="#">daps-news</a></li>
								<li><a href="#">news box</a></li>
							</ul>
							<!--end news source-->
						</div>
					</div>
					<div class="clearfix"></div>
				</form>
			</div>
			<!-- end search form -->

			<!-- result list -->
			<div class="panel panel-primary col-sm-10 search-result-wrapper">
				<div class="col-sm-12 search-result-count">
					<strong><h6>
							លទ្ធផលស្វែងរកឃើញចំនួន<span id="news-result-search">157</span>
						</h6></strong>

				</div>


				<div class="col-sm-12 search-result">
					<a href="#">
						<h5 class="article-name clear-margin-top">សេដ្ឋី​វ័យ​ក្មេង​ឥណ្ឌា​បញ្ជូន​កូន​ស្រី​ទៅ​ធ្វើ​ព្រះ​...</h5>
						<strong> ផ្សាយថ្ងៃ <kbd> 2015/03/07 </kbd>
					</strong>
						<p class="clear-margin-bottom text-2">
							បន្ទាប់​ពី​ភរិយា​ស្លាsdfgsdfgsdfgsdfgdfgsdfgsdfgប់​ទៅ កាពីទែន​
							បន្ទាប់​ពី​ភរិយា​ស្លាsdfgsdfgsdfgsdfgdfgsdfgsdfgប់​ទៅ កាពីទែន​
							បន្ទាប់​ពី​ភរិយា​ស្លាsdfgsdfgsdfgsdfgdfgsdfgsdfgប់​ទៅ កាពីទែន​
							គ្រូវី​ដែល​ល្បី​ល្បាញ​ថា​ជា​សេ បន្ទាប់​ពី​ភរិយា​ស្លាប់​ទៅ
							កាពីទែន​ គ្រូវី​ដែល​ល្បី​ល្បាញ​ថា​ជា​សេ
							បន្ទាប់​ពី​ភរិយា​ស្លាប់​ទៅ កាពីទបន្ទាប់​ពី​ភរិយា​ស្លាប់​ទៅ
							កាពីទបន្ទាប់​ពី​ភរិយា​ស្លាប់​ទៅ
							កាពីទបន្ទាdfgsdfgsdfgsdfgsdfgsdប់​ពី​ភរិយា​ស្លាប់​ទៅ កាពីទ
							&lt;strong class="news-source"&gt;ប្រភពពត៌មាន&lt;ky&lt;/</p> <strong
						class="news-source">ប្រភពពត៌មាន<kbd>Sabay</kbd></strong>
						<div class="clearfix"></div>
					</a>
				</div>


				<ul class="pager  clear-padding-right">
					<li class="previous"><a href="#">Previous</a></li>
					<li class="active"><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li class="next"><a href="#">Next</a></li>
				</ul>
			</div>
			<!--end result list -->

		</div>
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
	<script src="js/owl.carousel.js"></script>
	<!-- end lib js -->
	<!-- custom js -->
	<script src="js/custom/owl.js"></script>
	<script>
		document.write('<script src="http://'
				+ (location.host || 'localhost').split(':')[0]
				+ ':35729/livereload.js?snipver=2"></' + 'script>');
	</script>
	<!-- end custom js -->
	<!-- #####################end javascript#################### -->
	​​
</body>
</html>
