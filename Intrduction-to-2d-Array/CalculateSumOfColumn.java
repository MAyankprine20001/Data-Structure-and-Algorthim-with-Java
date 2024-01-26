/**
 Q : Largest in each Row of 2D Array

Problem Description
Given a 2D array A of N rows and M columns. Find value of largest element in each row.


Problem Constraints
1 <= N, M <= 1000
1 <= Ai <= 109


Input Format
The first argument A is a 2D array of integers


Output Format
Return an array of length N, in which every index i contains the maximun value of the ith row in the 2D matrix.


Example Input
Input 1:
A = [[1, 2], [1, 3]]
Input 2:
A = [[1, 2, 3]]


Example Output
Output 1:
 [2, 3]
Output 2:
 [3]

 */

import java.lang.*;
import java.util.*;

public class CalculateSumOfColumn{

    public static int[] columnSum(int A , int B ,int[][]C){
        int []d = new int[B];

        for(int j = 0; j <= C[0].length - 1; j++){
            int sum = 0;
           for(int i = 0; i <= C.length - 1; i++ ){
               sum = sum + C[i][j];
           }
           d[j] = sum;
        }
        return d;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();

        int [][]C = new int[A][B];
        for(int i = 0; i < A; i++ ){
            for(int j = 0; j < B; j++){
                C[i][j] = scn.nextInt();
            }
        }
      int e[] = columnSum(A , B , C);
      for(int i  = 0; i <= e.length - 1; i++){
        System.out.print(e[i] + " ");
      }
    }
}