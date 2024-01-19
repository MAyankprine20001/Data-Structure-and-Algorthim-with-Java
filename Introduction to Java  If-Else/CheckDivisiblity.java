/*
Problem Description

Take an integer A as input. You have to tell whether A is divible by both 5 and 11 or not.


Problem Constraints

1 <= A <= 109



Input Format

The input contains a single integer A.



Output Format

Print 1 if A is divisible by both 5 and 11, else print 0.



Example Input

Input 1:

 55 
Input 2:

 22 


Example Output

Output 1:

 1 
Output 2:

 0 


Example Explanation

Explanation 1:

 55 is divisible by both 5 (5 * 11 = 55) and 11 (11 * 5 = 55).
Explanation 2:

 22 is divisble by 11 (11 * 2 = 22),but it is not divisible by 5.


*/
import java.lang.*;
import java.util.*;

public class CheckDivisiblity{
       public static void main(String[] args){
         Scanner scn = new Scanner(System.in);
         int number = scn.nextInt();
         if(number % 5 == 0 && number % 11 == 0){
            System.out.print(1);
         }else{
            System.out.println(0);
         }

       }
}



