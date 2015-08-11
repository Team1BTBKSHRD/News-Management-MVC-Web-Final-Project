<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div
	class="col-md-3 col-sm-3 col-xs-3 content-right clear-paddings clear-margins pull-right right-panel">
	<!-- search form -->
	<div class="panel panel-primary container-fluid">
		<form role="search">
			<div
				class="col-md-12 col-sm-12 col-xs-12 form-group clear-paddings search-wrapper">
				<input class="col-sm-8" type="text" placeholder="ស្វែងរក">
				<button type="submit" class="btn btn-primary pull-right col-sm-4">ស្វែងរក</button>
			</div>
			<!-- <div class=" form-group col-sm-12">
				
				<div class="btn-group combo-news">
					<a href="#" class="btn btn-default btn-sm search-filter">ប្រភេទព័ត៌មាន</a> <a href="#"
						class="btn btn-default btn-sm dropdown-toggle"
						data-toggle="dropdown" aria-expanded="false"><span
						class="caret"></span></a>
				    category news
					<ul class="dropdown-menu">
						<li><a href="#">ជីវិត&amp;សង្គម</a></li>
						<li><a href="#">សេដ្ឋកិច្ច</a></li>
						<li><a href="#">កីឡា</a></li>
						<li><a href="#">កំសាន្ត</a></li>
						<li><a href="#">បច្ចេកវីទ្យា</a></li>
						<li><a href="#">អាហារូបករណ៍</a></li>
						
					</ul>
					end category news
				</div>
			</div>
			<div class=" form-group col-sm-12">
				
				<div class="btn-group combo-news">
					<a href="#" class="btn btn-default btn-sm search-filter">ប្រភពព័ត៌មាន</a> <a href="#"
						class="btn btn-default btn-sm dropdown-toggle"
						data-toggle="dropdown" aria-expanded="false"><span
						class="caret"></span></a>
				   news source
					<ul class="dropdown-menu">
						<li><a href="#">sabay news</a></li>
						<li><a href="#">kohsantepheab</a></li>
						<li><a href="#">daps-news</a></li>
						<li><a href="#">news box</a></li>
					</ul>
					end news source
				</div>
			</div> -->
		</form>
	</div>
	<!-- end search form -->
	<jsp:include page="topfive.jsp" />
	<div class="panel panel-primary clear-paddings container-fluid">
		<div class="panel-heading">
			<h3 class="panel-title">ហាងឆេងប្តូរតំលៃ</h3>
		</div>
		<table class="table table-striped table-hover ">
			<thead>
				<tr>
					<th>#</th>
					<th>Column heading</th>
					<th>Column heading</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<td>1</td>
					<td>Column content</td>
					<td>Column content</td>

				</tr>
				<tr>
					<td>2</td>
					<td>Column content</td>
					<td>Column content</td>

				</tr>

			</tbody>
		</table>
	</div>
</div>
