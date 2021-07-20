package company;

import java.util.Scanner;

public class Nqueens {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean board[][]=new boolean[n][n];
        boolean col[]=new boolean[n];
        boolean sdiag[]=new boolean[2*n-1];
        boolean pdiag[]=new boolean[2*n-1];

        Nqueen(board,col,0,sdiag,pdiag,"");
    }

    public static void Nqueen(boolean[][] board, boolean[] col, int row, boolean[] sdiag, boolean[] pdiag, String s)
    {

        if(row== board.length){
            System.out.println(s+".");
            return;
        }


        for(int column=0;column<board[0].length;column++){
            if(col[column]==false && sdiag[row+column]==false && pdiag[row-column+ board.length-1]==false){

                col[column]=true;
                sdiag[row+column]=true;
                pdiag[row-column+ board.length-1]=true;
                Nqueen(board,col,row+1,sdiag,pdiag,s+row+"->"+col);
                col[column]=false;
                sdiag[row+column]=false;
                pdiag[row-column+ board.length-1]=false;

            }
        }
    }


}
