import java.util.Scanner; //to read user input
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {
            DecreasingCounter counter = new DecreasingCounter(10);

            counter.printValue();

            counter.decrease();
            counter.printValue();

            counter.decrease();
            counter.printValue();
        }


}

