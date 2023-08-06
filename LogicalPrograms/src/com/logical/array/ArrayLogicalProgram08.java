package com.logical.array;

public class ArrayLogicalProgram08 {
    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        
        int sum = calculateDiagonalSum(matrix);
        System.out.println("Sum of the diagonal elements: " + sum);
    }
    
    public static int calculateDiagonalSum(int[][] matrix) {
        int sum = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                }
            }
        }
        
        return sum;
    }
}
