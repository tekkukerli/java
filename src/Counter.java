public class Counter {
    private int startingValue;
    private boolean check;
    private int value;

    public Counter(int startingValue, boolean check){
        this.startingValue = startingValue;
        this.check = check;
        this.value = this.startingValue;
    }

    public Counter(int startingValue) {
        this.startingValue = startingValue;
        this.check = false;
        this.value = this.startingValue;
    }

    public Counter(boolean check) {
        this.startingValue = 0;
        this.check = check;
        this.value = this.startingValue;
    }

    public Counter() {
        this.startingValue = 0;
        this.check = false;
        this.value = this.startingValue;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int increaseAmount) {
        if(increaseAmount > 0) {
            this.value += increaseAmount;
        }
    }

    public void decrease() {
        if(this.check) {
            if(this.value > 0) {
                this.value--;
            }
        } else {
            this.value--;
        }
    }

    public void decrease(int decreaseAmount) {
        if(decreaseAmount > 0) {
            if(this.check) {
                if(this.value >= decreaseAmount) {
                    this.value -= decreaseAmount;
                } else {
                    this.value = 0;
                }
            } else {
                this.value -= decreaseAmount;
            }
        }

    }
    @Override
    public String toString() {
        return "Counter{" +
                "startingValue=" + startingValue +
                ", check=" + check +
                ", value=" + value +
                '}';
    }

}
