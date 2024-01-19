/*

Q : Print Last Digit

Problem Description

Given an integer in the input print its last digit.

Input Format

Single line containing an integer.

Output Format

Print in a single line the last digit of input integer.

Problem Constraints

1 <= N <= 1000

Example Input

Input 1:-

3

Input 2:-

29

Example Output

Output 1:-

3

Output 2:-

*/

import java.lang.*;
import java.util.*;

public class PrintLastDigit{
   public static void main(String[] args){
     Scanner scn = new Scanner(System.in);
     int number = scn.nextInt();
     int lastDigit;
     lastDigit = number % 10;
     System.out.println(lastDigit);

   }

}