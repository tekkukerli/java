package burgeripakett;

public class CheeseToppings extends Toppings {  //Inheritance


    public CheeseToppings(String topping1, String topping2, String topping3, String topping4, double topping1Price, double topping2Price, double topping3Price, double topping4Price){
        this.topping1 = topping1;
        this.topping2 = topping2;
        this.topping3 = topping3;
        this.topping4 = topping4;
        this.topping1Price = topping1Price;
        this.topping2Price = topping2Price;
        this.topping3Price = topping3Price;
        this.topping4Price = topping4Price;
    }

    public String toString() {
        System.out.println("Juustuburgeri lisandid: ");
        return  topping1 + " " + topping1Price + " €" + "\n" +
                topping2 + " " + topping2Price + " €" + "\n" +
                topping3 + " " + topping3Price + " €" + "\n" +
                topping4 + " " + topping4Price + " €" + "\n";
    }
}
