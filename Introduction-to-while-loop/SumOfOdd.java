/*
*Q1. Sum of Odds - Easy

Problem Description

Take an integer A as input. You have to print the sum of all odd numbers in the range [1, A].


Problem Constraints

1 <= A <= 1000



Input Format

First and only line contains a single positive integer A.



Output Format

Print the required sum in a single line.


Example Input

Input 1:

 1 
Input 2:

 4 



*/


import  java.lang.*;
import java.util.*;

public class SumOfOdd{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number  = scn.nextInt();
        int i = 1;
        int sumOfOdds = 0;

        while(i <= number){
           if(i % 2 != 0){
            sumOfOdds += i;
           }
           i++;
        }
        System.out.println(sumOfOdds);
    }
}