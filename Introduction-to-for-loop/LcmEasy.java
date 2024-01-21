/*
*Q1. LCM - Easy

! Problem Description
Implement a program that takes two positive integers A and B in the input and prints their LCM.

Definition of LCM : The Least Common Multiple or LCM of two numbers say A and B, is denoted as LCM (A,B). And the LCM is the smallest or least positive integer that is divisible by both A and B.



? Problem Constraints
1 <= A,B <= 200


Input Format
Two space separated integers A and B in the input.


Output Format
Output a single integer that is the LCM of A and B.


Example Input
Input 1:
5 10
Input 2:

2 3


Example Output
Output 1:
10
Output 2:

6


Example Explanation
Explanation 1:
LCM(5,10)=10
Explanation 2:

LCM(2,3)=6


*/

import java.lang.*;
import java.util.*;

public class LcmEasy{
   public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int A = scn.nextInt();
    int B = scn.nextInt();
    int lcm = 1;
    int max = A > B ? A : B;

    for (int i = max; ; i++) {
        if (i % A == 0 && i % B == 0) {
            lcm = i;
            break;
        }
     }
     System.out.println(lcm);
}
    

   }
