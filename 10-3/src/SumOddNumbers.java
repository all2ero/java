import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int count = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= count; i += 2) {
            sum += i;
        }

        System.out.println("1부터 " + count + "까지 홀수의 합: " + sum);

        scanner.close();
    }
}
