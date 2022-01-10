package ru.skypro.homework4;

public class TaskFive {

    public static void main(String[] args) {

        int matrixSize = 3;
        int[][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == j || j == matrixSize - i - 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
