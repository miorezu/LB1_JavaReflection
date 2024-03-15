package task2;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Student newStudent = new Student("Anzhelika",
                "Mazurenko", "CS22");
        ClassInfo.callInfo(newStudent);
    }
}
