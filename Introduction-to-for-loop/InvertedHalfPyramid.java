/*
*
Q6. InvertedHalfPyramid

Problem Description

Given an integer N, print the corresponding Inverted Half Pyramid pattern for N.

For example if N = 4 then pattern will be like:

****
***
**
*


Problem Constraints

1 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the Inverted Half Pyramid pattern corresponding to the given N.



Example Input

Input 1:

 2
Input 2:

 3


Example Output

Output 1:

 **
 *
Output 2:

 ***
 **
 *


Example Explanation

 Print the pattern as described.

*/

import java.util.*;
import java.lang.*;

public class InvertedHalfPyramid{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i + 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}