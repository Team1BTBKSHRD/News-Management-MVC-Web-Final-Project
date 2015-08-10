
<%@page import="java.nio.channels.SeekableByteChannel"%>
<%
	String userType = session.getAttribute("userType").toString();
%>
<%="HI, How are you?" %>
<%=userType%>

 
 <div class="leftpanel">
                    <div class="media profile-left">
                        <a class="pull-left profile-thumb" href="page_user_profile.jsp">
                            <img class="img-circle" src="img/stickerprofile.png" id="pic_profile" alt="">
                        </a>
                        <div class="media-body">
                            <h4 class="media-heading" id="username_profile">Hem Sarin</h4><!-- Title Name for user  -->
                            <small class="text-muted" id="user_type_profile">Admin</small>
                        </div>
                    </div><!-- media -->
                    
                    <h5 class="leftpanel-title">Navigation</h5>
                    <ul class="nav nav-pills nav-stacked">
                        <li class="active"><a href="index.jsp"><i class="fa fa-home"></i> <span>Dashboard</span></a></li>
                       <!--  <li><a href="messages.html"><span class="pull-right badge">5</span><i class="fa fa-envelope-o"></i> <span>Messages</span></a></li> -->
                        <li class="parent" id="main_menu_article"><a href="#"><i class="fa fa-edit"></i> <span>Article</span></a>
                            <ul class="children">
                                <li id="sub_menu_managearticle"><a href="page_article_add.jsp">Manage Article</a></li>
                                <li id="sub_menu_managecategory"><a href="page_category_add.jsp">Manage Category</a></li>
                            </ul>
                        </li>
                        
                      <%--  <%if(usr.getType=='4' ){  %> --%>
                        <li id="usermenu"><a href="page_user_add.jsp"><i class="fa fa-user"></i> <span>User</span></a></li>
                       <!--  <li class="parent"><a href="#"><i class="fa fa-align-justify"></i> <span>Menus</span></a>
                            <ul class="children">
                                <li><a href="#">Addmenu</a></li>
                                <li><a href="#">Managemenu</a></li>
                            </ul>
                        </li> -->
                       <!--  <li><a href="#"><i class="fa fa-align-justify"></i> <span>Menus</span></a></li> -->
                    </ul>
                  <%-- <%}%>  --%>
                </div><!--  leftpanel --> 