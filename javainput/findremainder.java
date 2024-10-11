package javainput;
import java.util.Scanner;
public class findremainder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter dividend ");
        int dividend = sc.nextInt();
        System.out.print(" Enter divisor ");
        int divisor =sc.nextInt();
        int quotient=(dividend/divisor);
        int remainder=dividend-(divisor*quotient);
        System.out.println("The remainder when "+dividend+"  is divided by  "+divisor+" is " +remainder);

    }
    
}
// divisor*quotient+remainder=dividend