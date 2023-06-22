package GuessGame.src;
import java.util.Random;
import javax.swing.JOptionPane;

public class numberGuessingGame { //with dialogue box

    public static void main(String[] args) {


        int attempt = 0;

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        JOptionPane.showMessageDialog(null, "Welcome to \"Guess The Number\" Game!!!!");

        for (int i = 0; i < 100; i++) {
            attempt++;
            String number = JOptionPane.showInputDialog("Guess the number between 0 and 100:");
            int guessNumber = Integer.parseInt(number);

            if (guessNumber == randomNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations!!!! You've guessed the right number : " + guessNumber + " in " + attempt + " attempts.");
                break;
            }
            else if (guessNumber < randomNumber) {
                JOptionPane.showMessageDialog(null, "Your guess number is lower than random number. Try again. " );
            }
            else {
                JOptionPane.showMessageDialog(null, "Your guess number is higher than random number. Try again.");
            }

        }
        JOptionPane.showMessageDialog(null, "Your score is:"+(100-(5*attempt)));
        

    }


}
