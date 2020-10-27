import java.util.Scanner; //to read user input

public class Main {
    public static void main(String[] args) {
        NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert numbers: ");



        while (true) {
            int number = scanner.nextInt();

            if(number == -1) {
                break;
            } else {
                if (number % 2 == 0) {
                    even.addNumber(number);
                } else {
                    odd.addNumber(number);
                }

            }

        }
        System.out.println("Sum: " + sum.sum());
        System.out.println("Even sum: " + even.sum());
        System.out.println("Odd sum: " + odd.sum());
    }

}

