/*
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


Example Explanation
Explanation 1:
In the first row 2 is maximum value.
In the second row 3 is maximum value.
Explanation 2:
In the first and only row 3 is maximum value.



*/

import java.util.*;
import java.lang.*;

public class LargestEachRow{

    public static int[] largestEachRow(int [][]arr){
        int []largest = new int[arr.length];

        for(int i = 0; i <= arr.length - 1; i++){
            int  largestNumber = Integer.MIN_VALUE;
            for(int j = 0; j <= arr[0].length - 1; j++){
                if(arr[i][j] > largestNumber){
                    largestNumber = arr[i][j];
                }
            }
            largest[i] = largestNumber;
        }
        return largest;
    }
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
         int[] c = largestEachRow(arr);
         for(int i = 0; i <= c.length - 1; i++){
            System.out.print(c[i] + " ");
         } 
    }
}