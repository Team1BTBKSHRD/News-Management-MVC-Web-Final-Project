	function countview(pnewid){
		$.post("countview.news", {
			newid : pnewid
		});
	}