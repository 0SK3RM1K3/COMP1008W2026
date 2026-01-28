import java.util.Scanner;
import java.util.Random;

public class Main {

    enum Choice {
        ROCK, PAPER, SCISSORS

        //Method to get a random choice
        private static final Random rand = new Random();

        public static Choice getRandomChoice(){
            Choice[] values = Choice.values();//built in enum method
            return values[rand.nextInt(values.length)]
        }
    }
   
    public static void showChoice(String player, Choice choice){
        System.out.println(player + " chooses " + choice);
    }

    public static String determineWinner(Choice player, Choice computer){
        if(player == computer){
            return "It's a tie";
        } else if(
            (player == Choice.ROCK && computer == Choice.SCISSORS) ||
            (player == Choice.PAPER && computer == Choice.ROCK) ||
            (player == Choice.SCISSORS && computer == Choice.PAPER)
        ){
            return "Player wins!";
        }else{
            return "Computer wins!";
        }
    }
    
}

public static void main(String[] args){
    Scanner scanner = new Scanner(Sysytem.in);

    //Ask the user for input
    System.out.println("Enter your choice");
    String input = scanner.nextLine().toUpperCase();

    Choice userChoice;
    try{
        userChoice = Choice.valueOf(input);
    }
    catch(IllegalArgumentException e){
        System.out.println("Invalid Choice- Default to ROCK");
        userChoice = Choice.ROCK;
    }

//Random computer choice

Choice computerChoice = Choice.getRandomChoice();

showChoice("Player", userChoice);
showChoice("Computer", computerChoice);

}
