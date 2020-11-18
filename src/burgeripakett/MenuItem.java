package burgeripakett;

public class MenuItem {

    int orderNr;
    String foodItem;
    String ingredients;
    int price;

   public MenuItem(int orderNr, String foodItem, String ingredients, int price){
        this.orderNr = orderNr;
        this.foodItem = foodItem;
        this.ingredients = ingredients;
        this.price = price;
    }

    public int getOrderNr() {
        return orderNr;
    }

    public void setOrderNr(int orderNr) {
        this.orderNr = orderNr;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.orderNr + " " +  this.foodItem + " - " + this.ingredients + " " + this.price + " €";
    }
}
