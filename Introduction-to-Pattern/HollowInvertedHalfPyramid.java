/*
Q6. Hollow Inverted Half Pyramid
Problem Description

Given an integer N as input, print the corresponding Hollow Inverted Half Pyramid pattern for N.

For example if N = 6 then pattern will be like:

******
*   *
*  *
* *
**
*


Problem Constraints

1 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the Hollow Inverted Half Pyramid pattern corresponding to the given N.



Example Input

Input 1:

 2
Input 2:

 3
Input 3:

 4


Example Output

Output 1:

 **
 *
Output 2:

 ***
 **
 *
Output 3:

 ****
 * *
 **
 *


Example Explanation

 Print the pattern as described.

 */
import java.lang.*;
import java.util.*;

public class HollowInvertedHalfPyramid{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int row = 1; row <= n; row++){
            System.out.print("*");
        }
        System.out.println();
        //inner pattern
        for(int i = 1; i <= n - 2; i++){
            System.out.print("*");
            //space
            for(int sp = 1; sp <= n - i - 2; sp++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        //last row
        System.out.print("*");
    }
 }