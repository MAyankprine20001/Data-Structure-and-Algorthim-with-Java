/*
 Problem Description

Given an english sentence, take it in the input and print it in the output.
Input Format

Single line containing an english sentence.
Output Format

Print in a single line the sentence in the input.
Example Input

Input 1:

Harry loves Hagrid !
Input 2:

I am a Scaler
Example Output

Output 1:

Harry loves Hagrid !
Output 2:

I am a Scaler
 */


import java.lang.*;
import java.util.*;

public class PrintSentence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(str);
    }
}
