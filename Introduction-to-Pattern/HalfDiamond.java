/*
Q4. Half Diamond
Problem Description

Take an integer N as input, print the corresponding Half Diamond pattern with 2*N - 1 rows.

For example if N = 5 then pattern will be like:

* 
**
***
****
*****
****
***
**
*
NOTE: There should be no spaces after any * .


Problem Constraints

2 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the Half Diamond pattern corresponding to the given N.



Example Input

Input 1:

 2
Input 2:

 3


Example Output

Output 1:

 * 
 **
 *
Output 2:

 *
 **
 ***
 **
 *


Example Explanation

 Print the pattern as described.
*/


import java.lang.*;
import java.util.*;

public class HalfDiamond{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        // upper half
        for(int row = 1; row <= n; row++){
            
            for(int st = 1; st <= row; st++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
       int remainingRow = n - 1;
        for(int row = 1; row <= remainingRow; row++){
            for(int st = 1; st <= remainingRow - row  + 1; st++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}