package com.pes.master;

public enum MatchType {

	  FINAL("결승")
	, THIRD_PLACE_MATCH("3,4위전")
	, SEMIFINAL("4강")
	, QUARTERFINAL("8강")
	, ROUND16("16강")
	, ROUND32("32강")
	, ROUND64("64강")
	, ROUND128("128강")
	, ROUND256("256강")
	, ROUND512("512강")
	, QUALIFYING("예선");
	
	final private String name;
	
    private MatchType(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
