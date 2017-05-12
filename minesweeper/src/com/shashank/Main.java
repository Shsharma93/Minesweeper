package com.shashank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Game minesweeper = new Game();

        minesweeper.setLine(sc.nextInt());
        minesweeper.setColumn(sc.nextInt());



        char[][] array = new char[200][200];
        array = minesweeper.input(array);
        minesweeper.output(array);


    }

}