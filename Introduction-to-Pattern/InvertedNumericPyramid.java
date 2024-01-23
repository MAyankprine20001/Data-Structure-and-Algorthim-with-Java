/*
Q3. Inverted Numeric Pyramid

Problem Description

Take an integer N as input, print the corresponding Numeric Inverted Half Pyramid pattern for N.

For example if N = 4 then pattern will be like:

1 2 3 4
1 2 3
1 2
1

Problem Constraints

1 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the Numeric Inverted Half Pyramid pattern corresponding to the given N.

NOTE: There should be no extra spaces after last integer and before first integer in any . All integers in any row in the pattern are separated by a single space.



Example Input

Input 1:

 2
Input 2:

 3


Example Output

Output 1:

1 2
1
Output 2:

1 2 3
1 2
1


Example Explanation

 Example Input 1
 We have the input of integer as 2. So there will be 2 rows. 
 The first row will have 2 integers separated by a single space (1 2)
 The next row will have 2-1 = 1 integer (1)
 As we do not have any more integers left we stop printing the pattern.

 Example Input 2
 We have the input of integer as 3. So there will be 3 rows. 
 The first row will have 3 integers separated by a single space (1 2 3)
 The next row will have 3-1 = 2 integers separated by a single space (1 2)
 The next row will have 2-1 = 1 integer.(1)
 As we do not have any more integers left we stop printing the pattern.

*/

import java.util.*;
import java.lang.*;

public class InvertedNumericPyramid{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i <= n; i++){
            int num = 1;
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();

        }
    }
}


