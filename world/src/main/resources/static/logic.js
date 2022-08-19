$('#on').on('mousedown', function(){
	$.get('/on');
	});
$('#on').on('mouseup', function(){
	$.get('/off');
	});