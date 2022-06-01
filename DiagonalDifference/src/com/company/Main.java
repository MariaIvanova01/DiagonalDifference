package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sizeOfMatrix = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[sizeOfMatrix][sizeOfMatrix];

        for (int countRows = 0; countRows < sizeOfMatrix; countRows++) {
            int[] valuesRows = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int countColumns = 0; countColumns < sizeOfMatrix; countColumns++) {
                matrix[countRows][countColumns] = valuesRows[countColumns];
            }
        }

        int firstDisgonalSum = 0;

        for (int firstDiagonalNumbers = 0; firstDiagonalNumbers < sizeOfMatrix; firstDiagonalNumbers++) {
         firstDisgonalSum+=matrix[firstDiagonalNumbers][firstDiagonalNumbers];
        }

        int secondDiagonalSum = 0;

        for (int row = 0, col = sizeOfMatrix - 1; row < sizeOfMatrix ; col--, row ++) {
            secondDiagonalSum+=matrix[row][col];
        }

        if (firstDisgonalSum > secondDiagonalSum){
            System.out.println(firstDisgonalSum - secondDiagonalSum);
        }else{
            System.out.println(secondDiagonalSum - firstDisgonalSum);
        }

    }
}
