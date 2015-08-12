<%@page import="java.nio.channels.SeekableByteChannel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<!-- -----------Load Style reponsive----------- -->
<link href="css/style.default.css" rel="stylesheet">
<link href="css/morris.css" rel="stylesheet">
<link href="css/select2.css" rel="stylesheet" />
<link href="css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="css/dataTables.bootstrap.css" />
<!-- #####################end stylesheet#################### -->

<title>index</title>





</head>
<body>

	<jsp:include page="layout/header_navibar.jsp"></jsp:include>

	<section>
		<div class="mainwrapper">
			<jsp:include page="layout/menu_left.jsp"></jsp:include>


			<div class="mainpanel">
				<div class="pageheader">
					<div class="media">
						<div class="pageicon pull-left">
							<i class="fa fa-home"></i>
						</div>
						<div class="media-body">
							<ul class="breadcrumb">
								<li><a href="#"><i class="glyphicon glyphicon-home"></i></a></li>
								<li>Dashboard</li>
							</ul>
							<h4>Dashboard</h4>
						</div>
					</div>
					<!-- media -->
				</div>
				<!-- pageheader -->

				<div class="contentpanel">

					<div class="row row-stat">
						<div class="col-md-4">
							<div class="panel panel-success-alt noborder">
								<div class="panel-heading noborder">
									<div class="panel-btns">
										<a href="#" class="panel-close tooltips" data-toggle="tooltip"
											title="Close Panel"><i class="fa fa-times"></i></a>
									</div>
									<!-- panel-btns -->
									<div class="panel-icon">
										<i class="fa fa-flag"></i>
									</div>
									<div class="media-body">
										<h5 class="md-title nomargin">All Category</h5>
										<h1 class="mt5" id="das_cou_category">0</h1>
									</div>
									<!-- media-body -->
									<hr>
									<!-- <div class="clearfix mt20">
									<div class="pull-left">
										<h5 class="md-title nomargin">Yesterday</h5>
										<h4 class="nomargin">$29,009.17</h4>
									</div>
									<div class="pull-right">
										<h5 class="md-title nomargin">This Week</h5>
										<h4 class="nomargin">$99,103.67</h4>
									</div>
								</div> -->

								</div>
								<!-- panel-body -->
							</div>
							<!-- panel -->
						</div>
						<!-- col-md-4 -->

						<div class="col-md-4">
							<div class="panel panel-primary noborder">
								<div class="panel-heading noborder">
									<div class="panel-btns">
										<a href="#" class="panel-close tooltips" data-toggle="tooltip"
											title="Close Panel"><i class="fa fa-times"></i></a>
									</div>
									<!-- panel-btns -->
									<div class="panel-icon">
										<i class="fa fa-users"></i>
									</div>
									<div class="media-body">
										<h5 class="md-title nomargin">All User Account</h5>
										<h1 class="mt5" id="das_cou_account">0</h1>
									</div>
									<!-- media-body -->
									<hr>
									<!-- <div class="clearfix mt20">
									<div class="pull-left">
										<h5 class="md-title nomargin">Yesterday</h5>
										<h4 class="nomargin">10,009</h4>
									</div>
									<div class="pull-right">
										<h5 class="md-title nomargin">This Week</h5>
										<h4 class="nomargin">178,222</h4>
									</div>
								</div> -->

								</div>
								<!-- panel-body -->
							</div>
							<!-- panel -->
						</div>
						<!-- col-md-4 -->

						<div class="col-md-4">
							<div class="panel panel-dark noborder">
								<div class="panel-heading noborder">
									<div class="panel-btns">
										<a href="#" class="panel-close tooltips" data-toggle="tooltip"
											data-placement="left" title="Close Panel"><i
											class="fa fa-times"></i></a>
									</div>
									<!-- panel-btns -->
									<div class="panel-icon">
										<i class="fa fa-pencil"></i>
									</div>
									<div class="media-body">
										<h5 class="md-title nomargin">All Article Post</h5>
										<h1 class="mt5" id="das_cou_article">0</h1>
									</div>
									<!-- media-body -->
									<hr>
									<!-- <div class="clearfix mt20">
									<div class="pull-left">
										<h5 class="md-title nomargin">Yesterday</h5>
										<h4 class="nomargin">144,009</h4>
									</div>
									<div class="pull-right">
										<h5 class="md-title nomargin">This Week</h5>
										<h4 class="nomargin">987,212</h4>
									</div>
								</div> -->

								</div>
								<!-- panel-body -->
							</div>
							<!-- panel -->
						</div>
						<!-- col-md-4 -->
					</div>
					<!-- row -->


					<div class="row row-dashboard">
						<div class="panel panel-info">
							<div class="panel-heading">
								<span
									style="text-transform: uppercase; font-size: 14px; font-weight: bold;"
									class="label_summery">Summery Article Post</span>
							</div>
							<!-- panel-heading -->
							<div class="panel-body">
								<div class="input-group mb15">
									<span class="input-group-addon"><i
										class="glyphicon glyphicon-user"></i></span> <select
										class="form-control" style="display: inline; width: 200px;"
										id="usertype" name="usertype" onChange="selectchanged()"
										required>

									</select>
								</div>
								<!-- input-group mb15 -->


								<h6
									style="text-transform: uppercase; font-size: 12px; font-weight: bold;">
									UserType:&nbsp;&nbsp;<span id="summery_show_usertype"></span>
								</h6>

								<h6
									style="text-transform: uppercase; font-size: 12px; font-weight: bold;">
									Number of Artcle Post:&nbsp;&nbsp;<span
										id="summery_count_of_article"></span>
								</h6>
								<br />
								<div
									style="width: 100%; height: 1px; background-color: #BCE8F1;"></div>
								<br />
								<div class="col-sm-12">
									<table id="article_list_dasborad"
										class="table table-striped table-bordered table-primary mb30"
										cellspacing="0" width="100%">
										<thead>
											<tr>
												<th>#</th>
												<th>Title</th>
												<th>Date</th>
											</tr>
										</thead>
										<tbody id="list_user_article"></tbody>
									</table>
								</div>
								<!-- col-sm-12 -->
							</div>
							<!-- panel-body -->
						</div>
						<!-- panel panel-info -->
					</div>
					<!-- row -->

				</div>
				<!-- contentpanel -->

			</div>
			<!-- mainpanel -->
		</div>
		<!-- mainwrapper -->
	</section>
	<!---------------------------Load Script-------------------------->
	<script src="js/dashboard.js"></script>
	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/custom.js"></script>
	<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="js/dataTables.bootstrap.js"></script>
	<script type="text/javascript" src="js/bootstrapValidator.min.js"></script>

	<!-- -------------------------Custom Javascript---------------- -->

	<script type="text/javascript">
		/* $('#article_list_dasborad').dataTable({
			"lengthMenu" : [ [ 5, 10, 30, -1 ], [ 5, 10, 30, "All" ] ]
		}); */
	</script>
	<script type="text/javascript">
		//alert(099000);
		/* $(document).ready(function(){
		
			
		}); */
		$.post("counts.news", function(data) {
			for (var i = 0; i < data.length; i++) {
				if (data[i].tbnews == "news_id") {

					$("#das_cou_article").text(data[i].count);
				} else if (data[i].tbnews == "user_id") {

					$("#das_cou_account").text(data[i].count);
				} else if (data[i].tbnews == "cat_id") {

					$("#das_cou_category").text(data[i].count);
				}
			}
			/* DropList user */
			$.post("sourceDropList.news", function(data) {
				$("#usertype").html(userDropList(data));

			});
		});

		/* DropList user */
		function userDropList(data) {
			var str = "";
			for (var i = 0; i < data.length; i++) {
				str += "<option value=" + data[i].full_name + ">"
						+ data[i].full_name;
			}
			str += "</optiont>";
			return str;
		}

		/* Select Change by User */
		function selectchanged() {
			$('#article_list_dasborad').dataTable().fnDestroy();
			var user = $("#usertype").val();
			alert(user);
			 $.post("selectTypeArticles.news", {
				full_name : user
			}, function(data) {
				$("#summery_count_of_article").text(data[0].total);
				$("#summery_show_usertype").text(data[0].u_type);
			});

			$.post("listarticle.news", {
				full_name : user
			}, function(data) {
				$("#list_user_article").html(listobjectdetails(data));

				$('#article_list_dasborad').dataTable({
					/*  "bRetrieve":true, */
					/*"bDestroy":true, */
					/* paging: false,
					searching: false, */
					"lengthMenu" : [ [ 5, 10, 30, -1 ], [ 5, 10, 30, "All" ] ]
				});
			});
		}

		/* Creating Table for article post */
		function listobjectdetails(data) {
			var str = "";
			for (var i = 0; i < data.length; i++) {

				str += "<tr>" + "	<td>" + (i + 1) + "</td>" + "<td>"
						+ data[i].news_title + "</td>" + "<td>"
						+ data[i].news_date + "</td>" + "</tr>";
			}

			/* str += "</table>"; */

			return str;
		}
	</script>
</body>
</html>