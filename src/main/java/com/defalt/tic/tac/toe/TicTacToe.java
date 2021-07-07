package com.defalt.tic.tac.toe;

import java.util.*;

public class TicTacToe {

    public static void DisplayTable(String Table[][]) {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print(i + 1 + " ");
                }
                System.out.print(Table[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String x1, y1;
        String Table[][] = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Table[i][j] = "-";
            }
        }
        System.out.println("Welcome to OX Game");
        DisplayTable(Table);
        int round = 0;
        boolean winner = false;
        while (true) {
            if (winner) {
                break;
            }
            if (round == 9) {
                System.out.println("Tie game....");
                break;
            }
            if (round % 2 == 0) {
                System.out.println("X turn");
            } else {
                System.out.println("O turn");
            }
            System.out.println("Please input Row Col :");
            x1 = kb.next();
            y1 = kb.next();
            try {
                int x = Integer.parseInt(x1);
                int y = Integer.parseInt(y1);
            } catch (Exception NumberFormatException) {
                System.out.println("Row and Col must be number.Please try again!");
                continue;
            }
            int x = Integer.parseInt(x1);
            int y = Integer.parseInt(y1);
            if (x > 3 || x < 1 || y > 3 || y < 1) {
                System.out.println("Row and Col must be 1 - 3.Please try again!");
                continue;
            }
            if (round % 2 == 0) {
                if (!Table[x - 1][y - 1].equals("-")) {
                    System.out.println("This position is already exist please try agian.");
                    continue;
                }
                Table[x - 1][y - 1] = "X";
                DisplayTable(Table);
            } else {
                if (!Table[x - 1][y - 1].equals("-")) {
                    System.out.println("This position is already exist please try agian.");
                    continue;
                }
                Table[x - 1][y - 1] = "O";
                DisplayTable(Table);
            }
            for (int i = 0; i < 3; i++) {
                if (Table[i][0].equals(Table[i][1]) && Table[i][0].equals(Table[i][2]) && !Table[i][0].equals("-")) {
                    System.out.println("Player " + Table[i][0] + " win!....");
                    winner = true;
                    break;
                }
                if (Table[0][i].equals(Table[1][i]) && Table[0][i].equals(Table[2][i]) && !Table[0][i].equals("-")) {
                    System.out.println("Player " + Table[0][i] + " win!....");
                    winner = true;
                    break;
                }
                if (Table[0][0].equals(Table[1][1]) && Table[0][0].equals(Table[2][2]) && !Table[0][0].equals("-")) {
                    System.out.println("Player " + Table[0][0] + " win!....");
                    winner = true;
                    break;
                }
                if (Table[2][0].equals(Table[1][1]) && Table[2][0].equals(Table[0][2]) && !Table[2][0].equals("-")) {
                    System.out.println("Player " + Table[2][0] + " win!....");
                    winner = true;
                    break;
                }
            }
            round++;

        }
        System.out.println("Bye bye ....");

    }
}
