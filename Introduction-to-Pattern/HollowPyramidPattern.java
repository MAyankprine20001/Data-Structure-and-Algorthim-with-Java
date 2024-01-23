/*
Q5. Hollow pyramid pattern
Problem Description
Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

********** // 0 spaces

****__**** // 2 spaces

***____*** // 4 spaces

**______** // 6 spaces

*________* // 8 spaces
NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.



Problem Constraints
2 <= N <= 100



Input Format
First and only line of input contains a single integer N.



Output Format
Output the Full Pyramid pattern corresponding to the given N.



Example Input
Input 1:

 2
Input 2:

 3


Example Output
Output 1:

**** // 0 spaces

*__* // 2 spaces
Output 2:

****** // 0 spaces

**__** // 2 spaces

*____* // 4 spaces

NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.




Example Explanation
 Print the pattern as described.

*/

import java.lang.*;
import java.util.*;

public class HollowPyramidPattern{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int row = 1; row <= n; row++){
            // star logic
            for(int st = 1; st <= (n - row + 1); st++ ){
                System.out.print("*");
            }
            
            //space logic 
            for(int sp = 1; sp <= (2 * row - 2); sp++){
                System.out.print(" ");
            }
            
             // star logic
            for(int st = 1; st <= (n - row + 1); st++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     
}