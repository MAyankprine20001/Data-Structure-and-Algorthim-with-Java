/*
Q5. Power function

Problem Description

You are given two integers A and B.

You have to find the value of AB.

NOTE: The value of answer is always less than or equal to 109.


Problem Constraints

1 <= A, B <= 1000



Input Format

First parameter is an integer A.

Second parameter is an integer B.



Output Format

Return an integer.



Example Input

Input 1:

 A = 2
 B = 3 
Input 2:

 A = 1
 B = 10 


Example Output

Output 1:

 8 
Output 2:

 1 


Example Explanation

Explanation 1:

 For A = 2 and B = 3, the value of 23 = 2 * 2 * 2 = 8. 
Explanation 2:

 For A = 1 and B = 10, the value of 110 = 1.


Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases


*/


import java.util.*;
import java.lang.*;

public class PowerFunction{
    
    public static int  calculatePowerFunction(int a , int b){
      int power = 1;
      while(b > 0){
        power = power * a;
        b--;
      }
      System.out.println("power is "+ power);
      return power;
    }
    
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       int A = scn.nextInt();
       int B = scn.nextInt();

       int power = calculatePowerFunction(A , B);
       System.out.println(power);
    }
}