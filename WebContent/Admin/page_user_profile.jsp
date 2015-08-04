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
                                <i class="fa fa-user"></i>
                            </div>
                            <div class="media-body">
                                <ul class="breadcrumb">
                                    <li><a href="#"><i class="glyphicon glyphicon-user"></i></a></li>
                                    <li>Profile Page</li>
                                </ul>
                                <h4>Profile Page</h4>
                            </div>
                        </div><!-- media -->
                    </div><!-- pageheader -->
                    
                    <div class="contentpanel">
                        
                        <div class="row row-stat">
                         
                       
                           
                            
                           
                        </div><!-- row -->
                        
                        

                        
                        
                       
                        
                        <div class="row row-dashboard">
                            
                            
                            
                        </div><!-- row -->
                        
                    </div><!-- contentpanel -->
                    
                </div><!-- mainpanel -->
            </div><!-- mainwrapper -->
        </section>


     <jsp:include page="include/jsfile.html" ></jsp:include>
	<script type="text/javascript">
	
	$(document).ready(function(){
        alert('ehllo');
        // Basic Form
       /*  $("#basicForm").validate({
            highlight: function(element) {
                $(element).closest('.form-group').removeClass('has-success').addClass('has-error');
            },
            success: function(element) {
               $(element).closest('.form-group').removeClass('has-error');
            }
        }); */
      
       
    });
	</script>
    </body>
</html>