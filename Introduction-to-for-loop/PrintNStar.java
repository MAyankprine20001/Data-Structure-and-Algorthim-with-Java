/*
*Q4. Print N stars

!Problem Description
Given an integer N, print N stars in a single line.

For example if N = 5 then pattern will be like:

*****


? Problem Constraints
2 <= N <= 100



Input Format
Single line input contains a single integer N.



Output Format
Output N stars in a single line.



Example Input
Input 1:

 2
Input 2:

 3


Example Output
Output 1:

**
Output 2:

***

*/


import java.util.*;
import java.lang.*;

public class PrintNStar{
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for(int i = 1; i<=n; i++){
        System.out.print("*");
    }

}
}
