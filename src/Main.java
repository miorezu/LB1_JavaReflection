public class Main {
    public static void main(String[] args) {
        try {
            Class<?> myClass = Class.forName("University.Student");
            ClassInfo.getInfo(myClass);
        } catch (ClassNotFoundException e) {
            System.out.println("Class was not found");
        }

    }
}
