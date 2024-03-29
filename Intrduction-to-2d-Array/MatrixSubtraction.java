/*

Q : Matrix Subtraction

Problem Description

You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M). You have to subtract matrix B from A and return the resultant matrix. (i.e. return the matrix A - B).

If A and B are two matrices of the same order (same dimensions). Then A - B is a matrix of the same order as A and B and its elements are obtained by doing an element wise subtraction of A from B.


Problem Constraints

1 <= N, M <= 103

-109 <= A[i][j], B[i][j] <= 109



Input Format

The first argument is the 2D integer array A
The second argument is the 2D integer array B


Output Format

Return a 2D matrix denoting A - B.



Example Input

Input 1:

A =  [[1, 2, 3], 
      [4, 5, 6], 
      [7, 8, 9]]

B =  [[9, 8, 7], 
      [6, 5, 4], 
      [3, 2, 1]]
Input 2:

A = [[1, 1]]
 
B = [[2, 3]] 


Example Output

Output 1:

 [[-8, -6, -4],
  [-2, 0, 2],
  [4, 6, 8]]
Output 2:

 [[-1, -2]]


Example Explanation

Explanation 1:

 image
Explanation 2:

 [[1, 1]] - [[2, 3]] = [[1 - 2, 1 - 3]] = [[-1, -2]]


*/


import java.util.*;
import java.lang.*;

public class MatrixSubtraction{
    public static int[][] matrixSubtraction(int [][]A , int [][]B){
        int [][]C  = new int[A.length][A[0].length];

        for(int i = 0; i <= A.length - 1; i++){
            for(int j = 0; j <= A[0].length - 1; j++){
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        int arr1[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr1[i][j] = scn.nextInt();
            }
        }

        int [][]C = matrixSubtraction(arr , arr1);
        
        for(int i = 0; i <= C.length - 1; i++){
            for(int j = 0; j <= C[0].length - 1; j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

    }
}