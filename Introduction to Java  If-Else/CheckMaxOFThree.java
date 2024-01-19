/*
Q: check maximum of three 

Problem Description
Write a program to input three numbers(A, B & C) from user and print the maximum element among A, B & C in each line.

Problem Constraints
1 <= A <= 1000000

1 <= B <= 1000000

1 <= C <= 1000000



Input Format
First line is a single integer A.
Second line is a single integer B.
Third line is a single integer C.



Output Format
One line containing an integer as per the question.



Example Input
Input 1:

5 
6 
7
Input 2:

1000 
10000 
100000


Example Output
Output 1:

7
Output 2:

100000


Example Explanation
Explanation 1:

Clearly, among 5, 6 and 7, 7 is maximum.
Explanation 2:

Clearly, among 1000, 10000 and 100000, 100000 is maximum.

*/

import java.lang.*;
import java.util.*;

public class CheckMaxOfThree{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        int number3 = scn.nextInt();
        if(number1 > number2 && number1 > number3){
            System.out.println(number1);
        }else if(number2 > number1 && number2 > number3){
            System.out.println(number2);
        }else if(number3 > number1 && number3 > number2){
            System.out.println(number3);
        }else{
            System.out.println("ALL equal");
        }
    }
}