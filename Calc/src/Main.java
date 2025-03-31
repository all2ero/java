import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter num1: ");
        num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        num2 = sc.nextInt();
        System.out.print("Enter num3: ");
        num3 = sc.nextInt();

        System.out.print("num1-num2-num3: ");
        System.out.println(num1-num2-num3);

    }

}
