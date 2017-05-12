package com.shashank;


import java.util.Scanner;

public class Game {

    private int line;
    private int column;
    private int count=0;

    Scanner sc = new Scanner(System.in);


    public void setLine(int height) {
        this.line = height;
    }

    public void setColumn(int column) {
        this.column = column;

    }


    public char[][] input(char[][] array) {

        for (int i = 0; i < this.line; i++) {

            String line = new String(sc.nextLine());

            for (int j = 0; j < this.column; j++) {
                array[i][j] = line.charAt(j);
            }
        }
        return array;
    }

    public void output(char[][] array) {

        for (int i = 0; i < line; i++) {

            for (int j = 0; j < column; j++) {

                count=0;

                if (array[i][j] == '*') {
                    System.out.print("*");
                }

                else if(i==0 && j==0) {
                    System.out.print(checkFirstLineFirstColumn(array,i, j));
                }

                else if(i==0 && j==(column-1)) {
                    System.out.print(checkFirstLineLastColumn(array,i, j));
                }

                else if(i==(line-1) && j==0) {
                    System.out.print(checkLastLineFirstColumn(array,i, j));
                }

                else if(i==(line-1) && j==(column-1)) {
                    System.out.print(checkLastLineLastColumn(array,i, j));
                }

                else if(i==0 && j>0 && j<(column-1)) {
                    System.out.print(checkFirstLine(array,i, j));
                }

                else if(j==0 && i>0 && i<(line-1)) {
                    System.out.print(checkFirstColumn(array,i, j));
                }

                else if(i==(line-1) && j>0 && j<(column-1)) {
                    System.out.print(checkLastLine(array, i, j));
                }

                else if(j==(column-1) && i>0 && i<(line-1)) {
                    System.out.print(checkLastColumn(array, i, j));
                }

                else {
                    System.out.print(checkMiddleNode(array, i, j));
                    }
                }
                    System.out.println();
            }


        }

    private int checkFirstLineFirstColumn(char[][] array, int i, int j) {

        if(array[i][j+1]=='*'){
            count+=1;
        }
        if(array[i+1][j]=='*'){
            count+=1;
        }
        if(array[i+1][j+1]=='*'){
            count+=1;
        }

        return count;

    }

    private int checkFirstLineLastColumn(char[][] array, int i, int j){

        if(array[i][j-1]=='*'){
            count+=1;
        }
        if(array[i+1][j]=='*'){
            count+=1;
        }
        if(array[i+1][j-1]=='*'){
            count+=1;
        }

        return count;

    }

    private int checkLastLineFirstColumn(char[][] array, int i, int j){

        if(array[i-1][j]=='*'){
            count+=1;
        }
        if(array[i-1][j+1]=='*'){
            count+=1;
        }
        if(array[i][j+1]=='*'){
            count+=1;
        }

        return count;
    }

    private int checkLastLineLastColumn(char[][] array, int i, int j){

        if(array[i][j-1]=='*'){
            count+=1;
        }
        if(array[i-1][j-1]=='*'){
            count+=1;
        }
        if(array[i-1][j]=='*'){
            count+=1;
        }

        return count;
    }

    private int checkFirstLine(char[][] array, int i, int j){

        if(array[i][j-1]=='*'){
            count+=1;
        }
        if(array[i][j+1]=='*'){
            count+=1;
        }
        if(array[i+1][j]=='*'){
            count+=1;
        }
        if(array[i+1][j-1]=='*'){
            count+=1;
        }
        if(array[i+1][j+1]=='*'){
            count+=1;
        }

        return count;
    }

    private int checkFirstColumn(char[][] array, int i, int j){

        if(array[i-1][j+1]=='*'){
            count+=1;
        }
        if(array[i-1][j]=='*'){
            count+=1;
        }
        if(array[i+1][j]=='*'){
            count+=1;
        }
        if(array[i+1][j+1]=='*'){
            count+=1;
        }
        if(array[i][j+1]=='*'){
            count+=1;
        }

        return count;
    }

    private int checkLastLine(char[][] array, int i, int j){

        if(array[i][j-1]=='*'){
            count+=1;
        }
        if(array[i][j+1]=='*'){
            count+=1;
        }
        if(array[i-1][j]=='*'){
            count+=1;
        }
        if(array[i-1][j-1]=='*'){
            count+=1;
        }
        if(array[i-1][j+1]=='*'){
            count+=1;
        }

        return count;
    }

    private int checkLastColumn(char[][] array, int i, int j){

        if(array[i-1][j-1]=='*'){
            count+=1;
        }
        if(array[i-1][j]=='*'){
            count+=1;
        }
        if(array[i+1][j]=='*'){
            count+=1;
        }
        if(array[i+1][j-1]=='*'){
            count+=1;
        }
        if(array[i][j-1]=='*'){
            count+=1;
        }
        return count;
    }

    private int checkMiddleNode(char[][] array, int i, int j){

        if(array[i-1][j-1]=='*'){
            count+=1;
        }
        if(array[i-1][j]=='*'){
            count+=1;
        }
        if(array[i-1][j+1]=='*'){
            count+=1;
        }
        if(array[i][j-1]=='*'){
            count+=1;
        }
        if(array[i][j+1]=='*'){
            count+=1;
        }
        if(array[i+1][j-1]=='*'){
            count+=1;
        }
        if(array[i+1][j]=='*'){
            count+=1;
        }
        if(array[i+1][j+1]=='*'){
            count+=1;
        }

        return count;
    }

}
