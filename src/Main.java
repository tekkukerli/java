import java.util.Scanner; //to read user input

public class Main {
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number");
        int upperNumber = Integer.parseInt(reader.nextLine());
        int currentNumber = 1;
        while (currentNumber <= upperNumber){
            System.out.println(currentNumber);
            currentNumber++;
        }
    }
}

