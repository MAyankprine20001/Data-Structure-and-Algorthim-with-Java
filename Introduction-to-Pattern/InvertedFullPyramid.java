/*
Q5. Inverted Full Pyramid

Problem Description

Take an integer N as input, and print the corresponding Inverted Full Pyramid pattern for N.

For example if N = 5 then pattern will be like:

* * * * * 
 * * * * 
  * * * 
   * *    
    * 
NOTE: There should be exactly one extra space after each * for each row.



Problem Constraints

2 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the Inverted Full Pyramid pattern corresponding to the given N.



Example Input

Input 1:

 2
Input 2:

 3
Input 3:

 4


Example Output

Output 1:

* * 
 *  
Output 2:

* * * 
 * *  
  * 
Output 3:

* * * * 
 * * *  
  * *
   *
   


Example Explanation

 Print the pattern as described.

*/

import java.util.*;
import java.lang.*;

public class InvertedFullPyramid{
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
                System.out.print("* ");
            }
           
            System.out.println();
        }
    }
}

 