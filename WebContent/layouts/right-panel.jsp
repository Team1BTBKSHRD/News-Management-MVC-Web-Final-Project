<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div
	class="col-md-3 col-sm-3 col-xs-3 content-right clear-paddings clear-margins pull-right right-panel">
	<!-- search form -->
	<div class="panel panel-primary container-fluid">
		<form role="search">
			<div
				class="col-md-12 col-sm-12 col-xs-12 form-group clear-paddings search-wrapper">
				<input class="col-sm-8" type="text" placeholder="ស្វែងរក"
					id="inputSearch">
				<button type="submit" class="btn btn-primary pull-right col-sm-4"
					id="btnSearch">ស្វែងរក</button>
			</div>
		</form>
	</div>
	<!-- end search form -->
	<jsp:include page="topfive.jsp" />
	<div class="panel panel-primary clear-paddings container-fluid">
		<div class="panel-heading">
			<h3 class="panel-title">ហាងឆេងប្តូរប្រាក់ ប្រចាំថ្ងៃ</h3>
		</div>
		<table class="table table-striped table-hover " id="tbExchange">
			<thead>
				<tr>
					<th>ប្រភេទ​ប្រាក់</th>
					<th>អត្រា​ទិញ</th>
					<th>អត្រា​លក់</th>

				</tr>
			</thead>
			<tbody id="tbodyExchange">
			</tbody>
		</table>
	</div>
</div>
