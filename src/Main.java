import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //task1
        try {
            Class<?> myClass = Class.forName("University.Student");
            ClassInfo.getInfo(myClass);
        } catch (ClassNotFoundException e) {
            System.out.println("Class was not found");
        }
        System.out.println("--------------------------------------------------------\n");
        ClassInfo.getInfo(java.io.Console.class);
        //task2
        System.out.println("._._._._._._._._._._._._._._._._._._._._._._._._._._._._.\n");
        University.Student newStudent = new University.Student("Anzhelika", "Mazurenko", "CS22");
        ClassInfo.callInfo(newStudent);
    }

}
