package burgeripakett;

import java.util.ArrayList;
import java.util.Scanner;

class Burger {

    private String name;   //encapsulation - variables are kept private or “encapsulated.”
    private String meat;
    private String bread;
    private double price;
    private ArrayList<String> toppings = new ArrayList<String>();
    private int toppingCounter = 0;

    Burger(String name, String meat, String bread, double price) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
        this.price = price;
    }

    Burger(String name, String meat, double price) {   //polymorphism - several methods with the same name within a class
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bread = "teraleib";
    }

    void chooseToppings() {
        Scanner scanner = new Scanner(System.in);

        while(toppingCounter < 4) {
            System.out.println("Sisesta lisandid (ühekaupa). Kui lisandit ei soovi, vajuta ENTER.");
            String topping = scanner.nextLine();
            if(topping.isEmpty()) {
                break;
            }
            else toppings.add(topping);
            toppingCounter++;
        }
        System.out.println("Valitud lisandid: ");
        for(String topping : toppings) {
            System.out.print(topping + " ");
        }
        System.out.println();
    }

    double calculateBurger() {
        double toppingPrice = 0.50;
        return this.price + (toppingCounter * toppingPrice);
    }
}