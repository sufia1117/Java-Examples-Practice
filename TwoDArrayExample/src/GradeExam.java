import java.util.Scanner;
public class GradeExam {

    /**
     * Takes student's answers and compares them with key to find number of correct answers
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("How many answers for the quiz? ");
        int numAnswers = input.nextInt();


        // Make an array holding answer key
        char[] answerKey = new char[numAnswers];

        System.out.print("Enter the answer key: ");
        // Add the answers to the array
        for (int i = 0; i < answerKey.length; i++){
            answerKey[i] = input.next().charAt(0);
        }

        System.out.print("How many students are there? ");
        int students = input.nextInt();

        // Make an array holding student's answers
        char[][] studAnswers = new char[students][numAnswers];

        // Go through each row (student) in the array
        for (int i = 0; i < studAnswers.length; i++) {
            System.out.print("\nEnter student " + (i + 1) + "'s answers: ");
            int correctCount = 0;

            // Go through each answer for the student
            for (int j = 0; j < studAnswers[i].length; j++){
                studAnswers[i][j] = input.next().charAt(0);

                // Compare answers and add to correct count if answers match
                if (studAnswers[i][j] == answerKey[j]){
                    correctCount++;
                }
            }
            System.out.println("Student " + (i + 1) + "'s correct count is " + correctCount);
        }





    }
}