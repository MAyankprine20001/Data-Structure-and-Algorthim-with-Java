/*
Q4. Hollow inverted pyramid pattern

Problem Description
Take an integer N as input, print the corresponding pattern for N.

For example if N = 5 then pattern will be like:

*________* // 8 spaces

**______** // 6 spaces

***____*** // 4 spaces

****__**** // 2 spaces

********** // 0 spaces

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

*__* // 2 spaces

**** // 0 spaces
Output 2:

*____* // 4 spaces

**__** // 2 spaces

****** // 0 spaces

NOTE: Here '_' is used to represent spaces. You have to print spaces in your code.




Example Explanation
 Print the pattern as described.

*/


import java.lang.*;
import java.util.*;

public class  HollowInvertedPyramidPattern{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int row = 1; row <= n; row++){

            //star 
            for(int st = 1; st <= row; st++){
                System.out.print("*");
            }

            //space
            for(int sp = 1; sp <= (2 * n  - 2 * row); sp++){
                System.out.print(" ");
            }

            //star 
            for(int st = 1; st <= row; st++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
 
