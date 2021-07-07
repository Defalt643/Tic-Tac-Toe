package com.defalt.tic.tac.toe;

import java.util.*;

public class TicTacToeWithFunctions {

    public static void displayWelcomeAndTable(String table[][]) {
        System.out.println("Welcome to OX Game");
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print(i + 1 + " ");
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void initialTable(String table[][]) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = "-";
            }
        }
    }

    public static void displayTable(String table[][]) {
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print(i + 1 + " ");
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void addRound(int round) {
        round++;
    }

    public static boolean checkWinner(String table[][]) {
        for (int i = 0; i < 3; i++) {
            if (table[i][0].equals(table[i][1]) && table[i][0].equals(table[i][2]) && !table[i][0].equals("-")) {
                return true;
            }
            if (table[0][i].equals(table[1][i]) && table[0][i].equals(table[2][i]) && !table[0][i].equals("-")) {
                return true;
            }
            if (table[0][0].equals(table[1][1]) && table[0][0].equals(table[2][2]) && !table[0][0].equals("-")) {
                return true;
            }
            if (table[2][0].equals(table[1][1]) && table[2][0].equals(table[0][2]) && !table[2][0].equals("-")) {
                return true;
            }
        }
        return false;
    }

    public static char getWinner(int round) {
        if (round % 2 == 0) {
            return 'X';
        }
        return 'O';
    }

   
    public static void main(String[] args) {

        int round = 0;
        String table[][] = new String[3][3];
        initialTable(table);
        displayWelcomeAndTable(table);


    }
}
