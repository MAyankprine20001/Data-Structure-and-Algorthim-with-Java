/**
* Q3. Odd Game

! Problem Description
Write a program to print all odd numbers from 1 to N where you have to take N as input from user. Here N is inclusive.

Note:
Each number should be followed by a space, including the last number.


Problem Constraints
1 <= N <= 2000000



Input Format
A single line representing N



Output Format
All odd numbers from 1 to N, each number followed by a space, including the last number.



Example Input
Input 1:

5
Input 2:

10


Example Output
Output 1:

1 3 5 
Output 2:

1 3 5 7 9 
 */

 import java.lang.*;
 import java.util.*;

 public class OddGame{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int i = 1;
        while(number > 0){
          if(i % 2 != 0){
            System.out.print(i + " ");
          }
          i++;
          number--;
        }

    }
 }