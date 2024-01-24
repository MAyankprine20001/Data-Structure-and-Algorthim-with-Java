/*
Q7. Frequency of X in Array

Problem Description
Given an integer array A. Find and return the frequency of number B in array A.


Problem Constraints
1 <= |A| <= 105
1 <= A[i] <= 109
1 <= B <= 109


Input Format
The first argument is an integer array A.
The second argument is an integer B.


Output Format
Return the frequency of B in the array A.


Example Input
Input 1:-
A = [1, 1, 2, 4, 2]
B = 2
Input 2:-
A = [4, 2, 3, 4, 4]
B = 4


Example Output
Output 1:-
2
Output 2:-
3


Example Explanation
Explanation 1:-
There are two occurences of 2 in array A.
Explanation 2:-
There are three occurences of 4 in array A.



Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
*/

import java.util.*;
import java.lang.*;

public class FrequencyInArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        } 
        int frequencyNumber = scn.nextInt();
        
        int count = 0;
        for(int i = 0; i<= arr.length - 1; i++){
            if(arr[i] == frequencyNumber){
                count++;
            }
        }
        System.out.println(count);
    }
}