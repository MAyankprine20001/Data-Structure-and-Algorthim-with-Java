/*

*/


import java.util.*;
import java.lang.*;

public class CheckArraySorted{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int flag = 0;
        
        for(int i = 0; i<= arr.length - 1; i++){
            if(arr[i + 1] < arr[i]){
               flag = 0;
            }
        }
        if(flag == 0) {
            System.out.print(0);
        }else{    
        System.out.println(1);
    }
}
}