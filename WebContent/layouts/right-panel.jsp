<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div
	class="col-md-3 col-sm-3 col-xs-3 content-right clear-paddings clear-margins pull-right right-panel">
	<div class="row">
	<jsp:include page="topfive.jsp" />
</div>
<div class="row">
	<jsp:include page="exchange.jsp" />
</div>
<!-- button slider -->
<div class="row">
	<div class="panel panel-primary clear-paddings container-fluid panel-bottom">
		<div class="panel-heading">
			<!-- <h3 class="panel-title">ហាងឆេងប្តូរប្រាក់ ប្រចាំថ្ងៃ</h3> -->
			<a href="#">ប្រចាំថ្ងៃ</a>
			<a href="#">ប្រចាំសប្តាស៍</a>
			<a href="#" style="border-right: 0px solid #FFF;">ប្រចាំខែ</a>
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
	
</div>
