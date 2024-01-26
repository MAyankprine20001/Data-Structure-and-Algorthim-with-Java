/*
Q: Wave Print (Column Wise)

Problem Description
Write a program to input an integer N and a N*N matrix Mat from user and print the matrix in wave form (column wise)

See example for clarifications regarding wave print.


Problem Constraints
1 <= N <= 103

0 <= Mat[i][j] <= 109



Input Format
First line is an integer N

Next N lines contain N space separated integers representing the matrix Mat



Output Format
A single line containing N*N integers of matrix Mat in wave form (column wise)



Example Input
Input 1:

3
4 1 2 
7 4 4 
3 7 4 
Input 2:

2
1 2
3 4


Example Output
Output 1:

4 7 3 7 4 1 2 4 4 
Output 2:

1 3 4 2


Example Explanation
For Input 1:
We will first iterate the 1st column from top to bottom and print the elements, 
then we will iterate the 2nd column from botton to top and print the elements,
then we will iterate the 3rd column from top to bottom and print the elements.
For Input 2:
We will first iterate the 1st column from top to bottom and print the elements, 
then we will iterate the 2nd column from bottom to top and print the elements.



*/

import java.util.*;
import java.lang.*;

public class WavePrintColumnWise{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = scn.nextInt();
            }    
        }

        boolean flag = false;
        
        for(int j = 0; j <= arr[0].length - 1; j++){
            if(!flag){
                for(int i = 0; i <= arr.length - 1; i++){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int i = arr.length - 1; i >= 0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
            flag = !flag;
        }

    }
}

