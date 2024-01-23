/*
Q3. Favourite Chocolate
Alex is fond of chocolates. He has initially A rupees and a single chocolate costs B rupees.

But too many chocolates are not good for health, so Alex will not buy more than C chocolates.

Find the number of chocolates Alex will buy with the money he has.


Input Format

The First argument given is an integer A.
The Second argument given is an integer B.
The Third argument given is an integer C.
Output Format

Return the number of chocolates Alex will buy.
Constraints

1 <= A, B, C <= 10^6
For Example

Input 1:
    A = 10
    B = 3
    C = 4
Output 1:
    3
    Explanation 1:
        Since Alex has only 10 ruppees, he can buy 3 chocolates.

Input 2:
    A = 10
    B = 2
    C = 2
Output 2:
    2
    Explanation 2:
        Alex can buy 5 chocolates with the money he has, but he will buy only 2 as more than 2 chocolate can be harmful to him.
Expected Output
Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
Arg 1: A single Integer, For e.g 9
Enter Input Here
Arg 2: A single Integer, For e.g 9
Enter Input Here
Arg 3: A single Integer, For e.g 9
Enter Input Here

 */

 import java.util.*;
 import java.lang.*;

 public class FavouriteChocolate{
    public static int favouriteChocolate(int A , int B , int C){
       int buyChocolate = A / B;
       return buyChocolate > C ? C : buyChocolate;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();

        int buyChocolate = favouriteChocolate(A , B , C);
        System.out.println(buyChocolate);

    }

 }