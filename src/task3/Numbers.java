package task3;

public class Numbers {
    public Numbers() {
    }

    public void add(int currentNumber, int newNumber) {
        System.out.println("Result(int): " + (currentNumber + newNumber));
    }

    public void add(double currentNumber, double newNumber) {
        System.out.println("Result(double): " + (currentNumber + newNumber));
    }

    public void add(String currentNumber, String newNumber) {
        System.out.println("Result(String): " + (currentNumber + newNumber));
    }
}
