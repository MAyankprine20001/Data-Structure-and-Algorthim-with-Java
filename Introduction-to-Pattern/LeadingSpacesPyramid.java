/*
Q2. Leading spaces pyramid
Problem Description
Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

____*
___**
__***
_****
*****
Note : Here '_' represents space for explanation purpose only. You have to print space in your code.


Problem Constraints
1 <= N <= 100



Input Format
First and only line of input contains a single integer N.



Output Format
Output the pattern corresponding to the given N.



Example Input
Input 1:

 2
Input 2:

 3


Example Output
Output 1:

 *
**
Output 2:

  *
 **
***


Example Explanation
 Print the pattern as described.



*/

import java.util.*;
import java.lang.*;

public class  LeadingSpacesPyramid{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++){
            // for space
           for(int sp = 1; sp <= n - i; sp++){
            System.out.print(" ");
           }
           //for star
           for(int st = 1; st <= i; st++){
            System.out.print("*");
           }
           System.out.println();
        }
    }
} 

 