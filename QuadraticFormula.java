import java.util.Scanner;

public class QuadraticFormula {
    public static void main (String[]args) {
        Scanner scan = new Scanner (System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        double x1 = 0, x2 = 0;
        double discriminant = (b * b) - (4 * a * c);

        if (discriminant >= 0) {
            x1 = (-b + Math.sqrt(discriminant))/(2 * a);
            x2 = (-b - Math.sqrt(discriminant))/(2 * a);

            System.out.println("The roots for the polynomial equation with coefficients a = " + a + ", b = " + b + " and c = " + c + " are " + x1 + " and " + x2);
        }
        else {
            System.out.println("Sorry your discriminant is negative.  Cannot calculate imaginary roots.");
        }
        }


    }
