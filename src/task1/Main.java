package task1;

public class Main {
    public static void main(String[] args) {
        try {
            Class<?> myClass = Class.forName("task1.University.Student");
            ClassInfo.getInfo(myClass);
        } catch (ClassNotFoundException e) {
            System.out.println("Class was not found");
        }
        System.out.println("--------------------------------------------------------\n");
        ClassInfo.getInfo(java.io.Console.class);
    }
}
