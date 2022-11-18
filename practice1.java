//taha burak sahin
//Write a program which reads three numbers, a, b and c, and then finds and prints the middle (by value) of them.
package task2;
import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        int A,B,C;//variable declaration for three numbers
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        A=scan.nextInt();//taking input from user for A
        B=scan.nextInt();//taking input from user for B
        C=scan.nextInt();//taking input from user for C
        if(B>A && A>C || C>A && A>B){
            System.out.print(A+"is a middle number");
        }
        if(A>B && B>C || C>B && B>A){
            System.out.print(B+"is a middle number");
        }
        if(A>C && C>B || B>C && C>A){
            System.out.print(C+"is a middle number");
        }
    }
}

