import java.util.Scanner;

class GuessingGame {
    int random;

    GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);

    }
    /**
     * @param guessnumber the number that player is guessed
     * @return
     *         0 if the guessed number is correct.
     *         positive if the guessed number is higher.
     */
    new*

    int guess(int guessNumber) {
        return guessnumber - random;

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Welcome to the  guessing game  ");
        int guess; 
        int result;
        do{
            System.out.println("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result ==0){
                System.out.println("congrats your number is correct");

            } else if (result<0){
                System.out.println("please guess higher");

            }else{ 
                System .out.println("guess lower");
            }
        } while(result!=0);


    }
}