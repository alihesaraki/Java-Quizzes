package Quizzes.FootballCoachQuiz;

public class FootballCoachQuiz {

    public static void main(String[] args) {
        // Sample input answers
        char[] answers = {'A', 'C', 'A', 'A', 'D'};
        char[] correctAnswers = getCorrectAnswers();

        // Display results
        for (int i = 0; i < answers.length; i++) {
            System.out.println("Question " + (i + 1) + ": Your Answer: " + answers[i] + ", Correct Answer: " + correctAnswers[i]);
        }
    }

    // Method to return correct answers for the quiz
    private static char[] getCorrectAnswers() {
        return new char[]{'A', 'C', 'A', 'A', 'D'};
    }
}

