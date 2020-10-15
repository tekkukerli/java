import java.util.Scanner; //to read user input

public class Main {

    public static String reverse(String text) {
        int i = text.length() -1;
        String reverseText = "";
        while (i >= 0) {
            reverseText += text.charAt(i);
            i--;
        }
        return reverseText;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in your text: ");
        String text = reader.nextLine();

        System.out.println("In reverse order: " + reverse(text));
    }

}

