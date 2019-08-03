var get_random_number_by_five = function (i) {
    var numbers = [];
    var pickNumbers = i;
         
    for(insertCur = 0; insertCur < pickNumbers ; insertCur++){
        numbers[insertCur] = Math.floor(Math.random() * i) + 1;

        for(searchCur = 0; searchCur < insertCur; searchCur ++){
            if(numbers[insertCur] == numbers[searchCur]){
                insertCur--;
                break;
            }
        }
    }
    return numbers;
};

var draw = 0;
var home_win = 1;
var away_win = 2;

var get_winner_flg = function (key) {
    var home_score_id = "#home_score_" + key; 
    var home_score = $(home_score_id).val();
    var away_score_id = "#away_score_" + key; 
    var away_score = $(away_score_id).val();
	 
    if (home_score == away_score) {
	    return draw;
	} else if (home_score > away_score) {
	    return home_win;
	} else if (home_score < away_score) {
	    return away_win;
	}
};

var get_level_by_rating = function (id) {
    var home_rating_id = "#home_rating_" + id; 
	var home_rating = $(home_rating_id).val();
	var away_rating_id = "#away_rating_" + id; 
	var away_rating = $(away_rating_id).val();
	   
	
	var match_type_id = "#match_type_" + id;
	var match_type = $(match_type_id).val();
	if (match_type == "결승" || match_type == "3,4위전") return "win_cup"; 

	var winner_flg = get_winner_flg(id);
	var result_rating = 0;
    if (winner_flg == draw) return "draw";
    
	if (winner_flg == home_win) {
	    var result_rating = home_rating - away_rating;
	} else if (winner_flg == away_win) {
	    var result_rating = away_rating - home_rating;
	}
	   
	if (result_rating > 200) {
	    return "win_weak";
	} else if (-200 < result_rating && result_rating < 200) {
	    return "win_rival";
	} else if (result_rating < -200) {
	    return "win_strong";
	}		       
};

var set_style_img = function () {
	var total_count = 0;
	$('#result_container').find('.row').each(function(i, e){
		total_count++;
	});
		
	var num_list = get_random_number_by_five(total_count);
		
	$('#result_container').find('.row').each(function(i, e){
		var level = get_level_by_rating(i);
		var result_img_id = "#result_img_" + i;
		var num = num_list[i];
				
		var result_img_url = "url('/img/result/" + level + "/" + num + ".jpg')";
		$(result_img_id).css("background-image", result_img_url);
	});
};

set_style_img();
