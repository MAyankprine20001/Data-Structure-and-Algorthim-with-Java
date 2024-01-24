
/*
Q: Max and Min of an Array
Problem Description

Take input an array A of size N and write a program to print maximum and minimum elements of the input. The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.

Problem constraints

1 <= N <= 1000

1 <= A <= 1000


Input Format

The first line contains a single integer N representing the length of the array A followed by N elements of the array A.


Output Format

A single line output containing two space-separated integers.
The first integer is the maximum value of the array.
The second integer is the minimum value of the array.


Example Input

Input 1:
5 1 2 3 4 5
Input 2:
4 10 50 40 80

Example Output

Output 1:
5 1
Output 2:
80 10
Note: There is no space after the minimum value in the output format. There is only a single space between the maximum and minimum value.




Write a program to print maximum and minimum elements of the input

*/

import java.util.*;
import java.lang.*;

public class MaxAndMinOfAnArray{
    public static int findMaximumElementArray(int []array){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <= array.length - 1; i++){
            if(max < array[i]){
                max =  array[i];
            }
        }
        return max;
    }
    public static int findMinimumElementArray(int []array){
         int min = Integer.MAX_VALUE;

         for(int i = 0; i<= array.length - 1; i++){
            if(min > array[i]){
                min = array[i];
            }
         }
         return min;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = scn.nextInt();
        }
        int maximum = findMaximumElementArray(array);
        int minimum = findMinimumElementArray(array);
        System.out.print(maximum + " " + minimum);
    }
}

