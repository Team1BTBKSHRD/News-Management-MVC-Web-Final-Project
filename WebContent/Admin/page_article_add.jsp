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

@media screen and (max-width: 1000px) {
	.table_respone {
		overflow: scroll;
	}
} /* class for responsive table scrollbar */
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
								<div class="panel-body">
									<div class="table_respone">
										<table id="listarticle" class="table table-striped table-bordered table-primary mb30" cellspacing="0" width="100%">
											<thead>
												<tr>
													<th>NewsTitle</th>
													<th>NewsCategory</th>
													<th>NewsImage</th>
													<th>NewsDate</th>
													<th>Action</th>
												</tr>
											</thead>
											<tbody id="show">

											</tbody>
										</table>
									</div>
									<!-- table_respone -->
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
															<label class="col-sm-2 control-label">Image
																Thumnail <span class="asterisk">*</span>
															</label>
															<div class="col-sm-4">
																<div class="col-sm-12">
																	
																	<img class="img-responsive" id="img_thumnail"
																		src="img/no_img_available_atricle.png">
																</div>
																<div class="col-sm-9">
																	<span style="display: inline-flex;"> <input
																		type="text" class="form-control" /> <span
																		class="btn btn-default btn-file"> Browse ... 
																		<input type="file" name="photo" id="file_image" required/>
																		
																	</span>
																	</span>
																</div>	
																<div class="col-sm-3">	
																	<input id="imguploads" class="btn btn-primary btn-lg" type="button" value="Upload
																Photo"/>
																</div>
																</div>
															</div>
															<!-- col-sm-4 -->
														</div>
														<!-- form-group -->

														<div class="col-sm-4 col-sm-offset-8">
															<br />
															
															<button class="btn btn-primary btn-lg" id="addArticle">Add</button>
														</div>
													</div>
													<!-- row -->
												</div>
												<!-- panel-body -->
										
										<!-- collapse -->
										</div>
										<!-- row form -->
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

	<!-- -------------------------Custom Javascript---------------- -->

	<script src="js/custom/script_article_add.js"></script>
	<script src="js/validate/page_article_validate.js"></script>
	<!--  script for validate add aticle sarin -->

	<%-- <script type="text/javascript">
		jQuery("#file_image").change(function() {
			readURL(this);
			alert(jQuery('#img_thumnail').attr('src'));
		});

		function readURL(input) {
			if (input.files && input.files[0]) {
				var reader = new FileReader();

				reader.onload = function(e) {
					jQuery('#img_thumnail').attr('src', e.target.result)
							.fadeIn('slow');
				};
				reader.readAsDataURL(input.files[0]);
			}
		}
	</script>

	<script type="text/javascript">
		var name='<%=session.getAttribute("admin")%>';
		$.post("listarticle.news", function(data) {
			$('#listarticle').dataTable().fnDestroy();
			$("#show").html(tblistArticle(data, name));
			$('#listarticle').dataTable({
				"lengthMenu" : [ [ 5, 10, 30, -1 ], [ 5, 10, 30, "All" ] ]
			/* Sarin add datatable */
			});
			//alert(data[0].news_title+"/"+data[0].cat_code+"/"+data[0].news_img+"/"+data[0].news_date);
		});

		function tblistArticle(data, name) {
			var str = "";
			for (var i = 0; i < data.length; i++) {
				if (data[i].full_name == name) {
					str += "<tr>"
							+ "<td style='padding-top:29px' id=news_id" + data[i].news_id + ">"
							+ "<a href="+data[i].news_path+" target='_blank' style='text-decoration:none;'>"
							+ data[i].news_title + "</a></td>" + "<td>"
							+ data[i].cat_name + "</td>" + "<td>"
							+ getimage(data[i].news_img) + "</td>" + "<td>"
							+ data[i].news_date + "</td>"
							+ "<td style='text-align: center;'>" + btnAction(i)
							+ "</td>" + "</tr>";
				}
			}
			return str;
		}
		function btnAction(i) {/* sarin edit button to disable and enable*/
			var btn = "<button class='btn btn-success btn-xs' id='btnenable" + i + "'>"
					+ "<i class='fa fa-thumbs-up'></i>"
					+ "&nbsp;&nbsp;Enable</button>&nbsp;"
					+ "<button class='btn btn-danger btn-xs delete' id='btndisable" + i
					+ "'>"
					+ "<i class='fa fa-thumbs-down'></i>&nbsp;&nbsp;Disable</button>";
			return btn;
		}

		/* ------------Sarin fucntion get image-------- */
		function getimage(data) {
			var str = "";
			str += "<img src="+data+" width=100px/>";
			return str;
		}
	</script> --%>
	
	<!--  script for validate add aticle sarin -->

	<script type="text/javascript">
		jQuery("#file_image").change(function() {
			readURL(this);
			alert(jQuery('#img_thumnail').attr('src'));
		});

		function readURL(input) {
			if (input.files && input.files[0]) {
				var reader = new FileReader();

				reader.onload = function(e) {
					jQuery('#img_thumnail').attr('src', e.target.result)
							.fadeIn('slow');
				};
				reader.readAsDataURL(input.files[0]);
			}
		}
	</script>

	<script type="text/javascript">
		var name='<%=session.getAttribute("admin")%>';
		
		
		
		$.post("listarticle.news",{full_name:name}, function(data) {
			$('#listarticle').dataTable().fnDestroy();
			$("#show").html(tblistArticle(data));
			$('#listarticle').dataTable({
				"lengthMenu" : [ [ 5, 10, 30, -1 ], [ 5, 10, 30, "All" ] ]
			/* Sarin add datatable */
			});
			//alert(data[0].news_title+"/"+data[0].cat_code+"/"+data[0].news_img+"/"+data[0].news_date);
		});
		
		
		

		function tblistArticle(data) {
			var str = "";
			/* alert(data[i].news_status); */
			alert(data.length);
			for (var i = 0; i < data.length; i++) {
				/*compare full_name */
					str += "<tr>"
							+ "<td style='padding-top:29px' id=news_id" + data[i].news_id + ">"
							+ "<a href="+data[i].news_path+" target='_blank' style='text-decoration:none;'>"
							+ data[i].news_title + "</a></td>" + "<td>"
							+ data[i].cat_name + "</td>" + "<td>"
							+ getimage(data[i].news_img) + "</td>" + "<td>"
							+ data[i].news_date + "</td>"
							/*  + "<td style='text-align: center;'>" + btnAction(i)  */
							+ "<td style='text-align: center;'>"  +changestatus(data[i].news_status,data[i].news_id,i) 
							+ "</td>" + "</tr>";
							
			
			}
			return str;
		}
		/* method changestatus for change value to Icon Active  Or Deactive  sarin */	

		 function changestatus(data,id,i){ 
			var str="";
			if(data){
				str+="<a style=' cursor:pointer;'><img src='img/t.png' style='width:30px;height:30px' id="+id+" status='"+data+"' news_id='"+id+"' onclick='checkstatus(this)' /></a>";
				
			}
			else{
				str+="<a style='cursor:pointer;'><img src='img/f.png' style='width:30px;height:30px' id="+id+" status='"+data+"'  news_id='"+id+"' onclick='checkstatus(this)' /></a>";
				
			}
			return str;
		} 

		
		/*method checkstatus for  upadate status on databases*/
		var statusAction=true;
 	function checkstatus(data){
			
			 var status=$(data).attr("status");			 
			  var newsid=$(data).attr("news_id");
			  if(status=="true"){
				  $("#"+$(data).attr("id")).attr("src","img/f.png"); 
				  $(data).attr("status","false");	
				  status="flase";
			  }else{
				  $("#"+$(data).attr("id")).attr("src","img/t.png");
				  $(data).attr("status","true");
				  status="true";
			  }
			 /* if(status){
				 status=0;
			 }
			else{
				 status=1;
			 } */
			//alert(statusAction);
			  $.post("updateStatus.news", {
				    news_id : newsid,
					news_status : status,
				}, function(data2,status) {
					
				});    
		} 
		
		
		
		/* ------------Sarin fucntion get image-------- */
		function getimage(data) {
			var str = "";
			str += "<img src="+data+" width=100px/>";
			return str;
		}
		
		/* upload file */
		$("#imguploads").click(function(){
			var data;
		    data = new FormData();
		    data.append('file', $('#file_image')[0].files[0]);   
			 $.ajax({
			        url: 'UploadServlet.news',
			        data: data,
			        type: 'POST', 
			        processData: false,
			        contentType: false,
			        success:function(){
			        	alert("Upload Success!");
			        }
			       
			    });
		});
		$.post("categoryDropList.news", function(data) {
			$("#newscategory").html(categoryDropList(data));
		});
		function categoryDropList(data) {
			var str = "";
			for (var i = 0; i < data.length; i++) {
				str += "<option value=" + data[i].cat_code + ">"
						+ data[i].cat_name;
			}
			str += "</optiont>";
			return str;
		}
		
		jQuery("#addArticle").click(function(){
			var img = jQuery("#file_image").val().split("\\");
			jQuery.post("addarticle.news",
				{
				//  news_con_detail  
				  cat_name:jQuery("#newscategory").val(),
				  user_info_code:<%=session.getAttribute("userinfo")%>[0].user_info_code,
				  news_title:jQuery("#newstitle").val(),
				  news_desc:jQuery("#news_des").val(),
				  news_path:jQuery("#newspath").val(),
				  news_img:img[img.length-1],
				  news_con_detail:jQuery("#news_con_detail").code()
				}, 
				function(){
					alert("Add Success!");
					
			});
		});
	</script>
</body>
</html>