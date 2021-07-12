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

    public static int addRound(int round) {
        return ++round;
    }

    public static boolean checkWinner(String table[][]) {
        for (int i = 0; i < 3; i++) {
            if (table[i][0].equals(table[i][1]) 
                    && table[i][0].equals(table[i][2]) 
                    && !table[i][0].equals("-")) {
                return true;
            }
            if (table[0][i].equals(table[1][i]) 
                    && table[0][i].equals(table[2][i]) 
                    && !table[0][i].equals("-")) {
                return true;
            }
            if (table[0][0].equals(table[1][1]) 
                    && table[0][0].equals(table[2][2]) 
                    && !table[0][0].equals("-")) {
                return true;
            }
            if (table[2][0].equals(table[1][1]) 
                    && table[2][0].equals(table[0][2]) 
                    && !table[2][0].equals("-")) {
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

    public static int[] getInput(int round) {
        Scanner kb = new Scanner(System.in);
        while (true) {
            if (round % 2 == 0) {
                System.out.println("X turn\nPlease input Row Col :");
            } else {
                System.out.println("O turn\nPlease input Row Col :");
            }
            String x1 = kb.next(),y1 = kb.next();
            if(!checkException(x1,y1)){
                int x = Integer.parseInt(x1),y = Integer.parseInt(y1);
                int arr[] = {x, y};
                return arr;
            }else{
                continue;
            }
        }
    }public static boolean checkException(String x1,String y1){
        try {
                int x = Integer.parseInt(x1);
                int y = Integer.parseInt(y1);
                int arr[] = {x, y};
                if (x > 3 || x < 1 || y > 3 || y < 1) {
                    System.out.println("Row and Col must be 1 - 3.Please try again!");
                    return true;
                }return false;
                
            } catch (Exception NumberFormatException) {
                System.out.println("Row and Col must be number.Please try again!");
                return true;
            }
    }

    public static boolean addXIntoTable(String table[][], int[] position) {
        if (!table[position[0] - 1][position[1] - 1].equals("-")) {
            System.out.println("This position is already exist please try agian.");
            return false;
        }
        table[position[0] - 1][position[1] - 1] = "X";
        return true;
    }

    public static boolean addYIntoTable(String table[][], int[] position) {
        if (!table[position[0] - 1][position[1] - 1].equals("-")) {
            System.out.println("This position is already exist please try agian.");
            return false;
        }
        table[position[0] - 1][position[1] - 1] = "O";
        return true;
    }

    public static void main(String[] args) {
        int round = 0;
        String table[][] = new String[3][3];
        initialTable(table);
        displayWelcomeAndTable(table);
        while (true) {
            if (round == 9) {
                System.out.println("Tie game....");
                break;
            }
            if (round % 2 == 0) {
                if (!addXIntoTable(table, getInput(round))) {
                    continue;
                }
                displayTable(table);
            } else {
                if (!addYIntoTable(table, getInput(round))) {
                    continue;
                }
                displayTable(table);
            }
            if (checkWinner(table)) {
                System.out.println("Player " + getWinner(round) + " win!....");
                break;
            }
            round = addRound(round);
        }
        System.out.println("Bye bye.....");
    }
}
