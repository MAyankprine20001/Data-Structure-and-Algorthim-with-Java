/*
 */

 import java.lang.*;
 import java.util.*;

 public class PrintInReverse{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); // todo: size of array
        int []array = new int[n];

        for(int i = 0; i < n; i++){
           array[i] = scn.nextInt();
        }

        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
 }

