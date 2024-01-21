/*
Q4. Print the Primes!

Problem Description

You are given an integer N you need to print all the Prime Numbers between 1 and N.

Prime numbers are numbers that have only 2 factors: 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.


Problem Constraints

1 <= N <= 300



Input Format

First and only line of input contains a single integer N.



Output Format

Print all the prime numbers between between 1 and N each in a new line.



Example Input

Input 1:

 5
Input 2:

 10


Example Output

Output 1:

 2
 3
 5
Output 2:

 2
 3
 5
 7

*/

import java.lang.*;
import java.util.*;

public class PrintAllPrime{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();

        for(int i = 2; i <= number; i++){
            int copyNumber = i;
            boolean flag = false;
            for(int j = 2; j < i; j++){
                if(copyNumber % j == 0) {
                    flag = true;
                    break;
                }    
            }
            if(flag == false){
                System.out.println(i);
            }
        }
    }
}