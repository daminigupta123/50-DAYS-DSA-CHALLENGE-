import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Questions
        String[] questions = {
            "1. Which language is used for Android development?",
            "2. Which data structure uses FIFO?",
            "3. Which keyword is used to inherit a class in Java?"
        };

        // Options
        String[][] options = {
            {"A. Python", "B. Java", "C. C++", "D. HTML"},
            {"A. Stack", "B. Queue", "C. Tree", "D. Graph"},
            {"A. this", "B. super", "C. extends", "D. implements"}
        };

        // Correct answers
        char[] answers = {'B', 'B', 'C'};

        int score = 0;

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is: " + answers[i] + "\n");
            }
        }

        // Final Score
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}