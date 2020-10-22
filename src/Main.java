import java.util.Scanner; //to read user input
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {
            DecreasingCounter counter = new DecreasingCounter(10);

            int i = 10;

            while (i > 0) {
                counter.decrease();
                counter.printValue();
                i--;
            }

        }


}

