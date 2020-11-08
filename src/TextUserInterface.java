import java.util.ArrayList;
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start(){

        System.out.println("Statements: ");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quits the text user interface");
        System.out.println("");

        while (true) {
            System.out.print("Statement: ");
            String input = reader.nextLine();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("add")){
                System.out.print("In Finnish: ");
                String input2 = reader.nextLine();
                System.out.print("Translation: ");
                String input3 = reader.nextLine();
                dictionary.add(input2, input3);

                System.out.println("");
            } else if (input.equals("translate")){
                System.out.print("Give a word: ");
                String input4 = reader.nextLine();
                String translated = dictionary.translate(input4);
                System.out.println("Translation " + translated);
                System.out.println("");
            } else {
                System.out.println("Unknown statement");
                System.out.println("");
            }

        }
    }

}
