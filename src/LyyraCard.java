public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    public String toString() {
        // write code here
        return "The card has "  + this.balance + " euros";
    }

    public void payEconomical() {
        // write code here
        if(this.balance > 2.5) {
            this.balance -= 2.5;
        } else {
            return;
        }

    }

    public void payGourmet() {
        // write code here
        if(this.balance > 4) {
            this.balance -= 4;
        } else {
            return;
        }
    }

    public void loadMoney(double amount) {
        // write code here
        if (amount < 0) {
            return;
        }

        if (this.balance + amount < 151) {
            this.balance = this.balance + amount;
        } else {
            this.balance = 150;
        }

    }

}