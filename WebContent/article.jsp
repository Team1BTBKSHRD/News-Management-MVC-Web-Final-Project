<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>news box site...</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="shortcut icon" href="img/box.png" />
    <!-- lib css -->
    <link rel="stylesheet" href="css/font-google-open-sans.css">
    <link rel="stylesheet" href="css/font-google-roboto-condensed.css">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="css/owl.theme.css">
    <link rel="stylesheet" href="css/owl.transitions.css">
    <link rel="stylesheet" href="css/responsive.css">
    <!-- end lib css -->
    <!-- custom css -->
    <link rel="stylesheet" type="text/css" href="css/custom/index.css">
    <link rel="stylesheet" type="text/css" href="css/custom/owl.css">
    <link rel="stylesheet" type="text/css" href="css/custom/article.css">
    <!-- end custom css -->
  </head>
  <body>
    <!-- header -->
    <jsp:include page="layouts/header.jsp" />
    <!-- end header -->
    <!-- content area article -->
    <div class="container content-area">
      <!-- article -->
      <div class="content">
        <div class="col-sm-9 content-left clear-padding-left clear-margins left-panel">
          <div class="panel panel-primary clear-margins">
            <!-- article header-->
            <div class="slider-content-area">
              <img src="img/${rs.getString(9)}" height="300px" width="100%"
                alt="Mirror Edge">
              <div class="news-title-block">
                <div class="myclear"></div>
                <div class="news-title">
                  <h4 class="article-name">${rs.getString(5)}</h4>
                </div>
              </div>
            </div>
            <!-- end article header-->
            <!-- article body -->
            <div class="panel-body" style="margin-bottom: 15px;">
              <div class="card card-grey">
                <div class="row card-header card-news clear-paddings clear-margins">
                  <!-- news-detail -->
                  <div class="col-sm-12">
                    <!-- news publish date -->
                    <p class="col-sm-6 article-info pull-left">
                      <strong >ចេញផ្សាយ 
                      <kbd><time>${rs.getString(10)}</time></kbd>
                      </strong> 
                    </p>
                    <!-- news category -->
                    <p class="col-sm-6 article-info pull-right" style="text-align: right;">
                      <strong>ប្រភេទព័ត៌មាន<kbd>${rs.getString(17)}</kbd> </strong>
                    </p>
                    <div class="clear-fix"></div>
                  </div>
                  <!-- end news-detail -->
                  <hr style="margin-top: 5px">
                  <!-- paragraph -->
                  <div class="col-sm-12 clear-margin-bottom news-content">
					${rs.getString(2)}
                  </div>
                  <!-- end paragraph -->
                </div>
              </div>
              <!-- news author -->
              <div class="col-sm-12">
                <hr>
               	<strong>បញ្ខូលអត្ថបទដោយ៖ </strong><kbd>${rs.getString(18)}</kbd>
              </div>
            </div>
            <!-- end article body -->
          </div>
          <div class="clearfix"></div>
        </div>
      </div>
      <!-- end article -->
      <!-- right panel -->
      <jsp:include page="layouts/right-panel.jsp" />
      <!-- end right panel -->
    </div>
    <!-- end content area article -->
    <!-- footer -->
    <jsp:include page="layouts/footer.jsp" />
    <!-- end footer -->
    <!-- #####################javascript#################### -->
    <!-- lib js -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <!-- end lib js -->
    <!-- custom js -->
    <script src="js/custom/index.js"></script>
    <script src="js/custom/right-panel.js"></script>	
    <!-- end custom js -->
    <!-- #####################end javascript#################### -->	
  </body>
</html>