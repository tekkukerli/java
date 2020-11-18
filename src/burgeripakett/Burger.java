package burgeripakett;

import java.util.ArrayList;
import java.util.Scanner;

public class Burger {

    private String name;   //encapsulation - variables are kept private or “encapsulated.”
    private String meat;
    private String bread;
    private double price;
    ArrayList<String> toppings = new ArrayList<String>();
    private double toppingPrice = 0.50;
    int toppingCounter = 0;

    public Burger(String name, String meat, String bread, double price) {
        this.name = name;
        this.meat = meat;
        this.bread = bread;
        this.price = price;
    }

    public Burger(String name, String meat, double price) {   //polymorphism - several methods with the same name within a class
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bread = "teraleib";
    }


    public void chooseToppings() {
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

    public double calculateBurger() {
        return this.price + (toppingCounter * toppingPrice);
    }




}