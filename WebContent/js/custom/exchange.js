	 /* $.post("listexchange.news",function(data){
		 var str="";
		 //alert(data.length);
		 for(var i=0;i<data.length;i++){
			 str+="<tr><td>"+data[i].currency+"</td><td>"+data[i].bid+"</td><td>"+data[i].ask+"</td></tr>"; 
		 }
		 $("#show").html(str);
	 }); */

$(document).ready(function(){
		$.post("listexchange.news", function(data) {
			var str = "";
			//alert(data.length);
			for (var i = 0; i < data.length; i++) {

				str += "<tr><td>" + data[i].currency + "</td><td>"
						+ data[i].bid + "</td><td>" + data[i].ask
						+ "</td></tr>";
			}
			$("#tbodyExchange").html(str);
		});	
	});