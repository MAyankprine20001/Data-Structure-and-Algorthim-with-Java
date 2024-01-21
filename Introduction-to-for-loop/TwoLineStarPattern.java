/*
*Q7. Two Line Star Pattern

Problem Description
Print a pattern consisting of N rows, where each row contains an asterisk (*) at the beginning and end of the line, with N-2 spaces in between.

The Pattern should look like:

*<N-2 Spaces>*

Print the above pattern for a total of N Rows.

Refer Example ouput, for better clarification.


Problem Constraints
2 <= N <= 100



Input Format
First and only line of input contains a single integer N.



Output Format
Output the pattern corresponding to the given N.



Example Input
Input 1:

 2
Input 2:

 4


Example Output
Output 1:

**
**
Output 2:

*  *
*  *
*  *
*  *


Example Explanation
Explanation 1:
 Here N = 2,  So each row should have N - 2 spaces which is 0.
 Thus the N rows(i.e, 2 rows) should be in the form (asterisk)(0 spaces)(asterisk)
Explanation 2:
 Here N = 4,  So each row should have N - 2 spaces which is 2.
 Thus the N rows(i.e, 4 rows) should be in the form (asterisk)(2 spaces)(asterisk)
*/

import java.util.*;
import java.lang.*;

public class TwoLineStarPattern{
    public static void main(String[] args){
        Scanner  scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 1; i <= n; i++){

            System.out.print("*");
            for(int j = 1; j <= n - 2; j++){
                System.out.print(" ");
            } 
            System.out.print("*");
            System.out.println();
        }

    }
}