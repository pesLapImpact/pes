var main = {
    init : function () {
    	$("#header").load("/html/header.html");
    	$("#footer").load("/html/footer.html");
    	$.getScript("/js/app/menu/ranking_menu_current.js", function () {});
    },
};

main.init();