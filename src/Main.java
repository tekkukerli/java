import java.util.Scanner; //to read user input
import java.util.ArrayList;

public class Main {

        public static void main(String[] args) {
                Menu menu = new Menu();
                menu.addMeal("Hamburger");
                menu.addMeal("Fish'n'Chips");
                menu.addMeal("Sauerkraut");

                menu.printMeals();
        }



}

