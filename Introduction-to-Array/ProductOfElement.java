/*
Q5. Product of elements

Problem Description:

Write a program that returns the product of all elements present in the array.

Constraints:

1 <= |A| <= 100
1 <= A <= 100
Note: It is guaranteed that the resultant product will be <= 1015
Input Format:

An integer array **A** as the function argument.
Output Format:

Product of elements in integer format
Sample Input:

A = [7, 9, 2, 51]
Sample Output:

6426
Sample explanation:

The product of all the elements is 7 * 9 * 2 * 51 = 6426 is returned.
*/

import java.util.*;
import java.lang.*;

public class ProductOfElement{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }

        //product of array
        int product = 1;

        for(int i = 0; i <= arr.length - 1; i++){
            product = product * arr[i];
        }

        System.out.println(product);
    }
}