var main = {
    init : function () {
    	$("#header").load("/html/header.html");
    	$("#footer").load("/html/footer.html");
    	
    	$.getScript("/js/app/menu/header_menu_current.js")
    	.done(function(script, textStatus) {
    		news_menu_current();
        });
    }
};

main.init();