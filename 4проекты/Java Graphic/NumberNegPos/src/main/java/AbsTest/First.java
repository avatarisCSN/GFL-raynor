package AbsTest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Введите запланированный бюджет:");
            int budgZ = scan.nextInt();

            System.out.println("Введите фактический бюджет:");
            int budgF = scan.nextInt();

            System.out.println("Введите допустимую разницу:");
            int diffNorm = scan.nextInt();

            // Вычисляем абсолютное значение разницы
            int diffFact = Math.abs(budgZ - budgF);

            // Выводим результаты отклонения
            if (diffFact < diffNorm) {
                System.out.println("Отклонение в пределах допустимого.");
            } else {
                System.out.println("Отклонение больше допустимого.");
            }
            System.out.println("Отклонение: " + diffFact);

            // Вычисляем квадратный корень из допустимой разницы
            double sqrtDiffNorm = Math.sqrt(diffNorm);
            System.out.printf("Квадратный корень из допустимой разницы: %.2f\n", sqrtDiffNorm);

            // Округляем фактический бюджет
            long roundedBudgF = Math.round(budgF);
            System.out.println("Округленный фактический бюджет: " + roundedBudgF);

            // Находим максимум и минимум
            int maxBudget = Math.max(budgZ, budgF);
            int minBudget = Math.min(budgZ, budgF);
            System.out.println("Максимальный бюджет: " + maxBudget);
            System.out.println("Минимальный бюджет: " + minBudget);

            // Рекомендации на основе вычислений
            if (budgF > budgZ && diffFact > diffNorm) {
                System.out.println("Рекомендация: Фактический бюджет превышает запланированный на " + diffFact + " единиц. Рекомендуется уменьшить расходы.");
            } else if (sqrtDiffNorm > 10) {
                System.out.println("Предупреждение: Квадратный корень из допустимой разницы больше 10, что говорит о большом отклонении.");
            } else if (roundedBudgF == budgZ) {
                System.out.println("Рекомендация: Бюджет близок к идеальному.");
            } else {
                System.out.println("Рекомендация: Бюджет в порядке, но следите за отклонениями.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: необходимо ввести число.");
        } finally {
            scan.close();
        }
    }
}