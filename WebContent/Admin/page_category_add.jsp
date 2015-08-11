<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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

<title>Manage Category</title>

<!-- <link
	href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.5.1/summernote.css"
	rel="stylesheet"> -->

<!--   <style>
    th{text-align: center;}
    @media screen and (max-width: 600px) {
        #tablerepone {
            overflow: scroll;
        }
    }
    </style> -->
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
							<i class="fa fa-edit"></i>
						</div>
						<div class="media-body">
							<ul class="breadcrumb">
								<li><a href="#"><i class="glyphicon glyphicon-edit"></i></a></li>
								<li>Category</li>
							</ul>
							<h4>ManageCategory</h4>
						</div>
					</div>
					<!-- media -->
				</div>
				<!-- pageheader -->

				<div class="contentpanel">

					<div class="row row-stat">
						<div class="col-md-12">
							<div class="panel panel-info">
								<div class="panel-body" id="tablerepone">
									<table id="listarticle"
										class="table table-striped table-bordered table-primary mb30"
										cellspacing="0" width="100%">
										<thead>
											<tr>
												<th>CategoryName</th>
												<th>CategoryDescription</th>
												<th>Action</th>
											</tr>
										</thead>
										<tbody id="show">

										</tbody>
									</table>
									<button class="btn btn-success btn-xs delete"
										data-toggle="collapse" data-target="#demo">
										<i class="fa fa-plus"></i>&nbsp;&nbsp;AddNewArticle
									</button>

									<div class="row">
										<!--  row  form -->
										<br />
										<div
											style="width: 100%; height: 1px; background-color: #BCE8F1;"></div>
										<div id="demo" class="collapse">
											<form id="basicForm">
												<div class="panel-body">
													<div class="row">
														<div class="form-group">
															<label class="col-sm-2 control-label">NewCategory
																<span class="asterisk">*</span>
															</label>
															<div class="col-sm-5">
																<input type="text" id="newcategory" name="newcategory"
																	class="form-control" placeholder="categoryname"
																	required />
															</div>
														</div>
														<!-- form-group -->

														<div class="form-group">
															<label class="col-sm-2 control-label">Description
																<span class="asterisk">*</span>
															</label>
															<div class="col-sm-5">
																<input type="text" id="cate_desc" name="cate_desc"
																	class="form-control" placeholder="description" required />
															</div>
														</div>
														<!-- form-group -->

														<div class="col-sm-9 col-sm-offset-2">
															<button class="btn btn-primary mr5" id="adduser" onClick="addNewCategory();">Add</button>
														</div>
													</div>
													<!-- row -->
												</div>
												<!-- panel-body -->
											</form>
											<!-- collapse -->
										</div>
										<!--  row  form -->
									</div>
									<!--  panel-body -->
								</div>
								<!-- panel panel-info -->
							</div>
							<!-- col-md-12 -->
						</div>
						<!-- row -->
					</div>
					<!-- contentpanel -->
				</div>
				<!-- mainpanel -->
			</div>
			<!-- mainwrapper -->
		</div>
	</section>


	<!---------------------------Load Script-------------------------->
	<script src="js/dashboard.js"></script>
	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/custom.js"></script>
	<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="js/dataTables.bootstrap.js"></script>
	<script type="text/javascript" src="js/bootstrapValidator.min.js"></script>
	<script type="text/javascript">
	
		var name='<%=session.getAttribute("admin")%>';
		alert(name + "List cat_name, cat_desc by user");	
		$, post("pg_cate_tblistcategory.news", {
			full_name : name
		}, function(data) {
			//$("#show").html(tblistArticle(data));
		});
		function tblistArticle(data) {
			var str = "";
			for (var i = 0; i < data.length; i++) {

				str += "<tr>" + "<td id=cat_code" + data[i].cat_code + ">"
						+ data[i].cat_name + "</td>" + "<td>"
						+ data[i].cat_desc + "</td>"+ "<td>" + btnAction(i)
						+ "</td>" + "</tr>";
			}
			return str;
		}
		function btnAction(i) {
			var btn = "<button class='btn btn-success btn-xs' id='btnedit"+i+"'>"
					+ "<i class=fa fa-pencil-square-o></i>"
					+ "&nbsp;&nbsp;Edit</button>"
					+ "<button class='btn btn-danger btn-xs delete' id='btnremove"+i+"'>"
					+ "<i class=fa fa-trash-o></i>&nbsp;&nbsp;Delete</button>";
			return btn;
		}
		/* Action Add New Category */
		function addNewCategory(){
			alert("Add Category");
		}
	</script>
	<!-- -------------------------Custom Javascript---------------- -->
	<script src="js/custom/script_category_add.js"></script>
	<!-- <script type="text/javascript">
			$("#main_menu_article").removeClass("parent" ).addClass("parent parent-focus" );
			$("#sub_menu_managecategory").addClass("active" );
	</script> -->

</body>
</html>