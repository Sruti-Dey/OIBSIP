import java.util.Random;
import java.util.Scanner;
   
public class numberGuess{  //without using Dialog box
public static void main(String args[]){
    System.out.println("Welcome to Number Guessing game!!");
    System.out.println("Try to guess the number in range 0-100");
        // create instance of Random class
        Random rand = new Random();
   
        // Generate random integers in range 0 to 999
        int randNum = rand.nextInt(100);

        // Print random integers
        System.out.println("Random Integers: "+randNum);

        
        try (Scanner sc = new Scanner(System.in)) {
            //take input from user
            System.out.println("Guess the number:");
            int guess=sc.nextInt();

            //create count variable to keep track of Attemp
            int count=0;

            //when guess is wrong
            while(guess!=randNum){
                count++;
                if(guess<randNum){
                    System.out.println("Your guess is low!!");
                } else{
                    System.out.println("Your guess is high!!");
                }
                guess=sc.nextInt();
            }
            //when guess is right
            System.out.println("Finally! Your guess is right!");
            System.out.println("Your total attemp: "+count);
        }
    }
}

