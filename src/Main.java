import java.util.Scanner; //to read user input
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while(true) {
            System.out.println("Type a word: ");
            String word = reader.nextLine();

            if (words.contains(word)) {
                System.out.println("You gave the word " + word + " twice");
                break;
            } else {
                words.add(word);
            }
        }

    }

}

