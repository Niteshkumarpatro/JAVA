package javainput;
import java.util.Scanner;

public class sum2numbers {
public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print(" Enter first number ");
        int first= sc.nextInt();
        System.out.print(" Enter second number ");
        int second= sc.nextInt();
         int sum=first+second;
         System.out.println(" The sum of two numbers is " +sum);
    }

     
         
    }
}
