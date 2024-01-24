/*
Q: sum of array 

Problem Description

Write a program to print sum of elements of the input array A of size N.

Note: the size element is removed from the list passed as input to the function main, that is only elements are present. User is supposed to add them up and return the result


Problem Constraints

1 <= N <= 1000

1 <= A <= 1000



Input Format

A list of length N



Output Format

A single integer containing sum of elements from the input array.



Example Input

Input 1:

5 1 2 3 4 5
Input 2:

4 10 50 40 80


Example Output

Output 1:

15
Output 2:

180

Sample Explanation:

Input-1:
A = [5, 1, 2, 3, 4, 5]
here the first element is the size of A and the remaining elements are [1, 2, 3, 4, 5]
which all sum to 15

Input-1:
A = [4, 10, 50, 40, 80]
here the first element is the size of A and the remaining elements are [10, 50, 40, 80]
which all sum to 180

*/


import java.util.*;
import java.lang.*;

public class SumOfArray{
    public static int sumOfArray(int []arr){
        int sum = 0;

        for(int i = 0; i <= arr.length - 1; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []array = new int[n];
        
        for(int i = 0; i < n; i++){
          array[i] = scn.nextInt();
        }

        int sum = sumOfArray(array);
        System.out.print(sum);

    }
}