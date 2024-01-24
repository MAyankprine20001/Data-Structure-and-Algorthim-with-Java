/*
Q3. Even Odd Elements

Problem Description
You are given T(number of test cases) integer arrays. For each array A, you have to find the value of absolute difference between the counts of even and odd elements in the array.



Problem Constraints
1 <= T <= 10

1 <= |A| <= 105

1 <= A[i] <= 109



Input Format
First line contains a single integer T.

Each of the next T lines begin with an integer denoting the length of the array A (|A|), followed by |A| integers which indicate the elements in the array.



Output Format
For each test case, print an integer in a separate line.



Example Input
Input 1:

 1 
 4 1 2 3 4 
Input 2:

 2
 4 2 3 5 1
 1 4


Example Output
Output 1:

 0 
Output 2:

 2
 1


Example Explanation
Explanation 1:

 For 1st test case: 
 The array is [1, 2, 3, 4].
 Number of even elements = 2 
 Number of odd elements = 2
 |Number of even elements - Number of odd elements| = |2 - 2| = 0 
Explanation 2:

 For 1st test case:
 The array is [2, 3, 5, 1].
 Number of even elements = 1 
 Number of odd elements = 3
 |Number of even elements - Number of odd elements| = |1 - 3| = |-2| = 2.

 For 2nd test case:
 The array is [4]
 Number of even elements = 1 
 Number of odd elements = 0
 |Number of even elements - Number of odd elements| = |1 - 0| = |1| = 1  

*/

import java.lang.*;
import java.util.*;

public class EvenOddElement{
    public static int calculateEven(int []arr){
       int count = 0;
       for(int i = 0; i <= arr.length - 1; i++){
        if(arr[i] % 2 == 0){
            count++;
        }
       }
       return count;
    }

    public static int calculateOdd(int []arr){
       int count = 0;
       for(int i = 0; i <= arr.length - 1; i++){
        if(arr[i] % 2 != 0){
            count++;
        }
       }
       return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0){
        int n = scn.nextInt();
        int []array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = scn.nextInt();
        }

        int countEven = calculateEven(array);
        int countOdd = calculateOdd(array);
        int result = Math.abs(countEven - countOdd);
        System.out.println(result);
    }
}
}