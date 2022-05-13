public class Counter {
    private int number;
    
    public Counter() {
        number = 0;
    }

    public Counter(int value){
        this.number = value;
    }

    public int value() {
        return this.number;
    }

    public void increment() {
        this.number += 1;
    }

    public void increment(int incrementBy) {
        if (incrementBy < 0) {
            this.number += 0;
        } else {
            this.number += incrementBy;
        }
    }

    public void decrement() {
        this.number -= 1;
    }

    public void decrement(int decrementBy) {
        if (decrementBy < 0) {
            this.number += 0;
        } else {
            this.number -= decrementBy;
        }
    }
}