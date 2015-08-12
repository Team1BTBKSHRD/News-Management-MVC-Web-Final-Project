
<%
	String usr = "", adm = "";

	if (session.getAttribute("admin") != null) {
		usr = session.getAttribute("admin").toString();
		adm = session.getAttribute("userType").toString();
	}
%>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<div class="leftpanel">
	<div class="media profile-left">
		<a class="pull-left profile-thumb" href="page_user_profile.jsp"> <img
			class="img-circle" src="" id="pic_profile" alt="">
		</a>
		<div class="media-body">
			<h4 class="media-heading" id="username_profile"><%=usr%></h4>
			<!-- Title Name for user  -->
			<small class="text-muted" id="user_type_profile"><%=adm%></small>
		</div>
	</div>
	<!-- media -->

	<h5 class="leftpanel-title" id="d">Navigation</h5>
	<ul class="nav nav-pills nav-stacked">
		<li class="active"><a href="index.jsp"><i class="fa fa-home"></i>
				<span>Dashboard</span></a></li>
		<!--  <li><a href="messages.html"><span class="pull-right badge">5</span><i class="fa fa-envelope-o"></i> <span>Messages</span></a></li> -->
		<li class="parent" id="main_menu_article"><a href="#"><i
				class="fa fa-edit"></i> <span>Article</span></a>
			<ul class="children">
				<li id="sub_menu_managearticle"><a href="page_article_add.jsp">Manage
						Article</a></li>
						<%
			if (adm.equals("admin")) {
		%>
				<li id="sub_menu_managecategory"><a
					href="page_category_add.jsp">Manage Category</a></li>
					<%
		}
	%>
			</ul></li>

		<%
			if (adm.equals("admin")) {
		%>
		<li id="usermenu"><a href="page_user_add.jsp"><i
				class="fa fa-user"></i> <span>User</span></a></li>
		<!--  <li class="parent"><a href="#"><i class="fa fa-align-justify"></i> <span>Menus</span></a>
                            <ul class="children">
                                <li><a href="#">Addmenu</a></li>
                                <li><a href="#">Managemenu</a></li>
                            </ul>
                        </li> -->
		<!--  <li><a href="#"><i class="fa fa-align-justify"></i> <span>Menus</span></a></li> -->
	</ul>
	<%
		}
	%>
</div>
<!--  leftpanel -->
<script type="text/javascript">
	var obj =
<%=session.getAttribute("userinfo")%>
	$("#pic_profile").attr("src", obj[0].logo);
	$("#img_thumnail").attr("src", obj[0].logo);
	//alert(obj[0].logo);
</script>