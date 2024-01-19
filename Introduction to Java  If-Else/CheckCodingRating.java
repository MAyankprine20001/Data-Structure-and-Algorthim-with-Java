/*
Q :Coding rating 
Problem Description
Write a program to input from user an integer(n) representing the rating of a person on a platform.

You have to print the category of that person.

If the rating is greater than or equal to 2100 then that person is "grand master".
If the rating is greater than or equal to 1900 then that person is "candidate master".
If the rating is greater than or equal to 1600 then that person is "expert".
If the rating is greater than or equal to 1400 then that person is "pupil".
If the rating is smaller than 1400 then that person is "newbie".
NOTE: Print all the chars of the category of the person in lowercase if rating is odd otherwise print in UPPERCASE


Problem Constraints
1000 <= n <= 2500



Input Format
One line containing an integern.



Output Format
A string representing the category of the person.



Example Input
Input 1:

1659
Input 2:

2100


Example Output
Output 1:

expert
Output 2:

GRAND MASTER


Example Explanation
Explanation 1:

Clearly, 1659 is odd and is in the range of expert.
Explanation 2:

Clearly, 2100 is even and is in the range of grand master.


*/

import java.util.*;
import java.lang.*;

public class CheckCodingRating{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int codingRating = scn.nextInt();

        if(codingRating >= 2100){
            if(codingRating % 2 == 0){
                System.out.println("grand master".toUpperCase());
            }else{
                System.out.println("grand master");
            }
        }else if(codingRating >= 1900){
            if(codingRating % 2 == 0){
                System.out.println("candidate master".toUpperCase());
            }else{
                System.out.println("candidate master");
            }
        }else if(codingRating >= 1600){
            if(codingRating % 2 == 0){
                System.out.println("expert".toUpperCase());
            }else{
                System.out.println("expert");
            }
        }else if(codingRating >= 1400){
            if(codingRating % 2 == 0){
                System.out.println("pupil".toUpperCase());
            }else{
                System.out.println("pupil");
            }
        }else{
           if(codingRating % 2 == 0){
                System.out.println("newbie".toUpperCase());
            }else{
                System.out.println("newbie");
            } 
        }
    }
}