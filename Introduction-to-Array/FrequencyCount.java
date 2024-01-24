/*

Q6. Frequency count

Problem Description
You are given an integer array A, you have to return an integer array of same size whose ith element is the frequency count of A[i] in array A .



Problem Constraints
1 <= len(A) <= 1000

1 <= A[i] <= 100



Input Format
First argument is an array of integers representing array A.



Output Format
You have to return an array of integers as per the question.



Example Input
Input 1:

A = [1, 2, 5, 1, 5, 1 ]


Example Output
Output 1:

[3, 1, 2, 3, 2, 3]


Example Explanation
Explanation 1:

Clearly, In the given array we have 1 three times, 2 one time and 5 two times.



Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
Arg 1: An Integer Array, For e.g [1,2,3]

*/

import java.util.*;
import java.lang.*;

public class FrequencyCount{
    public static int calculateCount(int number , int []arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                count++;
            }
        }
        return count;
    }
    public static int[] frequencyCount(int []arr){
        int []frequencyArray = new int[arr.length];

        for(int i = 0; i <= arr.length - 1; i++){
            int count = calculateCount(arr[i] , arr);
            frequencyArray[i] = count;
        }

        return frequencyArray;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = scn.nextInt();
        }

        int []newArray = frequencyCount(arr);
        for(int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }
}