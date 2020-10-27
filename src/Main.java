import java.util.Scanner; //to read user input
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes);   // the current time printed
            minutes.next() ;// advance minutes
            i++;
            // if minutes become zero, advance hours
            if (minutes.getValue() == 0) {
                hours.next();
            }

        }

    }
}

