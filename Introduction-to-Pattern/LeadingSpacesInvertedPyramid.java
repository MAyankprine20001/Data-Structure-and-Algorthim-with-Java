/*
Q1. Leading spaces inverted pyramid
Problem Description
Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*****
_****
__***
___**
____*
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

**
_*
Output 2:

 
 ***
 _**
 __*
Note : Here '_' represents space for explanation purpose only. You have to print space in your code.


Example Explanation
 Print the pattern as described.
*/



import java.lang.*;
import java.util.*;

public class LeadingSpacesInvertedPyramid{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int row = 1; row <= n; row++){

            //space
            for(int sp = 1; sp <= row - 1; sp++){
                System.out.print(" ");
            }
            //star
            for(int st = 1; st <= n - row + 1; st++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

