var main = {
    init : function () {
    	$("#header").load("/html/header.html");
    	$("#footer").load("/html/footer.html");

    	var menu = $('#menu_content').val();
    	
    	$.getScript("/js/app/menu/header_menu_current.js")
    	.done(function(script, textStatus) {
    		menuCurrent(menu);
        });
    }
};

main.init();