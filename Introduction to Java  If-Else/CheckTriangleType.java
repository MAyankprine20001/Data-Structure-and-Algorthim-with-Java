/*
Q : Which triangle ?
Problem Description

Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.

You have to print if the traingle is "equilateral", "scalene" or "isosceles".



Problem Constraints

1 <= A <= 100000

1 <= B <= 100000

1 <= C <= 100000



Input Format

One line containing three space separated integers A, B & C.



Output Format

One string either "equilateral", "scalene" or "isosceles".



Example Input

Input 1:

5 6 7
Input 2:

30 30 30


Example Output

Output 1:

scalene

Output 2:

equilateral


Example Explanation

Explanation 1:

Since all sides are different, hence it's a scalene triangle.
 
Explanation 2:

Since all sides are same, hence it's a equilateral triangle.

*/

import java.lang.*;
import java.util.*;

public class CheckTriangleType{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int side1 = scn.nextInt();
        int side2 = scn.nextInt();
        int side3 = scn.nextInt();

        if(side1 == side2 && side1 == side3 && side2 == side3){
              System.out.println("equilateral");
        }else if(side1 == side2 || side2 == side3 || side1 == side3){
            System.out.println("isosceles");
        }else{
            System.out.println("scalene");
        }
    }
}