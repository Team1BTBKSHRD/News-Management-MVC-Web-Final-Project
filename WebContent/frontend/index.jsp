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
                        <h3 class="article-name">dfssdfasdáááááâá¥áááá¶âááááá¼áâáá¼áâáááá¸âááâáááá¾âááááâ...</h3>
                        <strong>                      
                         áááá¶ááááá <kbd><time>2015/03/07</time></kbd>
                       </strong>
                       <p class="clear-margin-bottom">
                        ááááá¶ááâáá¸âááá·áá¶âáááá¶ááâáá áá¶áá¸áááâសសដស¸âáááâáááá¸âáááá¶áâáá¶âáá¶âáá ááááá¶ááâáá¸âááá·áá¶âáááá¶ááâáá áá¶áá¸áááâ áááá¼áá¸âáááâááááសដថាសáâáá¸âááá·áá¶âáááá¶ááâáá áá¶áá¸áááááá¶ááâáá¸âááá·áá¶âáááá¶ááâáá áá¶áá¸á
                        <strong class="news-source">áááááááááá¶á<kbd>Sabay</kbd></strong>
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
