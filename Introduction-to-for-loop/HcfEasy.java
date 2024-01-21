/*

* Q2. HCF - Easy

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
import java.lang.*;
import java.util.*;

public class HcfEasy{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int numberOne = scn.nextInt();
        int numberTwo = scn.nextInt();
        int min = numberOne < numberTwo ? numberOne : numberTwo;
        int hcf = 1;
        for(int i = 1; i <= min; i++){
          if(numberOne % i == 0 && numberTwo % i == 0){
               hcf  = i;
          } 
        }
        System.out.println(hcf);

    }
}

