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
                                <li>User</li>
                                <li>Manage</li>
                            </ul>
                            <h4>ManagerUser</h4>
                        </div>
                    </div><!-- media -->
                </div><!-- pageheader -->
                
                <div class="contentpanel">
                    
                    <div class="row row-stat">
                      
                      <div class="col-md-12">
                        <div class="table-responsive">
                            <table id="example" class="table table-striped table-bordered table-primary mb30" cellspacing="0" width="100%">
                                <thead>
                                  <tr>
                                    <th>#</th>
                                    <th>First Name</th>
                                    <th>Last Name</th>
                                    <th>Username</th>
                                </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <td>1</td>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td>@mdo</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>Jacob</td>
                                <td>Thornton</td>
                                <td>@fat</td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td>Larry</td>
                                <td>the Bird</td>
                                <td>@twitter</td>
                            </tr>
                        </tbody>
                    </table>
                </div><!-- table-responsive -->
               
              
            </div>
            
            
            <div class="col-md-12">
                <form id="basicForm" action="http://themepixels.com/demo/webpage/chain/form-validation.html">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                          <h4 class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">
                             <button class="btn btn-success btn-sm btn-block"  >AddNew+</button></a>
                         </h4>
                     </div><!-- panel-heading -->
                     <div id="collapse1" class="panel-collapse collapse">
                        <div class="panel-body">
                            <div class="row">
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Username <span class="asterisk">*</span></label>
                                    <div class="col-sm-9">
                                        <input type="text"  id="username" name="username" class="form-control" placeholder="Type your username..." required />
                                    </div>
                                </div><!-- form-group -->
                                
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Password <span class="asterisk">*</span></label>
                                    <div class="col-sm-9">
                                        <input type="password" id="password" name="password" class="form-control" placeholder="Type your password..." required />
                                    </div>
                                </div><!-- form-group -->
                                
                                <div class="form-group">
                                    <label class="col-sm-3 control-label">Re-password <span class="asterisk">*</span></label>
                                    <div class="col-sm-9">
                                        <input type="password" id="password" name="password" class="form-control" placeholder="Retype your password..." required />
                                    </div>
                                </div><!-- form-group -->
                                
                                <div class="form-group">
                                 <label class="col-sm-3 control-label">Usertype <span class="asterisk">*</span></label>
                                 <div class="col-sm-3">
                                   <select class="form-control" id="usertype" name="usertype">
                                    <option value="">select user type</option>
                                    <option value="admin">Admin</option>
                                    <option value="editor">Editor</option>
                                </select>
                            </div>
                        </div><!-- form-group -->
                        
                        <div class="col-sm-9 col-sm-offset-3">
                            <button class="btn btn-primary mr5">Submit</button>
                        </div>  
                    </div><!-- row -->
                </div><!-- panel-body -->
            </div><!-- panel-collapse collapse -->
        </div><!-- panel -->
    </form>
</div><!-- col-md-6 -->
</div><!-- row -->

<div class="row row-dashboard">
    
    
    
</div><!-- row -->

</div><!-- contentpanel -->

</div><!-- mainpanel -->
</div><!-- mainwrapper -->
</section>

<jsp:include page="include/jsfile.html" ></jsp:include>

<script>
$(document).ready(function() {
	 $('#example').dataTable();
} );
</script>
</body>
</html>