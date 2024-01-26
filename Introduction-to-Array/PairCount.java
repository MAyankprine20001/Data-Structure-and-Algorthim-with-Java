/*
Q7. Pair Count

Problem Description

You are given an integer array A and an integer B.

You are required to return the count of pairs having sum equal to B.

NOTE: pair (i,j) and (j,i) are same.



Problem Constraints

1 <= A.size() <= 10000

1 <= A[i] <= 10000

1 <= B <= 10000



Input Format

First argument is an integer array A.

Seond argument is an integer B.



Output Format

You have to return an integer representing count of required pairs.



Example Input

Input 1:

A = [1,2,3,2,1]
B = 5
Input 2:

A = [1,1,1]
B = 2


Example Output

Output 1:

2
Output 2:

3


Example Explanation

Explanation 1:

 A[1]+A[2] = A[2]+A[3] = 5
Explanation 2:

 A[0]+A[1] = A[0]+A[2] = A[1]+A[2] = 2


Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases

*/

import java.lang.*;
import java.util.*;

public class PairCount{
    public static int pairCount(int []arr , int b){
        int count  = 0;
          for(int i = 0 ;i < arr.length - 1; i++){
          for(int j = i + 1; j < arr.length; j++){
              if(arr[i] + arr[j] == b)count++;
          }
      }
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int B = scn.nextInt();

        int count = pairCount(arr , B);
        System.out.println(count);

    }
}

