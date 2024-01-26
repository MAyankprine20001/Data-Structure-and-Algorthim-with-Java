/*
 */

 import java.util.*;
 import java.lang.*;

 public class PrintMatrixColumnByColumn{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][]arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        // todo : print column wise

       for(int j = 0; j <= arr[0].length - 1; j++){
        for(int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
       }
         
    }
 }