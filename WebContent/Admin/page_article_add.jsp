<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
      	<!-- -----------Load Style reponsive----------- -->
        <link href="css/style.default.css" rel="stylesheet">
        <link href="css/morris.css" rel="stylesheet">
        <link href="css/select2.css" rel="stylesheet" />
        <link href="css/bootstrap.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="css/dataTables.bootstrap.css"/>
        <!-- #####################end stylesheet#################### -->
        
<title>Manage Article</title>
<link href="css/summernote.css" rel="stylesheet">
<!-- style for laout profile -->
<style>
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
							<i class="fa fa-edit"></i>
						</div>
						<div class="media-body">
							<ul class="breadcrumb">
								<li><a href="#"><i class="glyphicon glyphicon-edit"></i></a></li>
								<li>Article</li>
							</ul>
							<h4>Managearticle</h4>
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
												<th>NewsTitle</th>
												<th>NewsCategory</th>
												<th>NewsImage</th>
												<th>NewsDate</th>
												<th>Action</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td>Mark</td>
												<td>Otto</td>
												<td>Otto</td>
												<td>Otto</td>
												<td>
													<button class="btn btn-success btn-xs">
														<i class="fa fa-pencil-square-o"></i>&nbsp;&nbsp;Edit
													</button>
													<button class="btn btn-danger btn-xs delete">
														<i class="fa fa-trash-o"></i>&nbsp;&nbsp;Delete
													</button>
												</td>
											</tr>
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
															<label class="col-sm-2 control-label">NewsTitle <span
																class="asterisk">*</span></label>
															<div class="col-sm-5">
																<input type="text" id="newstitle" name="newstitle"
																	class="form-control" placeholder="title" required />
															</div>
														</div>
														<!-- form-group -->

														<div class="form-group">
															<label class="col-sm-2 control-label">NewsCategory
																<span class="asterisk">*</span>
															</label>
															<div class="col-sm-5">
																<select class="form-control" id="newscategory"
																	name="newscategory">
																	<option value="">select category</option>
																	<option value="ព័ត៌មានជាតិទូទៅ">ព័ត៌មានជាតិទូទៅ</option>
																	<option value="ព័ត៌មានជាតិទូទៅ">ព័ត៌មានជាតិទូទៅ</option>
																	<option value="ព័ត៌មានជាតិទូទៅ">ព័ត៌មានជាតិទូទៅ</option>
																	<option value="ព័ត៌មានជាតិទូទៅ">ព័ត៌មានជាតិទូទៅ</option>
																</select>
															</div>
														</div>
														<!-- form-group -->

														<div class="form-group">
															<label class="col-sm-2 control-label">NewsDescription
																<span class="asterisk">*</span>
															</label>
															<div class="col-sm-5">
																<input type="text" id="news_des" name="news_des"
																	class="form-control" placeholder="Description" required />
															</div>
														</div>
														<!-- form-group -->

														<div class="form-group">
															<label class="col-sm-2 control-label">NewsContentDetail
																<span class="asterisk">*</span>
															</label>
															<div class="col-sm-10">
																<!--  <textarea class="form-control ckeditor" name="news_con_detail" id="news_con_detail"></textarea> -->
																<!--   <div id="summernote"></div> -->
																<textarea class="form-control" name="news_con_detail"
																	id="news_con_detail"></textarea>
															</div>
														</div>
														<!-- form-group -->

														<div class="form-group">
															<label class="col-sm-2 control-label">NewsPath <span
																class="asterisk">*</span></label>
															<div class="col-sm-5">
																<input type="text" id="newspath" name="newspath"
																	class="form-control" value="http://" required />

															</div>
														</div>
														<!-- form-group -->

														
														<div class="form-group">
															<label class="col-sm-2 control-label">Image Thumnail <span
																class="asterisk">*</span></label>
																<div class="col-sm-4">
															<div class="col-sm-12">
																<img class="img-responsive" id="img_thumnail" src="img/no_img_available_atricle.png"><br /> 																	
																<span style="display: inline-flex;">
																	<input type="text" class="form-control" /> 
																	<span class="btn btn-default btn-file"> Browse ... 
																		<input type="file" name="photo" id="file_image">
																	</span>
																</span>
															</div>
														</div><!-- col-sm-4 -->
														</div>
														<!-- form-group -->
														
														<div class="col-sm-9 col-sm-offset-10">
														<br />
															<button class="btn btn-primary mr5" id="adduser">Add</button>
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
         <!-- <script src="js/dashboard.js"></script>  -->
         <script src="js/jquery-1.11.1.min.js"></script>
		 <script src="js/bootstrap.min.js"></script>
		 <script src="js/custom.js"></script>
		 <script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
		 <script type="text/javascript" src="js/dataTables.bootstrap.js"></script>
		 <script type="text/javascript" src="js/bootstrapValidator.min.js"></script> 

    <!-- -------------------------Custom Javascript---------------- -->

	<script src="js/custom/script_article_add.js"></script>
	
	<script type="text/javascript">
	jQuery("#file_image").change(function(){
	    readURL(this);
	    alert(jQuery('#img_thumnail').attr('src'));
	});

	function readURL(input) {
	    if (input.files && input.files[0]) {
	        var reader = new FileReader();

	        reader.onload = function (e) {
	        	jQuery('#img_thumnail').attr('src', e.target.result).fadeIn('slow');
	        };
	        reader.readAsDataURL(input.files[0]);
	    }
	}
	
	</script>
</body>
</html>