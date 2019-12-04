import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input first number:");
        float num1 = in.nextFloat();
        System.out.printf("Your input %f as a first number. \n", num1);
        System.out.println("Please input second number:");
        float num2 = in.nextFloat();
        System.out.printf("Your input %f as a second number. \n", num2);
        double sum = num1+num2;
        System.out.printf("Your \nSum is %f \n", sum);
        double dif = num1-num2;
        System.out.printf("Diference is %f \n", dif);
        double mul = num1*num2;
        System.out.printf("Multiplication is %f \n", mul);
        if (num2 != 0) {
            float div = num1 / num2;
            System.out.printf("Division is %f \n", div);
        } else {
            System.out.print("Division impossible");
        }
    }
}
