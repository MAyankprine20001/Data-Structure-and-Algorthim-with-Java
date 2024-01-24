/*
Q:  Insert That
Problem Description

Write a program to print the input array A of size N in reverse order where you have to take integer N and further N elements as input from user.


Problem Constraints

1 <= N <= 1000

1 <= A <= 1000
Input Format

A single line representing N followed by N integers of the array A

Output Format

A single line containing N space separated integers representing elements of the input array in reverse order.

Example Input

Input 1:

5 1 2 3 4 5
Input 2:

4 10 50 40 80

Example Output

Output 1:

5 4 3 2 1
Output 2:

80 40 50 10


*/

import java.lang.*;
import java.util.*;

public class InsertThatElement{
    public static int[] addItemInArray(int []array , int position , int addItem){
        int []newArray = new int[array.length + 1];
        // copy array before position
        for(int i = 0; i < position; i++){
           newArray[i] = array[i];
        }
        //add item in position
        newArray[position] = addItem;

        //copy array after position
        for(int i = position; i <= array.length - 1; i++){
            newArray[i + 1] = array[i];
        }
        return newArray;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // todo: size of array
        int position = scn.nextInt();
        int addItem = scn.nextInt();
        int []array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = scn.nextInt();
        }

        int resultArray[] = addItemInArray(array , position , addItem);
        
        for(int i = 0; i <= resultArray.length - 1; i++ ){
            System.out.print(resultArray[i] + " ");
        }

        
    }
}
