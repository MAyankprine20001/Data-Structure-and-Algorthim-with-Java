/*
Q: Check Even odd

Problem Description
Write a program to input an integer from user and print 1 if it is odd otherwise print 0.

Problem Constraints
1 <= N <= 1000000



Input Format
One line containing an integer N.



Output Format
Print either 1 or 0 as per the question.



Example Input
Input 1:

5
Input 2:

1000


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

Clearly, 5 is odd.
Explanation 2:

Clearly, 1000 is even.


*/

import java.lang.*;
import java.util.*;

public class CheckEvenOdd{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if(number % 2 ==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }

    }
}