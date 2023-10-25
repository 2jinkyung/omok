package com.project.game.controller;

import java.util.Scanner;

public class Omok {
    public static void main(String[] args) {
        Player user = new Player("사용자", "O");
        Player computer = new Player("컴퓨터", "X");
        Board board = new Board(19);
        play(board, user, computer);
    }
    private static void play(Board board, Player user, Player computer) {
        
        Scanner sc = new Scanner(System.in); 
        Player turn = user;
        Boolean State = true;
        
        while(State == true){
        	board.print();
        	
            System.out.println(turn.getName()+">");
            String Stone = sc.nextLine();
            turn = (turn.getStone().equals("O")) ? computer : user;
            State = board.gamePlay(Stone,turn);
            
        }
        board.print(); //최종 바둑판

    }

}
