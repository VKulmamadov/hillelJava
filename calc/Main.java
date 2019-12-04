import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please input first number:");
        int num1 = in.nextInt();
        System.out.printf("Your input %d as a first number. \n", num1);
        System.out.println("Please input second number:");
        int num2 = in.nextInt();
        System.out.printf("Your input %d as a second number. \n", num2);
        long sum = num1+num2;
        System.out.printf("Your \nSum is %d \n", sum);
        long dif = num1-num2;
        System.out.printf("Diference is %d \n", dif);
        long mul = num1*num2;
        System.out.printf("Multiplication is %d \n", mul);
        if (num2 != 0) {
            long div = num1 / num2;
            System.out.printf("Division is %d \n", div);
        } else {
            System.out.print("Division impossible");
        }
    }
}
