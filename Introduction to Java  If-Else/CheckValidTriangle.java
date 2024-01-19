/*
Problem Description

You are given 3 integer angles(in degrees) A, B and C of a triangle. You have to tell whether the triangle is valid or not.

A triangle is valid if sum of its angles equals to 180.

NOTE: You have to take the input of 3 sides of triangle from the user.


Problem Constraints

1 <= A, B, C <= 180



Input Format

First line of the input contains an integer A.

Second line of the input contains an integer B.

Third line of the input contains an integer C.



Output Format

Print 1 if the triangle having given sides is valid, else print 0.



Example Input

Input 1:

 60
 60
 60
Input 2:

 30
 40
 50


Example Output

Output 1:

 1 
Output 2:

 0 


Example Explanation

Explanation 1:

 Sum of angles = A + B + C = 60 + 60 + 60 = 180
 Hence, the given triangle is valid.
Explanation 2:

 Sum of angles = A + B + C = 30 + 40 + 50 = 120
 As sum of angles is not equal to 180, the given triangle is not valid.

*/

import java.lang.*;
import java.util.*;

public class CheckValidTriangle{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int angle1 = scn.nextInt();
        int angle2 = scn.nextInt();
        int angle3 = scn.nextInt();
        if(angle1 + angle2 + angle3 == 180){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
