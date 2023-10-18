package com.project.game.controller;

import org.springframework.util.StringUtils;

public class Board {
    int size;
    String[][] map;
    Board(int size) {
        this.size = size;
        map = new String[size+1][size];
        for (int row = 0; row <= size; row++) {
            for (int col = 0; col < size; col++) {
            	if(col == 0 && row < size) {
            		 map[row][col] = String.format("%2s",Integer.toString(row));
            	}else if(row == size && col > 0){
            		map[row][col] = "A"+col;
            	}else {
            		  map[row][col] = ".";
            	}
  
            }

        }
    }
    public void print() {
        for (int row = 0; row <= size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(" "+map[row][col]);
            }
            System.out.println();
        }
    }
}
