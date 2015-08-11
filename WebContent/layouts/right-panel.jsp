<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div
	class="col-md-3 col-sm-3 col-xs-3 content-right clear-paddings clear-margins pull-right">
	<!-- search form -->
	<div class="card card-right container-fluid">
		<form role="search">
			<div class="col-md-12 col-sm-12 col-xs-12 form-group clear-paddings search-wrapper">
				<input type="text" placeholder="ស្វែងរក">
				<button type="submit" class="btn btn-primary btn-sm pull-right">ស្វែងរក</button>
			</div>
			<div class=" form-group">
				<label for="Category" class="">ប្រភេទពត៌មាន</label>
				<div class="btn-group pull-right">
					<a href="#" class="btn btn-default btn-sm search-filter">Default</a> <a href="#"
						class="btn btn-default btn-sm dropdown-toggle"
						data-toggle="dropdown" aria-expanded="false"><span
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
				<label for="Category" class="">ប្រភពពត៌មាន</label>
				<div class="btn-group pull-right">
					<a href="#" class="btn btn-default btn-sm search-filter">Default</a> <a href="#"
						class="btn btn-default btn-sm dropdown-toggle"
						data-toggle="dropdown" aria-expanded="false"><span
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
