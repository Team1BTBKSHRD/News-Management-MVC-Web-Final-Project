<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="col-sm-3 content-right clear-paddings clear-margins pull-right">
	
		<!-- search form -->
		<div class="card card-right container-fluid">
			<form role="search">
				<div class="col-sm-12 form-group">
					<div class="col-sm-8 clear-paddings">
						<input type="text" placeholder="Search">
					</div>
					<div class="col-sm-4 clear-paddings">
						<button type="submit" class="btn btn-primary">Search</button>
					</div>
				</div>
				<div class=" form-group">
					<label for="Category" class="">Category</label>
					<div class="btn-group ">
						<a href="#" class="btn btn-default ">Default</a> <a href="#"
							class="btn btn-default dropdown-toggle" data-toggle="dropdown"><span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li><a href="#">Separated link</a></li>
						</ul>
					</div>
				</div>
				<div class=" form-group">
					<label for="Category" class="">Category</label>
					<div class="btn-group ">
						<a href="#" class="btn btn-default ">Default</a> <a href="#"
							class="btn btn-default dropdown-toggle" data-toggle="dropdown"><span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li><a href="#">Separated link</a></li>
						</ul>
					</div>
				</div>
			</form>
		</div>
		<!-- end search form -->
		<jsp:include page="topfive.jsp" />
	
</div>
