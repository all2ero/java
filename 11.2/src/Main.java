import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        int score;

        while (true) {
            System.out.print("점수를 입력하세요 (종료하려면 음수입력): ");
            score = scanner.nextInt();

            if (score <0) {
                break;
            }

            totalScore += score;
        }

        System.out.println("총점: " + totalScore);
        scanner.close();
    }
}