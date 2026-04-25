
import java.util.*;

class Question {
    String question;
    String[] options;
    char correctAnswer;

    Question(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class OnlineTestSystem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Simple login
        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (!user.equals("admin") || !pass.equals("1234")) {
            System.out.println("Invalid login!");
            return;
        }

        System.out.println("\nLogin Successful! Start Test...\n");

        // Questions
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "Which language is used for Android?",
                new String[]{"A. Python", "B. Java", "C. C++", "D. Swift"},
                'B'));

        questions.add(new Question(
                "Which data structure uses FIFO?",
                new String[]{"A. Stack", "B. Queue", "C. Tree", "D. Graph"},
                'B'));

        questions.add(new Question(
                "Which keyword is used for inheritance?",
                new String[]{"A. this", "B. super", "C. extends", "D. final"},
                'C'));

        int score = 0;

        // Timer setup (e.g., 30 seconds total)
        long startTime = System.currentTimeMillis();
        long timeLimit = 30 * 1000; // 30 sec

        for (int i = 0; i < questions.size(); i++) {

            // Check time
            if (System.currentTimeMillis() - startTime > timeLimit) {
                System.out.println("\nTime's up! Auto-submitting...");
                break;
            }

            Question q = questions.get(i);

            System.out.println((i + 1) + ". " + q.question);
            for (String opt : q.options) {
                System.out.println(opt);
            }

            System.out.print("Answer (A/B/C/D): ");
            char ans = sc.next().toUpperCase().charAt(0);

            if (ans == q.correctAnswer) {
                score++;
            }
        }

        // Result
        System.out.println("\nTest Completed!");
        System.out.println("Score: " + score + "/" + questions.size());

        // Result analysis
        double percentage = (score * 100.0) / questions.size();

        if (percentage >= 75) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}