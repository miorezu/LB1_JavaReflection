package task5;


import java.lang.reflect.Proxy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Function function = new Function();
        Calculate a = (Calculate) Proxy.newProxyInstance(function.getClass().getClassLoader(),
                function.getClass().getInterfaces(), new Handler(function));
        System.out.println("Our number is ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("\nExponent of the number:");
        a.funcExp(x);
        System.out.println("\nSin of the number:");
        a.funcSin(x);
        System.out.println("\nCos of the number:");
        a.funcCos(x);
    }
}