public class App {
    public static void main(String[] args) throws Exception {
        Counter currentNumber = new Counter();
        Counter counter = new Counter(1);

        currentNumber.increment();
        counter.increment(2);

        System.out.println(currentNumber.value());
        System.out.println(counter.value());

        currentNumber.decrement();
        counter.decrement(3);

        System.out.println(currentNumber.value());
        System.out.println(counter.value());
    }
}
