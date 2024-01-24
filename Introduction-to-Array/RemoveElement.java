/*
Q: Remove that

Problem Description
Write a program to input N numbers array, A from the user and an integer X and print the array by deleting element at specified position X.

Note: The first element is located at position 1, the second element is located at position 2, and so on.


Problem Constraints
2 <= N <= 100
1 <= A[i] <= 1000
1 <= X <= N


Input Format
First line is N which means number of elements.
Second line contains N space separated integers.
Third line is X position which has to be deleted.


Output Format
N-1 space separated integers of the input array after deleting the element at required position.


Example Input
Input 1:
5
2 3 1 4 2
3
Input 2:
2
4 5
2


Example Output
Output 1:
2 3 4 2
Output 2:
4


Example Explanation
Explanation 1:
Clearly after removing the element at position 3 (2 3 1 4 2), the remaining array is 2 3 4 2.
Explanation 2:
After removing the element at position 2 (4 5), the remaining array is 4.
*/

import java.util.*;
import java.lang.*;

public class RemoveElement{

    public static int[] RemoveElement(int[] arr , int position){
        int []newArr = new int[arr.length - 1];

        //before position
        for(int i = 0; i < position; i++){
            newArr[i] = arr[i];
        }

        //after position  
        for(int i = position; i <= newArr.length - 1; i++){
            newArr[i] = arr[i + 1];
        }
         
        return newArr;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int position = scn.nextInt();
        int []newArray =  RemoveElement(arr , position);
        for(int i = 0; i <= newArray.length - 1; i++){
            System.out.print(newArray[i] + " ");
        }
    }
}


