//import java.util.Scanner; //to read user input
import java.util.ArrayList;


public class Main {

    public static double average(ArrayList<Integer> list) {
        // write your code here
        int sum = 0;
        for (Integer number : list
        ) {
            sum += number;
        }
        return (double) sum / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }

}

