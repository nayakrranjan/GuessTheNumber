import java .util.Scanner;
import java.util.Random;

class Game{
    public int user;
    public int computer;
    public int counter = 0;
    Random random = new Random();

    public game(){
        computer = random.nextInt(100);
    }

    public void userInput(int n){
        user = n;
    }

    public int isCorrect(){
        if(user > computer){
            return -1;
        }
        else if(user < computer){
            return 1;
        }
        else{
            return 0;
        }
    }
    public void counter(){
        counter ++;
    }
    
}

public class GuessTheNumber {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        game game = new game();
        System.out.println("Range 0 to 100");

        while(true){

            int n;
            do{
                System.out.println("Your Guess: ");
                n = scan.nextInt();
            }while(n > 100);
            game.userInput(n);

            if(game.isCorrect() == 1){
                game.counter();
                System.out.println("Higher");
            }
            else if(game.isCorrect() == -1 ){
                game.counter();
                System.out.println("Lower");
            }
            else if(game.isCorrect() == 0){
                game.counter();
                System.out.println("Correct");
                System.out.println("Guesses: " + game.counter);
                break;
            }
            
        }
        scan.close();
    }
}
