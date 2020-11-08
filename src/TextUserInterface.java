import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start(){

        System.out.println("Statement: ");
        System.out.println("    quit - quit the text user interface");
        System.out.println("");

        while (true) {
            System.out.print("Statement: ");
            String input = reader.nextLine();
            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else {
                System.out.println("Unknown statement");
                System.out.println("");
            }
        }
    }
}
