import java.util.Scanner; //to read user input

public class Main {
    public static void main(String[] args) {
       int number = 2;
       while(number <= 100){
           if(number % 2 == 0){
               System.out.println(number);
           }
           number++;
       }
    }
}

