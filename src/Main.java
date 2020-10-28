import java.util.Scanner; //to read user input
import java.util.ArrayList; // import the ArrayList class

public class Main {
    public static void main(String[] args) throws Exception{

        Counter test = new Counter(12, true);
        Counter test2 = new Counter(22);
        Counter test3 = new Counter(true);
        Counter test4 = new Counter();


        test.increase();

        System.out.println(test);

    }


}

