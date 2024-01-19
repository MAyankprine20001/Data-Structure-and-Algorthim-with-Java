/*
*Q8. First vs Last

! Problem Description
Write a program that asks the user to input a number T, indicating the number of test cases.
Then, for each test case, ask for input a number N and print the first and last digits of N.


todo :Problem Constraints
1 <= T <= 1000

0 <= N <= 100000000


?Input Format
First line is T which means number of test cases.

Each next T lines contain an integer N.



Output Format
T lines each containing two space separated integers representing first and last digits of the input integer.



Example Input
Input 1:

2
5
1001
Input 2:

2
10023
1589


Example Output
Output 1:

5 5
1 1
Output 2:

1 3
1 9


*/

import java.lang.*;
import java.util.*;

public class PrintFirstLast{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();

        int i = 0;
        while (i < T) {
            int N = scn.nextInt();
            int firstDigit = N;
            int lastDigit = N % 10;

            while (firstDigit >= 10) {
                firstDigit = firstDigit / 10;
            }

            System.out.println(firstDigit + " " + lastDigit);
            i++;
        }

    }
}