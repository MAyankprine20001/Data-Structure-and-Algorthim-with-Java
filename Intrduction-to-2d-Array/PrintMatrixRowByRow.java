/*
Q1. Print matrix row by row
Problem Description
Given a matrix of N rows and M columns, print it row by row. Firstly print 0th row, then 1st row, 2nd row and so on.


Problem Constraints
1 <= N <= 100
1 <= M <= 100
1 <= mat[i][j] <= 10000


Input Format
Two values denoting N and M,
Next N lines contain M space separated integers representing the matrix Mat


Output Format
N lines denoting each row.


Example Input
3 4
10 20 30 40
50 60 70 80
90 100 110 120


Example Output
10 20 30 40
50 60 70 80
90 100 110 120


Example Explanation
0th row -> 10 20 30 40
1st row -> 50 60 70 80
2nd row -> 90 100 110 120

*/


import java.util.*;
import java.lang.*;

public class PrintMatrixRowByRow{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
               arr[i][j] = scn.nextInt();
            }
        }

        //print matrix row by row
        for(int i = 0; i <= arr.length - 1; i++){
            for(int j = 0; j <= arr[0].length - 1; j++){
                System.out.print(arr[i][j]  + " ");
            }
            System.out.println();
        }
    }
}

