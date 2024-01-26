/*
Q8. Consecutive Duplicate

Problem Description
Write a function to check if the given array A has consecutive duplicate elements or not.
Return True if there are consecutive duplicate elements in the list else return False.

Here by consecutive duplicates, we mean duplicates that are present at consecutive indices in the array


Problem Constraints
1 <= N <= 105
1 <= A[i] <= 109


Input Format
An integer array A as the function argument.


Output Format
Return True or False


Example Input
Input 1:
1
4
1 2 3 3
Input 2:
1
2
1 2


Example Output
Output 1:
True
Output 2:
False


Example Explanation
Explanation 1:
As there are 3 3 in the list i.e. at indices 2 and 3, there True is returned.
Explanation 2:
There are no consecutive duplicate elements in the list.

*/


import java.lang.*;
import java.util.*;

public class ConsecutiveDuplicate{
    
    public static boolean calculateDuplicate(int []arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i + 1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();     
        }
        boolean flag = calculateDuplicate(arr);
        System.out.println(flag);
    }
}