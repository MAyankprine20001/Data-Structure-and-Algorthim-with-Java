/*
Q: search element

Problem Description

You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.

Problem Constraints

1 <= T <= 10
1 <= A <= 105
1 <= A[i], B <= 109


Input Format

First line of the input contains number of test cases as single integer T .
Next, each of the test case consists of 3 lines:

First line contains a single integer A denoting the length of array
Second line contains A integers denoting the array elements
Third line contains a single integer B


Output Format

For each test case, print on a separate line 1 if the element exists, else print 0.



Example Input

Input 1:

 1 
 5 
 4 1 5 9 1
 5
Input 2:

 1
 3 
 7 7 2
 1 


Example Output

Output 1:

 1 
Output 2:

 0 


Example Explanation

Explanation 1:

  B = 5  is present at position 3 in A 
Explanation 2:

  B = 1  is not present in A. 



*/

import java.util.*;
import java.lang.*;

public class SearchElement{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        int n = scn.nextInt();
        int searchElement = scn.nextInt();
        int flag = 0;

        while(T-- > 0){
             int []array = new int[n];
             //array is entered
            for(int i = 0; i < n; i++ ){
                array[i] = scn.nextInt();
            }
            for(int i = 0; i <= array.length - 1; i++ ){
                if(array[i] == searchElement){
                   flag = 1;
                   System.out.println(flag);
                }
            }
            System.out.println(flag);
        }
    }
}