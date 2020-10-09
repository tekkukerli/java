import java.util.Scanner; //to read user input

public class Main {
    private static boolean drawNumber(int guess, int number, int count) {

        System.out.println(number);
        if(guess < number) {
            System.out.println("The number is greater, guesses made: " + count);
            return true;
        } else if (guess > number){
            System.out.println("The number is lesser, guesses made: " + count);
            return true;
        } else {
            System.out.println("Congratulations, your guess is correct");
            return false;
        }
      }

    public static void main(String[] args) {
        int number = (int)(Math.random() * 101);
        Scanner reader = new Scanner(System.in);
        System.out.println("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        int count = 1;
        while(drawNumber(guess, number, count)){
            System.out.println("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            count++;
        }
    }
}

