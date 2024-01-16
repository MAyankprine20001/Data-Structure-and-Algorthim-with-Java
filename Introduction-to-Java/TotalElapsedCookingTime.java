import java.lang.*;
import java.util.*;

public class TotalElapsedCookingTime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberOfLayer = scn.nextInt();
        int timeOfLasagna = scn.nextInt();
        System.out.println((numberOfLayer * 2) + timeOfLasagna);
    }
}
