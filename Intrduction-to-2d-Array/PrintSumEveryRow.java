/*
Q : Print sum of every Row
Problem Description

Write a program to input an N X M matrix A from user and print sum of every row.


Problem Constraints

1 <= N <= 100
1 <= M <= 100
1 <= A[i][j] <= 10000


Input Format

Two values denoting N and M,
Next N lines contain M space separated integers representing the matrix A.


Output Format

Print sum of each row space separated.


Example Input

3 4
1 2 3 4
5 6 7 8
9 2 4 1


Example Output

10 26 16


Example Explanation

0th row sum -> 1+2+3+4 = 10
1st row sum -> 5+6+7+8 = 26
2nd row sum-> 9+2+4+1 = 16

*/

import java.util.*;
import java.util.*;

public class PrintSumEveryRow{
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

        for(int i = 0; i <= arr.length - 1; i++){
            int sum = 0;
            for(int j  = 0; j <= arr[0].length - 1; j++){
                sum  = sum + arr[i][j];
            }
            System.out.print(sum + " ");
        }

        
    }
}