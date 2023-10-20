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
        board.print();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println(user.name+">");
            String UStone = sc.nextLine();
            board.checkPrint(UStone,user);
            
            System.out.println(computer.name+">");
            String CStone = sc.nextLine();
            board.checkPrint(CStone,computer);
        }
        
    }

}
