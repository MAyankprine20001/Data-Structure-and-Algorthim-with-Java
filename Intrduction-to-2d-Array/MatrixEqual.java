
/*
Q: Are Matrices Same ?

Problem Description
You are given two matrices A and B of equal dimensions and you have to check whether two matrices are equal or not.

NOTE: Both matrices are equal if A[i][j] == B[i][j] for all i and j.


Problem Constraints
1 <= A.size(), B.size() <= 1000
1 <= A[i].size(), B[i].size() <= 1000
1 <= A[i][j], B[i][j] <= 1000
A.size() == B.size()
A[i].size() == B[i].size()


Input Format
First argument is 2-D array of integers representing matrix A.

Second argument is 2-D array of integers representing matrix B.



Output Format
Return 1 if both matrices are equal or return 0.



Example Input
Input 1:

A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
B = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
Input 2:

A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]
B = [[1, 2, 3],
     [7, 8, 9],
     [4, 5, 6]]


Example Output
Output 1:

1
Output 2:

0

*/


import java.util.*;
import java.lang.*;

public class MatrixEqual{
    public static int isMatrixEqual(int [][]A , int [][]B){
        for(int i = 0; i <= A.length - 1; i++){
            for(int j = 0; j <= A[0].length - 1; j++){
                if(A[i][j] != B[i][j]){
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]A = new int[n][m];
        int [][]B = new int[n][m];

        for(int i = 0; i < n; i++ ){
           for(int j = 0; j < m; j++){
            A[i][j] = scn.nextInt();
           }
        }

         for(int i = 0; i < n; i++ ){
           for(int j = 0; j < m; j++){
            B[i][j] = scn.nextInt();
           }
        }

        int number = isMatrixEqual(A , B);
        System.out.println(number);
    }
}