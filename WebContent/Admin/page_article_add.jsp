<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE >
<html>
<head>
    <!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> -->
    <!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /> -->
    <meta charset="UTF-8">
    <jsp:include page="include/cssstyle.html"></jsp:include><!-- sarin -->
    <title>Insert title here</title>
    <link href="mystyle.css" rel="stylesheet">
  <!--   <style>
    th{text-align: center;}
    @media screen and (max-width: 600px) {
        #tablerepone {
            overflow: scroll;
        }
    }
    </style> -->
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
                        <i class="fa fa-edit"></i>
                    </div>
                    <div class="media-body">
                        <ul class="breadcrumb">
                            <li><a href="#"><i class="glyphicon glyphicon-edit"></i></a></li>
                            <li>Add</li>
                        </ul>
                        <h4>Addarticle</h4>
                    </div>
                </div><!-- media -->
            </div><!-- pageheader -->

            <div class="contentpanel">

                <div class="row row-stat">
                 <div class="col-md-12">

                    <div class="panel panel-info">
                        <div class="panel-body" id="tablerepone">
                            <table id="listarticle" class="table table-striped table-bordered table-primary mb30" cellspacing="0" width="100%">
                                <thead>
                                  <tr>
                                    <th>NewsTitle</th>
                                    <th>NewsCategory</th>
                                    <th>NewsImage</th>
                                    <th>NewsDate</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <td>Mark</td>
                                <td>Otto</td>
                                <td>Otto</td>
                                <td>Otto</td>
                                <td>
                                    <button  class="btn btn-success btn-xs" >
                                        <i class="fa fa-pencil-square-o"></i>&nbsp;&nbsp;Edit
                                    </button> 
                                    <button  class="btn btn-danger btn-xs delete"  >
                                        <i class="fa fa-trash-o"></i>&nbsp;&nbsp;Delete
                                    </button> 
                                </td>
                            </tr>
                        </tbody>
                    </table>
                    <button  class="btn btn-success btn-xs delete" data-toggle="modal" data-target="#articlemodal" >
                       <i class="fa fa-plus"></i>&nbsp;&nbsp;AddNewArticle
                   </button>  
                   
                   <div class="row"><!--  row  form -->
                   <br/>
                   <div style="width:100%;height:1px;background-color:#BCE8F1;"></div>
                    <form id="basicForm" >
                        <div class="panel-body">
                            <div class="row">
                                <div class="form-group">
                                    <label class="col-sm-2 control-label">NewsTitle <span class="asterisk">*</span></label>
                                    <div class="col-sm-5">
                                        <input type="text"  id="newstitle" name="newstitle" class="form-control" placeholder="title" required />
                                    </div>
                                </div><!-- form-group -->

                                <div class="form-group">
                                 <label class="col-sm-2 control-label">NewsCategory <span class="asterisk">*</span></label>
                                 <div class="col-sm-5">
                                   <select class="form-control" id="newscategory" name="newscategory">
                                    <option value="">select category</option>
                                    <option value="ព័ត៌មាន">ព័ត៌មាន</option>
                                    <option value="បច្ចេកវិទ្យា">បច្ចេកវិទ្យា</option>
                                    <option value="ព័ត៌មានជាតិ">ព័ត៌មានជាតិ</option>
                                    <option value="ព័ត៌មានកីឡា">ព័ត៌មានកីឡា</option>
                                    <option value="ការសិក្សារ">ការសិក្សារ</option>
                                    <option value="វិទ្យាសាស្រ្ត">វិទ្យាសាស្រ្ត</option>
                                </select>
                            </div>
                        </div><!-- form-group -->

                        <div class="form-group">
                            <label class="col-sm-2 control-label">NewsDescription <span class="asterisk">*</span></label>
                            <div class="col-sm-10">
                                <textarea id="newsdescription" name="newsdescription" placeholder="Enter text here..." class="form-control" rows="10"></textarea>
                            </div>
                        </div><!-- form-group -->

                        <div class="form-group">
                            <label class="col-sm-2 control-label">NewsPath <span class="asterisk">*</span></label>
                            <div class="col-sm-5">
                                <input type="text" id="newspath" name="newspath" class="form-control" value="http://" required />
                            </div>
                        </div><!-- form-group -->

                    <div class="col-sm-9 col-sm-offset-2">
                        <button class="btn btn-primary mr5" id="adduser">Add</button>
                    </div>  
                </div><!-- row -->
            </div><!-- panel-body -->
        </form>
    </div><!--  row  form -->
</div><!--  panel-body -->
</div><!-- panel panel-info -->
</div><!-- col-md-12 -->
</div><!-- row -->

</div><!-- contentpanel -->

</div><!-- mainpanel -->
</div><!-- mainwrapper -->
</section>


<jsp:include page="include/jsfile.html" ></jsp:include>
<script>
$('#listarticle').dataTable();
$("#adduser").click(function(){
	alert($("#newstitle").val());
});
</script>
</body>
</html>