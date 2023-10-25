package com.project.game.controller;

import org.springframework.util.StringUtils;

public class Board {
    int size;
    String[][] map;
    Board(int size) {
        this.size = size;
        map = new String[size+1][size+1];
        for (int row = 1; row <= size; row++) {
            for (int col = 0; col <= size; col++) {
            	if(col == 0) {
            		map[row][col] = String.format("%2s",Integer.toString(row));
            	}else {
            		map[row][col] = ".";
            	};
            	if(row == size){
            		map[row][0] = "  ";
            		char line= (char)(64+col);
            		map[row][col] = Character.toString(line);
            	};
            }
        }
    }
    public void print() {
        for (int row = 1; row <= size; row++) {
            for (int col = 0; col <= size; col++) {
                System.out.print(" "+map[row][col]);
            }
            System.out.println();
        }
    }     
    
    public boolean gamePlay(String point,Player user) {
    	
    	String[] points = point.split(" ");
    	
    	int spell = (int)points[0].charAt(0)-64;
    	int number = Integer.parseInt(points[1]);
    	
    	if(map[number][spell].equals(".")) {
    		map[number][spell] = user.stone;
    	}else {
    		System.out.println("이미 설치 되어있습니다.");
    		return true;
    	}
    	
    	int _row = number;
    	int _col = spell;
    	int count = 0;
    	
    	// -> 
    	while(map[_row][_col].equals(user.getStone()) && _col < size ){
    		System.out.println("_col"+_col);
    		_col++;
    		count++;
    		
    		System.out.println("돌"+map[_row][_col].equals(user.getStone()));
    		System.out.println("count"+count);
    	}
    		if(!map[_row][_col].equals(user.getStone())) count--;
    		
    		if(count == 5) System.out.println(user.getName()+"승리");
    	
    	return true;
    }
    
    
    
    
    
    // -> 체크
    public boolean check(String[][] map,Player player) {
    	boolean flag= false;
    	int rowCount = map.length;
    	int colCount = map[0].length;
    	int count = 0;
    	
    	// -> 
    	for(int row=0;row <= rowCount ;row++) {
    		for(int col=0;col <= colCount ;col++) {
    			if(map[row][col].equals(player.stone)) {
    				count++;
    				if(count == 5) return false;
    			}
    		}
    	}
    	
    	// ↘ 
//    	for(int row=0;row <= rowCount ;row++) {
//    		for(int col=0;col <= colCount ;col++) {
//    			if(map[row][col].equals(player.stone)) {
//    				count++;
//    				if(count == 5) return true;
//    			}
//    		}
//    	}
    	
    	
    	
    	return true;
    }
    

    

    

}
