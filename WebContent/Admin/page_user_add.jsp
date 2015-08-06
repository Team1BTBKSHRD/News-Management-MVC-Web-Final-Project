<!DOCTYPE html >
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
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
                         
                        <div class="panel panel-info">
                            <div class="panel-body">
                                <table id="list" class="table table-striped table-bordered table-primary mb30" cellspacing="0" width="100%">
                                    <thead>
                                      <tr>
                                        <th>User Name</th>
                                        <th>User Type</th>
                                        <th>Action</th>
                                    </tr>
                                </thead>
                                <tbody id="listdetial">
                                  <!-- <tr>
                                    <td>Mark</td>
                                    <td>Otto</td>
                                    <td>
                                    <button  class="btn btn-success btn-xs" >
                                        <i class="fa fa-pencil-square-o"></i>&nbsp;&nbsp;Edit
                                    </button> 
                                   
                                    </td>
                                </tr>
                                <tr>
                                    <td>Jacob</td>
                                    <td>Thornton</td>
                                    <td>
                                    <button  class="btn btn-success btn-xs"  >
                                        <i class="fa fa-pencil-square-o"></i>&nbsp;&nbsp;Edit
                                    </button>
                                    
									</td>
                                </tr>
                                <tr>
                                    <td>Larry</td>
                                    <td>the Bird</td>
                                    <td><button  class="btn btn-success btn-xs"  >
                                        <i class="fa fa-pencil-square-o"></i>&nbsp;&nbsp;Edit
                                    </button>
                                   
                                     </td>
                                </tr> -->
                            </tbody>
                        </table>
                        <button  class="btn btn-success btn-xs delete" data-toggle="modal" data-target="#myModal" >
                         <i class="fa fa-user"></i>&nbsp;&nbsp;Create New User
                     </button>  
                     
                     
                                      </div><!--  panel-body -->
             </div><!-- panel panel-info -->
         </div><!-- col-md-12 -->
     </div><!-- row row-stat -->



     <div class="row"><!--  row model form -->
        <!--Modal Page User ADD-->
        <div class="modal fade" id="myModal" role="dialog">  
            <div class="modal-dialog modal-md">
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">AddNewUser</h4>
              </div>
              <div class="modal-body">
                <form id="useradd">
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
                                    <input type="password" id="repassword" name="repassword" class="form-control" placeholder="Retype your password..." required />
                                </div>
                            </div><!-- form-group -->
                            
                            <div class="form-group">
                               <label class="col-sm-3 control-label">Usertype <span class="asterisk">*</span></label>
                               <div class="col-sm-5">
                                 <select class="form-control" id="usertype" name="usertype" required>
                                    <option value="">select user type</option>
                                    <option value="admin">Admin</option>
                                    <option value="editor">Editor</option>
                                </select>
                            </div>
                        </div><!-- form-group -->
                         <div class=" wizard-card" style="width: 42px;min-height: 126px;box-shadow: 0 0;border-radius: 0px;">
                           <div class="col-sm-5 col-sm-offset-1">
                           			<div class="picture-container" style="width: 131px;">
                                          <div class="picture">
                                              <img src="myimage/stickerprofile.png" class="picture-src" id="wizardPicturePreview" title="">
                                              <input type="file" id="wizard-picture">
                                          </div>
                                          <h6>Choose Picture</h6>
                                      </div>
                           </div>
                           </div>
                        <div class="col-sm-9 col-sm-offset-9">
                            <input type="submit" class="btn btn-primary mr5" id="adduser" value="Add">
                        </div>
                    </div><!-- row -->
                </div><!-- panel-body -->
            </form>
        </div> <!-- modal-body -->                       
    </div><!-- modal-content -->
</div>
</div><!--End Modal Page User ADD--> 
</div><!-- row model form -->
</div><!-- contentpanel -->
</div><!-- mainpanel -->
</div><!-- mainwrapper -->
</section>
<jsp:include page="include/jsfile.html" ></jsp:include>
<script type="text/javascript" src="validate/useradd_validate.js"></script>
<script type="text/javascript" src="customjs/useradd.js"></script>

</body>
</html>