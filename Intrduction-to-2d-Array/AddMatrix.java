/*
Q: Add the matrices 

Problem Description

You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.

The Following will give you an idea of matrix addition:


Problem Constraints

1 <= A.size(), B.size() <= 1000 1 <= A[i].size(), B[i].size() <= 1000 1 <= A[i][j], B[i][j] <= 1000
Input Format

The first argument is the 2D integer array A The second argument is the 2D integer array B
Output Format

You have to return a vector of vector of integers after doing required operations.
Example Input

Input 1:
A = [[1, 2, 3],   
     [4, 5, 6],   
     [7, 8, 9]]  

B = [[9, 8, 7],   
     [6, 5, 4],   
     [3, 2, 1]]
 
Input 2:
A = [[1, 2, 3],   
     [4, 1, 2],   
     [7, 8, 9]]  

B = [[9, 9, 7],   
     [1, 2, 4],   
     [4, 6, 3]]
 
Example Output

Output 1:
[[10, 10, 10],   
 [10, 10, 10],   
 [10, 10, 10]]
Output 2:
[[10, 11, 10],   
 [5,   3,  6],   
 [11, 14, 12]]
Example Explanation

Explanation 1:
A + B = [[1+9, 2+8, 3+7],  
         [4+6, 5+5, 6+4],  
         [7+3, 8+2, 9+1]]   
      = [[10, 10, 10],   
         [10, 10, 10],   
         [10, 10, 10]].
Explanation 2:
A + B = [[1+9, 2+9, 3+7],  
         [4+1, 1+2, 2+4],  
         [7+4, 8+6, 9+3]]   
      = [[10, 11, 10],   
         [5,   3,  6],   
         [11, 14, 12]].
Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
*/

import java.util.*;
import java.lang.*;

public class AddMatrix{
    public static int[][] addMatrix(int[][] A , int[][] B){
        int c[][] = new int[A.length][A[0].length];   
        for(int i = 0; i <= A.length - 1; i++){
            for(int j = 0; j<= A[0].length - 1; j++){
                 c[i][j] = A[i][j] + B[i][j] ;
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int [][]A = new int[n][m];
        int [][]B = new int[n][m];

        //mat A is input
        for(int i = 0; i <= A.length - 1; i++){
            for(int j = 0; j <= A[0].length - 1; j++){
                  A[i][j] = scn.nextInt();
            }
        }

        //mat B is input
         for(int i = 0; i <= B.length - 1; i++){
            for(int j = 0; j <= B[0].length - 1; j++){
                 B[i][j] = scn.nextInt();
            }
        }


        int [][]c = addMatrix(A , B);
        for(int i = 0; i <= c.length - 1; i++){
            for(int j = 0; j <= c[0].length - 1; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    
    }
}