/*
Q6. Multiples of 4

Problem Description
Given an integer input N, print all multiples of 4 less than or equal to N.

Problem Constraints
1 <= N <= 10000


Input Format
Single line containing an integer N.


Output Format
Space separated integers representing multiples of 4 less than or equal to N.


Example Input
22


Example Output
4 8 12 16 20


Example Explanation
1 * 4 = 4
2 * 4 = 8
3 * 4 = 12
4 * 4 = 16
5 * 4 = 20

All are multiples of 4 less than 22



*/

import java.lang.*;
import java.util.*;

public class MultipleOfFour{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int i = 1;

        while(i <= number){
            if(i % 4 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}