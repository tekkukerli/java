package burgeripakett;

import burgeripakett.Burger;
import burgeripakett.CheeseToppings;
import burgeripakett.Toppings;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
        menu.add(new MenuItem(1, "Kanaburger", "(kanaliha, valge sai)", 15));
        menu.add(new MenuItem(2, "Juustuburger","(loomaliha, valge sai)",  18));
        menu.add(new MenuItem(3, "New York burger", "(sealiha, teraleib)", 20));

        //Lisandite koostamine
        ArrayList<Toppings> chickenToppingsList = new ArrayList<Toppings>();
        chickenToppingsList.add(new ChickenToppings("juust", "salat", "tomat", "majonees", 0.5,0.5,0.5,0.5));

        ArrayList<Toppings> cheeseToppingsList = new ArrayList<Toppings>();
        cheeseToppingsList.add(new CheeseToppings("peekon", "kurk", "sibul", "peekonikaste", 0.5,0.5,0.5,0.5));

        ArrayList<Toppings> NewYorkToppingsList = new ArrayList<Toppings>();
        NewYorkToppingsList.add(new CheeseToppings("ananass", "tomat", "kurk", "sibul", 0.5,0.5,0.5,0.5));


        Scanner orderMore = new Scanner(System.in);
        double priceSum = 0;


        while(true) {
            Scanner burgerChoice = new Scanner(System.in);

            //Menüü printimine
            System.out.println("\nMenüüvalik: ");
            for (MenuItem menuItem : menu) {
                System.out.println(menuItem.toString());
            }
            System.out.println("");
            System.out.println("Vali burgeri number:  (0 lõpetab valiku)");
            int chosenBurger = burgerChoice.nextInt();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //Kui valis kanaburgeri
            if(chosenBurger  == 1) {
                System.out.println("\nValisid kanaburgeri.");

                Burger chickenBurger = new Burger("kanaburger", "kanaliha", "valge sai", 15);

                //Kanaburgeri lisandid

                for (Toppings toppings : chickenToppingsList) {
                    System.out.println(toppings);
                }
                System.out.println("");
                chickenBurger.chooseToppings();

                //Hinnastamine
                priceSum += chickenBurger.calculateBurger();
                System.out.println("\nKanaburgeri hind: " + chickenBurger.calculateBurger());

                //Tellimuse jätkamine
                System.out.println("\nKas soovid veel burgereid? (jah/ei)");
                String moreBurgers = orderMore.nextLine();
                if(moreBurgers.equals("ei")) {
                    break;
                }

            }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //Kui valis juustuburgeri
            else if(chosenBurger == 2) {
                System.out.println("\nValisid juustuburgeri.");

                Burger cheeseBurger = new Burger("juustuburger", "loomaliha", "valge sai", 18);

                //Juustuburgeri lisandid

                  for (Toppings toppings : cheeseToppingsList) {
                    System.out.println(toppings);
                }
                System.out.println("");
                cheeseBurger.chooseToppings();

                //Hinnastamine
                priceSum += cheeseBurger.calculateBurger();
                System.out.println("\nJuustuburgeri hind: " + cheeseBurger.calculateBurger());

                //Tellimuse jätkamine
                System.out.println("\nKas soovid veel burgereid? (jah/ei)");
                String moreBurgers = orderMore.nextLine();
                if(moreBurgers.equals("ei")) {
                    break;
                }
            }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //Kui valis New York burgeri
            else if(chosenBurger == 3) {
                System.out.println("\nValisid New York burgeri.");

                Burger newYorkBurger = new Burger("New York burger", "sealiha", 20); //loodud teraleivaga

                //New York burgeri lisandid
                System.out.println("New York burgeri lisandid: ");
                for (Toppings toppings : NewYorkToppingsList) {
                    System.out.println(toppings);
                }
                System.out.println("");
                newYorkBurger.chooseToppings();

                //Hinnastamine
                priceSum += newYorkBurger.calculateBurger();
                System.out.println("\nNew York burgeri hind: " + newYorkBurger.calculateBurger());

                //Tellimuse jätkamine
                System.out.println("\nKas soovid veel burgereid? (jah/ei)");
                String moreBurgers = orderMore.nextLine();
                if(moreBurgers.equals("ei")) {
                    break;
                }
            }

            else break;
        }


        System.out.println("\nTeie arve on " + priceSum + " €");
    }

}