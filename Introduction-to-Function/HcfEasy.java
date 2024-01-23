/*
Q6. HCF - Easy

Problem Description
Write a program to input two integers A & B from user and print their HCF.

Definition Of HCF: The HCF(Highest Common Factor) or the GCD(greatest common divisor) of two positive integers happens to be the largest positive integer that divides the numbers without leaving a remainder.



Problem Constraints
1 <= A,B <= 100000



Input Format
First line will contain 2 integers A and B



Output Format
An integer which is the HCF of A & B.



Example Input
Input 1:

15 105 
Input 2:

24 36 


Example Output
Output 1:

15
Output 2:

12

*/


import java.util.*;
import java.lang.*;

public class HcfEasy{

    public static int calculateHcf(int a , int b){
        int min = a < b ? a : b;
        int hcf = 0;
        for(int i = 1; i <= min; i++){
            if(a % i == 0 && b % i  == 0){
                hcf = i;

            }
        }
        return hcf;
    }
    public static void main(String[] args){
        Scanner scn =  new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int hcf = calculateHcf(a , b);
        System.out.println(hcf);

    }
}
