			$("#btnSubmit").click(function(){				
				$.post("Login.news",{
					userName:$("#username").val(),
					password:$("#password").val()
				},function(data, status){
					if(data=="Success")
						window.location.href="../Admin/index.jsp";					
				});
			});