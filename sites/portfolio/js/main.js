var main = $('#main');
var mainChildren = $('#main').children();
var x = true;

function formatHeading(){
	if($(window).width() < 884){
		$('h1').css('marginTop', ($('nav').height() + 20).toString() + "px");
		// $('nav').css('marginTop', (-($('nav').height() + 30)).toString() + "px");
		$('nav').css('marginTop', -10);
	} else {
		$('h1').css('marginTop', 30);
		$('nav').css('marginTop', 0);
	}
}

$(document).ready(function(){
	formatHeading();

	$(window).resize(function(){
		formatHeading();
	})

	for(var i = 0; i < mainChildren.length; i++){
		mainChildren.eq(i).delay(i*500).fadeIn(500);
	}

});

