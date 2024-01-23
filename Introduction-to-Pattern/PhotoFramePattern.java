/*
Q2. Photo Frame Pattern
Problem Description
Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*****
*   *
*   *
*   *
*****
Note : Except for the first line and the last line, every line will have N-2 spaces between the two stars.


Problem Constraints
3 <= N <= 100


Input Format
First and only line of input contains a single integer N.



Output Format
Output the pattern corresponding to the given N.



Example Input
Input 1:

 3
Input 2:

 4


Example Output
Output 1:

***
* *
***
Output 2:

 
****
*  *
*  *
****


Example Explanation
 Print the pattern as described.

*/

import java.util.*;
import java.lang.*;

public class PhotoFramePattern{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // 1 row
        for(int row = 1; row <= n; row++){
            System.out.print("*");
        }
        System.out.println();
        //star and space logic
        for(int innerRow = 1; innerRow <= n - 2; innerRow++){
            System.out.print("*");
            for(int sp = 1; sp <= n - 2; sp++){
                System.out.print(" ");
            }     
            System.out.print("*");
            System.out.println();
        }
        for(int row = 1; row <= n; row++){
            System.out.print("*");
        }

    }
}
HalfDiamond
