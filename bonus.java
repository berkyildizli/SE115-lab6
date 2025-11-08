import java.util.Random;
import java.text.DecimalFormat;

public class bonus {
    public static void main(String[] args) {
        int students = 5;
        int quizzes = 4;
        int[][] scores = new int[students][quizzes];
        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                scores[i][j] = rand.nextInt(101); // 0-100 arası
            }
        }

        System.out.println("Puan Tablosu:");
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                System.out.printf("%4d", scores[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nÖğrenci Ortalamaları:");
        for (int i = 0; i < students; i++) {
            int sum = 0;
            for (int j = 0; j < quizzes; j++) {
                sum += scores[i][j];
            }
            double average = (double) sum / quizzes;
            System.out.println("Öğrenci " + i + " ortalaması: " + df.format(average));
        }

        System.out.println("\nSınav Ortalamaları:");
        for (int j = 0; j < quizzes; j++) {
            int sum = 0;
            for (int i = 0; i < students; i++) {
                sum += scores[i][j];
            }
            double average = (double) sum / students;
            System.out.println("Sınav " + j + " ortalaması: " + df.format(average));
        }

        int maxScore = scores[0][0];
        int maxStudent = 0;
        int maxQuiz = 0;

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < quizzes; j++) {
                if (scores[i][j] > maxScore ||
                        (scores[i][j] == maxScore && (i < maxStudent || (i == maxStudent && j < maxQuiz)))) {
                    maxScore = scores[i][j];
                    maxStudent = i;
                    maxQuiz = j;
                }
            }
        }

        System.out.println("\nEn yüksek puan: " + maxScore +
                " (Öğrenci " + maxStudent + ", Sınav " + maxQuiz +")");
}
}