<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
</head>
<body>
	<h1>Table Category News</h1>
	<form>
		category name : <input type="text" id="cat_name" placeholder="id" />
		category desc : <input type="text" id="cat_desc" placeholder="data" />
		<input type="button" value="ListCategory" id="btnlistCate" /> <input
			type="button" value="AddCategory" id="btnaddCate" />
	</form>

	<h1>Table User News</h1>
	<form>
		user name : <input type="text" id="user_name"
			placeholder="name or id for remove user" /> user pass : <input
			type="text" id="user_pass" placeholder="password" /> user type : <select
			id="user_type">
			<option value="admin">admin</option>
			<option value="visitor">visitor</option>
			<option value="editor">editor</option>
		</select> <input type="button" value="AddUser" id="btnuseradd" /> <input
			type="button" value="ListUser" id="btnuserlist" /> <input
			type="button" value="RemoveUser" id="btnuserremove" /> <input
			type="button" value="EditUser" id="btnuseredit"> <input
			type="button" value="SearchUser" id="btnusersearch">
	</form>
	<h1>Elit Search Block</h1>
	<form>
		<input type="text" id="txtEsearchcategory"
			placeholder="category searching" /> <input type="button"
			id="btnEsearch" value="Search" /> <select id="selectEcategory"></select>
		<select id="selectEsource"></select>

	</form>
	<h1>Sarin Add Article Block</h1>
	<form>
		News Title : <input type="text" id="txtnewstitle"
			placeholder="news title" /><br /> Sponsor by : <select
			id="newsUserinfo"></select><br /> News Category : <select
			id="newsTitlecategory"></select><br /> News Content :
		<textarea rows="4" cols="7" id="txtnewsContent"></textarea>
		<br /> News Description : <input type="text" id="txtnewsDesc" /><br />
		News Path : <input type="text" id="txtnewsPath" /><br /> <input
			type="button" value="Add News" id="btnNewsAdd" />
	</form>
	<h1>Sarin </h1>
	<form>
		Number of Categories :<label id="lblcategories"></label><br />
		Number of Account :<label id="lblaccounts"></label><br />
		Number of Article :<label id="lblarticles"></label><br />
		User by : <select id="newsUserinfo1" onchange="listArticle()"></select><br />
		<table border=1>
					<thead>
						<tr>
							<th>No</th>
							<th>Title</th>
							<th>Date</th>
							
						</tr>
					</thead>
					<tbody id="tblist">
					</tbody>
				</table>
	</form>
	<script type="text/javascript" src="controllers.js"></script>
</body>
</html>