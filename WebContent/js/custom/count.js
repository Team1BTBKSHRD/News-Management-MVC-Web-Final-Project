$('body').on('click', '.news-title-background, .card-1, .card-2, .list-group-item',
		function() {
			if(!$.cookie($(this).attr('id'))){
				$.post("countview.json", { newid : $(this).attr('id') });
				$.cookie($(this).attr('id'), true);
			}
		});

/*
 * $.post("countview.json", { newid : pnewid });
 */
