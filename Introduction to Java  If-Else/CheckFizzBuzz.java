/*
Q: fizz Buzz

Problem Description

Write a program that takes in a number N as input and does the following:

if N is a multiple of 3, print Fizz
if N is a multiple of 5, print Buzz
if N is a multiple of both 3 and 5, print FizzBuzz
Problem Constraints:

1 <= N <= 1000

Input Format

There is only 1 single line in the input, which is the integer N.

Output Format

Print Fizz / Buzz / FizzBuzz depending on the value N.

Example Input

Input 1:-
9
Input 2:-
15


Example Output

Output 1:-
Fizz
Output 2:-
FizzBuzz


*/

import java.lang.*;
import java.util.*;

public class CheckFizzBuzz{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(number % 5 == 0){
            System.out.println("Buzz");
        }else if(number % 3 == 0){
            System.out.println("Fizz");
        }


    }
}