/*
Q5. Copy the Array
Problem Description

You are given a constant array A and an integer B.

You are required to return another array where outArr[i] = A[i] + B.



Problem Constraints

1 <= A.size() <= 10000

1 <= A[i] <= 10000

1 <= B <= 10000



Input Format

First argument is a constant array A.

Second argument is an integer B.



Output Format

You have to return an integer array.



Example Input

Input 1:

A = [1,2,3,2,1]
B = 3
Input 2:

A = [1,1,10]
B = 6


Example Output

Output 1:

 [4,5,6,5,4] 
Output 2:

 [7,7,16] 


Example Explanation

Explanation 1:

A[0] + 3 = 1 + 3 = 4
A[1] + 3 = 2 + 3 = 5
A[2] + 3 = 3 + 3 = 6
A[3] + 3 = 2 + 3 = 5
A[4] + 3 = 1 + 3 = 4


Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
*/

import java.util.*;
import java.lang.*;

public class CopyOfArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //size of array
        int b = scn.nextInt(); 
        int array[] = new int[n];
        for(int i = 0; i<n; i++){
           array[i] = scn.nextInt(); 
        }
        for(int i = 0; i <= array.length - 1; i++){
            array[i] = array[i] + b;
        }
        for(int i = 0; i <= array.length - 1; i++){
            System.out.print(array[i] + " ");
        }
        
    }
}

