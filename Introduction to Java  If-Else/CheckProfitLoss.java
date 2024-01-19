/*
Q : Profit or loss
Problem Description

You are given the Cost Price C and Selling Price S of a Product. You have to tell whether there is a Profit or Loss. Also, calculate total profit or loss.

NOTE: It is guaranteed that Cost Price and Selling Price are not equal.

NOTE: You have to take input of the Cost Price(C) and Selling Price(S) from the user.



Problem Constraints

1 <= C, S <= 109

C ≠ S



Input Format

First line of the input contains a single integer C.

Second line of the input contains a single integer S.



Output Format

Print two integers in separate lines.

First integer denotes whether there is a profit or loss. If there is a profit, print 1, else print -1.

Second integer is a non-negative integer denoting the absolute value of total profit or loss.



Example Input

Input 1:

 2
 4
Input 2:

 4
 1


Example Output

Output 1:

 1
 2
Output 2:

 -1
 3


Example Explanation

Explanation 1:

 Cost Price = 2
 Selling Price = 4
 As Cost Price < Selling Price, there is a profit.
 Total Profit = Selling Price - Cost Price = 4 - 2 = 2
Explanation 2:

 Cost Price = 4
 Selling Price = 1
 As Cost Price > Selling Price, there is a loss.
 Total Loss = Cost Price - Selling Price = 4 - 1 = 3 

*/

import java.util.*;
import java.lang.*;

public class CheckProfitLoss{
    public static void main(String [] args){
    Scanner scn = new Scanner(System.in);
    int costPrice = scn.nextInt();
    int sellingPrice = scn.nextInt();
    if(sellingPrice > costPrice){
        System.out.println(1);
        System.out.println(sellingPrice - costPrice);
    }else{
        System.out.println(-1);
        System.out.println(costPrice - sellingPrice);
    }
}
}
