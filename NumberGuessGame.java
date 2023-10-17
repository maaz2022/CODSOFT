import java.util.Random;
import java.util.Scanner;

class NumberGuessGame {
    private int minRange;
    private int maxRange;
    private int secretNumber;
    private int attempts;
    private int maxAttempts;
    private int roundsWon;

    public NumberGuessGame(int minRange,int maxRange,int maxAttempts){
        this.minRange=minRange;
        this.maxRange=maxRange;
        this.maxAttempts=maxAttempts;
    }
    public void initializeGame(Random random){
        secretNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        attempts = 0;
    }
    public void play(){
        Scanner input = new Scanner(System.in);
        Random random =new Random();
        boolean playing=true;

        System.out.println("Welcome to Number Guess Game Hope you enjoy it");
        while(playing){
            initializeGame(random);
            System.out.println("Guess Number Between " + minRange + " and " + maxRange + " !");
            while(attempts < maxAttempts){
                int userGuess = input.nextInt();
                attempts++;
                if(userGuess < secretNumber){
                    System.out.println("Too Low !!! try again");
                }
                if(userGuess > secretNumber){
                    System.out.println("Too High !!!! try again");
                }
                if(userGuess == secretNumber){
                    System.out.println("Congratulations you Won");
                    roundsWon++;
                    break;
                }
            }
            if(attempts == maxAttempts){
                System.out.println(" You reached the maximum attempts.The Secret Number is " + secretNumber+ ".");
            }
            System.out.println("Do you wanna play again (yes/no)");
            String playAgainInput = input.next().toLowerCase();
            if(!playAgainInput.equals("yes")){
                playing = false;
            }
        }
        System.out.println("Thanks for playing! you won " + roundsWon + " round(s) ");
    input.close();
    }
    public static void main(String[] args) {
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 3;
        NumberGuessGame game = new NumberGuessGame(minRange , maxRange, maxAttempts);
        game.play();
    }
}

