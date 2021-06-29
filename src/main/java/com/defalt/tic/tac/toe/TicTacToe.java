package com.defalt.tic.tac.toe;
import java.util.*;
public class TicTacToe {
    public static void DisplayTable(String Table[][]){
        System.out.println("  1 2 3");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j==0){
                    System.out.print(i+1+" ");
                }
                System.out.print(Table[i][j]+" ");
            }System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
	int x,y;
	String Table[][] =new String[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               Table[i][j]="-";
            }
        }
        System.out.println("Welcome to OX Game");
        DisplayTable(Table);
	int round=0;
        while(true){
            if(round%2==0){
                System.out.println("X turn");
            }else{{
                System.out.println("Y turn");
            }
            System.out.println("Please input Row Col :");
            x=kb.nextInt();
            y=kb.nextInt();
            if(round%2==0){
                Table[x-1][y-1]="X";
                DisplayTable(Table);
            }else{
                 Table[x-1][y-1]="Y";
                DisplayTable(Table);
            }for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                
            }
            }
        }
        
        

        
    }
}
