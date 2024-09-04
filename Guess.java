import java.util.*;

class Guess {
    public static void main(String[] args) {
        
        double ranNum = Math.random() * 10;
        int answer = (int)ranNum;

        int numGuesses = 0;
        int guess = 0;

        while (guess != answer) {
            numGuesses = numGuesses += 1;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your guess: ");
            guess = Integer.parseInt(scan.nextLine());
            
            if (guess < answer)
                System.out.println("Your guess is too low.");
            if (guess > answer)
                System.out.println("Your guess is too high.");
            if (guess == answer)
                System.out.println("You got it!!");
            if (guess == answer)
                System.out.println("It took you " + numGuesses + " guesses.");
        }
    }
}
