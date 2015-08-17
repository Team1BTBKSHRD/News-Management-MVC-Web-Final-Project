<%@page import="jdk.nashorn.internal.ir.RuntimeNode.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<!-- <link href="css/bootstrap.min.css" rel="stylesheet" /> -->
<link href="https://bootswatch.com/paper/bootstrap.min.css"
	rel="stylesheet" />

<link rel="stylesheet" href="css/dataTables.bootstrap.css" />
<!-- #####################end stylesheet#################### -->
<title>Manage Profile</title>

<style>
#usermenu {
	display: none;
}

input[type="text"]:disabled {
	background: #FFFFFF;
	cursor: text;
}

#path_image {
	background: #FFFFFF;
	cursor: text;
}

input[type=file] {
	background-color: red;
	width: 92px;
	height: 40px;
	position: absolute;
	margin-top: -33px;
	margin-left: -13px;
	opacity: 0;
	cursor: inherit;
}
</style>

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
							<i class="fa fa-user"></i>
						</div>
						<div class="media-body">
							<ul class="breadcrumb">
								<li><a href="#"><i class="glyphicon glyphicon-user"></i></a></li>
								<li>Profile Page</li>
							</ul>
							<h4>Profile Page</h4>
						</div>
					</div>
					<!-- media -->
				</div>
				<!-- pageheader -->

				<div class="contentpanel">

					<div class="row row-stat">
						<div class="panel panel-info">
							<div class="panel-body">
								<div class="col-sm-8">
									<table class="table">
										<thead>
											<tr>
												<th colspan="2">CONTACT INFORMATION
													<button class="btn btn-success btn-xs delete" id="edit"
														style="margin-left: 60px;" onclick="edit()">
														<i class="fa fa-user"></i>&nbsp;&nbsp;Edit Profile
													</button>
												</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>UserName *</td>
												<td id="listusername"><input type="text" id="fullname"
													name="fullname" class="form-control" disabled required /></td>
											</tr>
											<tr>
												<td>CompanyName *</td>
												<td id="listcompanyname"><input type="text"
													id="companyname" name="companyname" class="form-control"
													disabled required /></td>
											</tr>
											<tr>
												<td>Email *</td>
												<td id="listemail"><input type="text" id="email"
													name="email" class="form-control" disabled required /></td>
											</tr>
											<tr>
												<td>Phone *</td>
												<td id="listphone"><input type="text" id="phone"
													name="phone" class="form-control" disabled required /></td>
											</tr>
											<tr>
												<td>Address *</td>
												<td id="listaddress"><input type="text" id="address"
													name="address" class="form-control" disabled required /></td>
											</tr>
											<tr>
												<td>Website *</td>
												<td id="listwebsite"><input type="text" id="website"
													name="website" class="form-control" disabled required /></td>
											</tr>
										</tbody>
									</table>
								</div>
								<!-- col-sm-8 -->
								<div class="col-sm-4">
									<div class="col-sm-9">
										<form method="post" action="UploadServlet" enctype="multipart/form-data">
											<img class="img-responsive" id="img_thumnail" src=" "
												style="width: 200px; height: 150px; border: 3px solid rgba(76, 71, 71, 0.38);"><br />
											<span style="display: inline-flex;"> <input
												type="text" class="form-control" id="path_image"
												readonly="readonly" /> <span
												class="btn btn-primary mr5 btn-file"> Browse ... <input
													type="file" name="dataFile" id="file_image" />
											</span>
											</span> <input type="submit" class="btn btn-primary mr5"
												id="update_profile" value="Update" > <input
												type="button" class="btn btn-danger mr5" id="cancle"
												value="Cancle">
										</form>
									</div>
								</div>
								<!-- col-sm-4 -->
								<div class="col-sm-4 col-sm-offset-8"></div>
							</div>
							<!--  panel-body -->
						</div>
						<!-- panel panel-info -->
					</div>
					<!-- row row-stat -->
				</div>
				<!-- contentpanel -->
			</div>
			<!-- mainpanel -->
		</div>
		<!-- mainwrapper -->
	</section>

	<!-- 	Modal Page User ADD
	<div class="modal fade" id="myModal" role="dialog">
		<div class="modal-dialog modal-md">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">EditProfile</h4>
				</div>
				<div class="modal-body">
					<form id="useradd">
						<div class="panel-body">
							<div class="row">
								<div class="form-group">
									<label class="col-sm-3 control-label">FullName <span
										class="asterisk">*</span></label>
									<div class="col-sm-9">
										<input type="text" id="fullname" name="fullname"
											class="form-control" required />
									</div>
								</div>
								form-group

								<div class="form-group">
									<label class="col-sm-3 control-label">CompanyName <span
										class="asterisk">*</span></label>
									<div class="col-sm-9">
										<input type="text" id="companyname" name="companyname"
											class="form-control" required />
									</div>
								</div>
								form-group

								<div class="form-group">
									<label class="col-sm-3 control-label">Email <span
										class="asterisk">*</span></label>
									<div class="col-sm-9">
										<input type="text" id="email" name="email"
											class="form-control" required />
									</div>
								</div>
								form-group

								<div class="form-group">
									<label class="col-sm-3 control-label">Phone <span
										class="asterisk">*</span></label>
									<div class="col-sm-9">
										<input type="text" id="phone" name="phone"
											class="form-control" required />
									</div>
								</div>
								form-group

								<div class="form-group">
									<label class="col-sm-3 control-label">Address <span
										class="asterisk">*</span></label>
									<div class="col-sm-9">
										<input type="text" id="address" name="address"
											class="form-control" required />
									</div>
								</div>
								form-group

								<div class="form-group">
									<label class="col-sm-3 control-label">WebSite <span
										class="asterisk">*</span></label>
									<div class="col-sm-9">
										<input type="text" id="website" name="website"
											class="form-control" required />
									</div>
								</div>
								form-group


								<div class="form-group">
									<label class="col-sm-3 control-label">CurrentPassword <span
										class="asterisk"></span></label>
									<div class="col-sm-9">
										<input type="password" id="currentpassword"
											name="currentpassword" class="form-control" required />
									</div>
								</div>
								form-group

								<div class="col-sm-9 col-sm-offset-8">
									<input type="submit" class="btn btn-primary mr5" id="adduser"
										value="Update"> <input type="button"
										class="btn btn-danger mr5" id="cancle" data-dismiss="modal"
										value="Cancle">

								</div>
							</div>
							row
						</div>
						panel-body
					</form>
				</div>
				modal-body
			</div>
			modal-content
		</div>
	</div>
	End Modal Page User ADD -->


	<!---------------------------Load Script-------------------------->
	<script src="js/dashboard.js"></script>
	<script src="js/jquery-1.11.1.min.js"></script>

	<script src="js/bootstrap.min.js"></script>
	<script src="js/custom.js"></script>
	<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="js/dataTables.bootstrap.js"></script>
	<script type="text/javascript" src="js/bootstrapValidator.min.js"></script>

	<!-- -------------------------Custom Javascript---------------- -->


	<script type="text/javascript"
		src="js/custom/profile_user_validate_and_edit.js"></script>
	<script type="text/javascript">
		var fileuploadname;
		jQuery(document).ready(
				function() {
					jQuery("#edit").click(function() {
						jQuery("input[type='text']").attr("disabled", false);

					});
					jQuery("#update_profile").click(function() {
						jQuery("input[type='text']").attr("disabled", true);
						
					});

					jQuery("#cancle").click(function() {
						jQuery("input[type='text']").attr("disabled", true);
					});

					$("#file_image").change(function() {
						readURL(this);
						getPath();
						fileuploadname = $("#path_image").val();
						//alert(fileuploadname);
					});

					function readURL(input) {
						if (input.files && input.files[0]) {
							var reader = new FileReader();
							reader.onload = function(e) {
								$('#img_thumnail').attr('src', e.target.result)
										.fadeIn('slow');
							};
							reader.readAsDataURL(input.files[0]);
						}
					}
					/* alert($("#file_image").val()); */
					// Basic Form
					/*  $("#basicForm").validate({
					     highlight: function(element) {
					         $(element).closest('.form-group').removeClass('has-success').addClass('has-error');
					     },
					     success: function(element) {
					        $(element).closest('.form-group').removeClass('has-error');
					     }
					 }); */
					function getPath() {
						$("#path_image").val($("#file_image").val());

					}
				});
		/*Add data to User Detail Profile */
		var userinfo =
	<%=request.getSession().getAttribute("userinfo")%>
		;
		$("#fullname").val(userinfo[0].full_name);
		$("#companyname").val(userinfo[0].com_name);
		$("#email").val(userinfo[0].email);
		$("#phone").val(userinfo[0].phone);
		$("#address").val(userinfo[0].addr);
		$("#website").val(userinfo[0].website);
		/* $("#file_image").click(function(){
			alert($("#path_image").val());
		}); */

		/* Add data to User Detail Profile*/
		/* $("#file_image").click(function(){
				
		}); */

		/* Update User Info */

		/* function edit(){
		alert("heldfre")
		jQuery("input[type='text']").attr("disabled", false);
		
		}
		function update(){
		jQuery("input[type='text']").attr("disabled", true);
		}
		function cancle(){
		jQuery("input[type='text']").attr("disabled", true);
		} */
	</script>
</body>
</html>