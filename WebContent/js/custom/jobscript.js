	 /* $.post("listexchange.news",function(data){
		 var str="";
		 //alert(data.length);
		 for(var i=0;i<data.length;i++){
			 str+="<tr><td>"+data[i].currency+"</td><td>"+data[i].bid+"</td><td>"+data[i].ask+"</td></tr>"; 
		 }
		 $("#show").html(str);
	 }); */

$(document).ready(function(){
		$.post("joblist.json", function(data) {
			var str = "";
			for (var i = 0; i < data.length; i++) {

				str += "<tr><td>" + data[i].title + "</td><td>"
						+ data[i].company + "</td><td>" + data[i].closeDate
						+ "</td><td>" + data[i].category
						+ "</td></tr>";
			}
			$("#tbjoblist").html(str);
			$('#listjob').dataTable({
				"lengthMenu" : [ [ 5, 10, 30, -1 ], [ 5, 10, 30, "All" ] ]
			/* Sarin add datatable */
			});
			
		});	
	});