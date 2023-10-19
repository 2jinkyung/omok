package com.project.game.controller;

import org.springframework.util.StringUtils;

public class Board {
    int size;
    String[][] map;
    Board(int size) {
        this.size = size;
        map = new String[size+1][size+1];
        for (int row = 0; row <= size; row++) {
            for (int col = 0; col <= size; col++) {
            	if(col == 0 && row < size) {
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
        for (int row = 0; row <= size; row++) {
            for (int col = 0; col <= size; col++) {
                System.out.print(" "+map[row][col]);
            }
            System.out.println();
        }
    }
    
    public void checkPrint(String point) {
    	String[] points = point.split(" ");
    	
    	String spell = points[0];
    	String number = points[1];
    }
}
