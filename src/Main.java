import java.util.Scanner; //to read user input

public class Main {
    public static void main(String[] args) {
        NumberStatistics sum = new NumberStatistics();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert numbers: ");



        while (true) {
            int number = scanner.nextInt();

            if(number == -1) {
                break;
            } else {
                sum.addNumber(number);
            }

        }
        System.out.println("Sum: " + sum.sum());
    }

}

