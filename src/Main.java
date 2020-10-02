import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");

        int number = Integer.parseInt(reader.nextLine());
        if (number <= 29) {
            System.out.println("Failed");
        } else if (number > 29 && number < 35) {
            System.out.println("Grade: 1");
        } else if (number > 34 && number < 40) {
            System.out.println("Grade: 2");
        } else if (number > 39 && number < 45) {
            System.out.println("Grade: 3");
        } else if (number > 44 && number < 50) {
            System.out.println("Grade: 4");
        } else {
            System.out.println("Grade: 5");
        }
    }
}

