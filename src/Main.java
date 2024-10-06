import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String[] choices = {"rock","paper","scissor"};

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int randomIndex = random.nextInt(choices.length);

        String randomChoice = choices[randomIndex];

        System.out.println("Enter your choice between rock,paper,scissor");
        String userChoice = input.nextLine();

        System.out.println("computer choice: "+randomChoice);

        if(randomChoice.equals(userChoice)) {
            System.out.println("its a Draw");
        }
        else if(randomChoice.equals("rock") && userChoice.equals("scissor")) {
            System.out.println("You lose!");
        }
        else if(randomChoice.equals("scissor") && userChoice.equals("paper")) {
            System.out.println("You lose!");
        }
        else if(randomChoice.equals("paper") && userChoice.equals("rock")) {
            System.out.println("You lose!");
        }
        else if(randomChoice.equals("scissor") && userChoice.equals("rock")) {
            System.out.println("You win!");
        }
        else if(randomChoice.equals("paper") && userChoice.equals("scissor")) {
            System.out.println("You win!");
        }
        else if(randomChoice.equals("rock") && userChoice.equals("paper")) {
            System.out.println("You win!");
        }

        input.close();
    }
}