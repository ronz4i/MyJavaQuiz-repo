import java.util.Scanner;

public class MyJavaQuiz {

    public static void main(String[] args) {

        String[] questions = {"Which role focuses on protecting computer systems and networks from cyber threats?",
                "Which of the following is a primary role in the healthcare industry?",
                "Which profession is typically associated with the financial industry?",
                "What role is essential in the construction industry?",
                "Which of the following is common in the hospitality and tourism industry?"};

        String[][] options = {{"A. Cybersecurity Analyst", "B. Interior Designer", "C. Tour Guide", "D. Veterinarian"},
                {"A. Police", "B. Registered Nurse", "C. Civil Engineer", "D. Chef"},
                {"A. Financial Analyst", "B. Electrician", "C. Construction Worker", "D. Politician"},
                {"A. Financial Analyst", "B. Garbageman", "C. General Contractor", "D. Astronaut"},
                {"A. Hotel Manager", "B. Civil Engineer", "C. Architect", "D. Aviation"}};

        String[] answers = {"A", "B", "A", "C", "A"};
        int score = 0;
        String guess;

        Scanner scanner = new Scanner(System.in);


        System.out.println("***************************");
        System.out.println("Welcome to Simple Java Quiz");
        System.out.println("***************************");

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.next().trim().toUpperCase();

            if(guess.equals(answers[i])){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            }
            else{
                System.out.println("********");
                System.out.println(" WRONG! ");
                System.out.println("********");
            }
        }

        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
