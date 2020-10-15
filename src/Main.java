import java.util.Scanner; //to read user input
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));
    }
    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

}

