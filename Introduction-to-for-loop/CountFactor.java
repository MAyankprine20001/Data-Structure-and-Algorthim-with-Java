/*
*Q1. Count factors

! Problem Description

Take an integer N as input and print the count of its factors.
The factor of a number is the number that divides it perfectly leaving no remainder.

Example: 1, 2, 3, and 6 are factors of 6

todo: Problem Constraints

1 <= N <= 300

Input Format

The first and only line of input contains a single integer N.

Output Format

Print the count of factors of N.

Example Input

Input 1:
 5
Input 2:
 10

Example Output

Output 1:
2
Output 2:
4

Example Explanation

Explanation 1:
 Factors of 5 are 1 and 5.
Explanation 2:
 Factors of 10 are 1, 2, 5 and 10.

*/

import java.util.*;
import java.lang.*;

public class CountFactor{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = 1;
        int countFactor = 0;

        while(i <= n){
            if(n % i == 0){
                countFactor = countFactor + 1;   
            }
            i++;
        }
        System.out.println(countFactor);
    }
}