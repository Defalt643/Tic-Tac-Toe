package com.defalt.tic.tac.toe;
import java.util.*;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
	int x,y;
	System.out.println("Welcome to OX Game\n  1 2 3\n1 - - -\n2 - - -\n3 - - -");
	System.out.println("X turn");
	System.out.printf("Please input Row Col :");
	x=kb.nextInt();
	y=kb.nextInt();
    }
}
