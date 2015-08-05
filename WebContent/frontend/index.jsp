<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <title>asdkfjas;d</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />  
  <jsp:include page = "layouts/linkcss.jsp" />	
</head>

<body>
​​  <jsp:include page = "layouts/header.jsp" />
  <div class="container-fluid content-area">
    
        <div class="col-sm-3 card content-right clear-paddings pull-right">
          <div class="card-header">
            <div class="row">
              <form role="search">
                <input type="text" class="col-sm-7 " style="margin-left: 15px" placeholder="Search">
                <button type="submit" class="col-sm-3 btn btn-primary" style="margin-left: 15px">Search</button>
              </form>
            </div>
          </div>
        </div>

        <div class="content">
          <div class="col-sm-9 content-left clear-padding-left">
			<jsp:include page = "layouts/slider.jsp" />
<div class="card">
              <ul class="nav nav-tabs" style="
    background-color: #;
">
                <li class="active"><a href="#home" data-toggle="tab">Home</a></li>
                <li><a href="#profile" data-toggle="tab">Profile</a></li>
                <li class="disabled"><a>Disabled</a></li>
                <li class="dropdown">
                  <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    Dropdown <span class="caret"></span>
                  </a>
                  <ul class="dropdown-menu">
                    <li><a href="#dropdown1" data-toggle="tab">Action</a></li>
                    <li class="divider"></li>
                    <li><a href="#dropdown2" data-toggle="tab">Another action</a></li>
                  </ul>
                </li>
              </ul>
              <div id="myTabContent" class="tab-content">
                <div class="tab-pane fade active in" id="home">
                  <p>Raw denim you probably haven't heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>
                </div>
                <div class="tab-pane fade" id="profile">
                  <p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo booth letterpress, commodo enim craft beer mlkshk aliquip jean shorts ullamco ad vinyl cillum PBR. Homo nostrud organic, assumenda labore aesthetic magna delectus mollit.</p>
                </div>
                <div class="tab-pane fade" id="dropdown1">
                  <p>Etsy mixtape wayfarers, ethical wes anderson tofu before they sold out mcsweeney's organic lomo retro fanny pack lo-fi farm-to-table readymade. Messenger bag gentrify pitchfork tattooed craft beer, iphone skateboard locavore carles etsy salvia banksy hoodie helvetica. DIY synth PBR banksy irony. Leggings gentrify squid 8-bit cred pitchfork.</p>
                </div>
                <div class="tab-pane fade" id="dropdown2">
                  <p>Trust fund seitan letterpress, keytar raw denim keffiyeh etsy art party before they sold out master cleanse gluten-free squid scenester freegan cosby sweater. Fanny pack portland seitan DIY, art party locavore wolf cliche high life echo park Austin. Cred vinyl keffiyeh DIY salvia PBR, banh mi before they sold out farm-to-table VHS viral locavore cosby sweater.</p>
                </div>
              </div>
            <div id="source-button" class="btn btn-primary btn-xs" style="display: none;">&lt; &gt;</div></div>
            <div class="panel panel-primary">
              <div class="panel-heading">
                <h3 class="panel-title">Panel primary</h3>
              </div>
              <div class="panel-body">
                <div class="card card-grey">
                  <a href="http://news.sabay.com.kh/article/298488" target="_new">
                    <div class="row card-header card-news clear-paddings clear-margins">
                      <div class="col-sm-4 clear-paddings">
                        <img src="http://cdn.sabay.com/cdn/news.sabay.com.kh/wp-content/uploads/2015/03/feature-cover.jpg?0bb167" class="col-sm-12 clear-paddings">
                      </div>
                      <div class="col-sm-8 pull-right">
                        <h3 class="article-name">សេដ្ឋី​វ័យ​ក្មេង​ឥណ្ឌា​បញ្ជូន​កូន​ស្រី​ទៅ​ធ្វើ​ព្រះ​...</h3>
                       <strong>                      
                         ផ្សាយថ្ងៃ <kbd><time>2015/03/07</time></kbd>
                       </strong>
                       <p class="clear-margin-bottom">
                        បន្ទាប់​ពី​ភរិយា​ស្លាប់​ទៅ កាពីទែន​ គ្រូវី​ដែល​ល្បី​ល្បាញ​ថា​ជា​សេ បន្ទាប់​ពី​ភរិយា​ស្លាប់​ទៅ កាពីទែន​ គ្រូវី​ដែល​ល្បី​ល្បាញ​ថា​ជា​សេ បន្ទាប់​ពី​ភរិយា​ស្លាប់​ទៅ កាពីទបន្ទាប់​ពី​ភរិយា​ស្លាប់​ទៅ កាពីទបន្ទាប់​ពី​ភរិយា​ស្លាប់​ទៅ កាពីទបន្ទាប់​ពី​ភរិយា​ស្លាប់​ទៅ កាពីទ
                        <strong class="news-source">ប្រភពពត៌មាន<kbd>Sabay</kbd></strong>
                      </p>
                    </div>
                  </div>
                </a>
              </div>
            </div>
          </div>
		      <jsp:include page = "layouts/pagination.jsp" />
          <div class="clearfix"></div>
        </div>
      </div>    
  </div>
​​  <jsp:include page = "layouts/footer.jsp" />
​​  <jsp:include page = "layouts/linkjs.jsp" />
</body>
</html>
