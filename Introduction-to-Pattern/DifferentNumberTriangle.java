/* */

import java.util.*;
import java.lang.*;

public class DifferentNumberTriangle{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int row = 1; row <= n; row++){
            // zero
            for(int sp = 1; sp <= n - row; sp++){
                System.out.print(0);
            }
            //print number 
            int k;
            for(int num = 1; num <= 2 * row - 1; num++){
                k = n - row + 1;
                k = k * num;
                System.out.print(k);              
            }
            
            for(int sp = 1; sp <= n - row; sp++){
                System.out.print(0);
            }
            System.out.println();
        }

    }
}