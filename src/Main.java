//import java.util.Scanner; //to read user input
import java.util.ArrayList;

public class Main {

    public static int greatest(ArrayList<Integer> list) {
        // write your code here
        int greatestNumber = list.get(0);
        for (Integer number : list) {
            if (number > greatestNumber) {
                greatestNumber = number;
            }
        }
        return greatestNumber;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }
}

