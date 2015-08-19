	function countview(pnewid){
		$.post("countview.json", {
			newid : pnewid
		});
	}