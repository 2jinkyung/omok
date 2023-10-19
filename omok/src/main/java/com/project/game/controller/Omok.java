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
        System.out.println(user.name+">");
        String UStone = sc.nextLine();
        System.out.println(computer.name+">");
        String CStone = sc.nextLine();
        
        System.out.println("UStone"+UStone);
        System.out.println("CStone"+CStone);
        
    }

}
