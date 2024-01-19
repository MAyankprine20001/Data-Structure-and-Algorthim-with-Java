/*
Q: percentage and grade

Problem Description
Write a program to calculate the percentage (according to marks of a student) and grade (according to the percentage of a student). Five numbers(A, B, C, D & E) represent the marks of a student in 5 subjects which are out of 100. Print the percentage and the grade of the student.

If percentage >= 90% : Grade A
If percentage >= 80% but <90 : Grade B
If percentage >= 70% but <80: Grade C
If percentage >= 60% but <70: Grade D
If percentage >= 40% but <60: Grade E
If percentage < 40%: Grade F


NOTE: You have to take the lowest integer of the percentage. E.g. 90.8% will be treated as 90%.


Input Format
There will be five lines of inputs as following:
The five lines contain the 5 subject marks of the student in numerical format.


Output Format
The first line indicates the percentage in integer format.
The next line displays the grade in string format.


Example Input
50
60
70
80
90


Example Output
70
C


*/

import java.lang.*;
import java.util.*;

public class CheckPercentageGrade{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        int e = scn.nextInt();
        int totalMarks = a + b + c + d + e;
        int percentage = (totalMarks * 100) / 500 ;
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) { // Corrected conditional operators
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F'; // Removed unnecessary condition for percentage < 40
        }
        System.out.println(percentage);
        System.out.println(grade);

    }
}