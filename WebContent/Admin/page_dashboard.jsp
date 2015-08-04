<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<jsp:include page="include/cssstyle.html"></jsp:include><!-- sarin -->
<title>Insert title here</title>
 <link href="mystyle.css" rel="stylesheet">
</head>
<body>
        
       <jsp:include page="include/header_navibar.html"></jsp:include>
        
        <section>
            <div class="mainwrapper">
            <jsp:include page="include/menu_left.html"></jsp:include>
               
                
                <div class="mainpanel">
                    <div class="pageheader">
                        <div class="media">
                            <div class="pageicon pull-left">
                                <i class="fa fa-home"></i>
                            </div>
                            <div class="media-body">
                                <ul class="breadcrumb">
                                    <li><a href="#"><i class="glyphicon glyphicon-home"></i></a></li>
                                    <li>Dashboard</li>
                                </ul>
                                <h4>Dashboard</h4>
                            </div>
                        </div><!-- media -->
                    </div><!-- pageheader -->
                    
                    <div class="contentpanel">
                        
                        <div class="row row-stat">
                            <div class="col-md-4">
                                <div class="panel panel-success-alt noborder">
                                    <div class="panel-heading noborder">
                                        <div class="panel-btns">
                                            <a href="#" class="panel-close tooltips" data-toggle="tooltip" title="Close Panel"><i class="fa fa-times"></i></a>
                                        </div><!-- panel-btns -->
                                        <div class="panel-icon"><i class="fa fa-dollar"></i></div>
                                        <div class="media-body">
                                            <h5 class="md-title nomargin">Today's Earnings</h5>
                                            <h1 class="mt5">$8,102.32</h1>
                                        </div><!-- media-body -->
                                        <hr>
                                        <div class="clearfix mt20">
                                            <div class="pull-left">
                                                <h5 class="md-title nomargin">Yesterday</h5>
                                                <h4 class="nomargin">$29,009.17</h4>
                                            </div>
                                            <div class="pull-right">
                                                <h5 class="md-title nomargin">This Week</h5>
                                                <h4 class="nomargin">$99,103.67</h4>
                                            </div>
                                        </div>
                                        
                                    </div><!-- panel-body -->
                                </div><!-- panel -->
                            </div><!-- col-md-4 -->
                            
                            <div class="col-md-4">
                                <div class="panel panel-primary noborder">
                                    <div class="panel-heading noborder">
                                        <div class="panel-btns">
                                            <a href="#" class="panel-close tooltips" data-toggle="tooltip" title="Close Panel"><i class="fa fa-times"></i></a>
                                        </div><!-- panel-btns -->
                                        <div class="panel-icon"><i class="fa fa-users"></i></div>
                                        <div class="media-body">
                                            <h5 class="md-title nomargin">Number of Visitor</h5>
                                            <h1 class="mt5">138,102</h1>
                                        </div><!-- media-body -->
                                        <hr>
                                        <div class="clearfix mt20">
                                            <div class="pull-left">
                                                <h5 class="md-title nomargin">Yesterday</h5>
                                                <h4 class="nomargin">10,009</h4>
                                            </div>
                                            <div class="pull-right">
                                                <h5 class="md-title nomargin">This Week</h5>
                                                <h4 class="nomargin">178,222</h4>
                                            </div>
                                        </div>
                                        
                                    </div><!-- panel-body -->
                                </div><!-- panel -->
                            </div><!-- col-md-4 -->
                            
                            <div class="col-md-4">
                                <div class="panel panel-dark noborder">
                                    <div class="panel-heading noborder">
                                        <div class="panel-btns">
                                            <a href="#" class="panel-close tooltips" data-toggle="tooltip" data-placement="left" title="Close Panel"><i class="fa fa-times"></i></a>
                                        </div><!-- panel-btns -->
                                        <div class="panel-icon"><i class="fa fa-pencil"></i></div>
                                        <div class="media-body">
                                            <h5 class="md-title nomargin">Article Post</h5>
                                            <h1 class="mt5">153,900</h1>
                                        </div><!-- media-body -->
                                        <hr>
                                        <div class="clearfix mt20">
                                            <div class="pull-left">
                                                <h5 class="md-title nomargin">Yesterday</h5>
                                                <h4 class="nomargin">144,009</h4>
                                            </div>
                                            <div class="pull-right">
                                                <h5 class="md-title nomargin">This Week</h5>
                                                <h4 class="nomargin">987,212</h4>
                                            </div>
                                        </div>
                                        
                                    </div><!-- panel-body -->
                                </div><!-- panel -->
                            </div><!-- col-md-4 -->
                        </div><!-- row -->
                        
                        

                        
                        
                       
                        
                        <div class="row row-dashboard">
                            
                            
                            
                        </div><!-- row -->
                        
                    </div><!-- contentpanel -->
                    
                </div><!-- mainpanel -->
            </div><!-- mainwrapper -->
        </section>


     <jsp:include page="include/jsfile.html" ></jsp:include>

    </body>
</html>