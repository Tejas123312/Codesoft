import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quiz {
    private static final int TIME_LIMIT = 10; // Time limit in seconds for each question
    private static int score = 0;
    private static int currentQuestionIndex = 0;
    private static boolean answered = false;

    private static String[] questions = {
        "What is the capital of France?",
        "What is 2 + 2?",
        "What is the largest planet in our solar system?"
    };

    private static String[][] options = {
        {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
        {"1. 3", "2. 4", "3. 5", "4. 6"},
        {"1. Earth", "2. Mars", "3. Jupiter", "4. Saturn"}
    };

    private static int[] correctAnswers = {3, 2, 3};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (currentQuestionIndex = 0; currentQuestionIndex < questions.length; currentQuestionIndex++) {
            answered = false;
            System.out.println("Question " + (currentQuestionIndex + 1) + ": " + questions[currentQuestionIndex]);
            for (String option : options[currentQuestionIndex]) {
                System.out.println(option);
            }

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if (!answered) {
                        System.out.println("Time's up!");
                        nextQuestion();
                    }
                }
            }, TIME_LIMIT * 1000);

            int userAnswer = scanner.nextInt();
            answered = true;
            timer.cancel();

            if (userAnswer == correctAnswers[currentQuestionIndex]) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("Quiz over! Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }

    private static void nextQuestion() {
        if (currentQuestionIndex < questions.length - 1) {
            currentQuestionIndex++;
        } else {
            System.out.println("Quiz over! Your final score is: " + score + "/" + questions.length);
            System.exit(0);
        }
    }
}