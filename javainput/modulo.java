package javainput;
import java.util.Scanner;
public class modulo{
        public static void main(String[] args){ 
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print(" Enter dividend ");
                int dividend = sc.nextInt();
                System.out.print(" Enter divisor ");
                int divisor =sc.nextInt();
                int remainder =dividend % divisor;
                System.out.println("The remainder when "+dividend+"  is divided by  "+divisor+" is " +remainder);
            }
        }

    }
    

