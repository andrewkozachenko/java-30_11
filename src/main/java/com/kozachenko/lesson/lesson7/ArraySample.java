package com.kozachenko.lesson.lesson7;

import java.util.Random;

public class ArraySample {

    public static void main(String[] args) {
        boolean printInMatrixView = true;
        int [] [] array  = new int[3][3];
        int [] [] matrix = {{2, 2},{2,2}};
//        printArray(array, printInMatrixView);
//        infinityCycle();
        fillMatrix(matrix);
        printArray(matrix, printInMatrixView);
//        int i = 5;
//        changer(i);
//        System.out.println(i);
    }

    static void changer(int i){
        i=+120;
    }

    private static void printArray(int[][] array, boolean printInMatrixView) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (printInMatrixView) {
                    System.out.print(array[i][j] + "\t");
                } else {
                    System.out.println("element [" + i + "]"
                            + "[" + j + "]" + "=" + array[i][j]);
                }
            }
            if (printInMatrixView){
                System.out.println();
            }
        }
    }

    private static void infinityCycle(){
        /**
         * while(true)
         * recursion -- ?
         * for(;;)
         */
        for(;;){
            System.out.println("i");
        }
    }

    private static void fillMatrix(int [][]matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                Random random = new Random();
                matrix[i][j] =random.nextInt();
            }
        }
    }

}
