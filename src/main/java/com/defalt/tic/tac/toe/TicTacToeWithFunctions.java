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



   
    public static void main(String[] args) {

        int round = 0;
        String table[][] = new String[3][3];
        initialTable(table);
        displayWelcomeAndTable(table);


    }
}
