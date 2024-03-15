package task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class ClassInfo {
    public static void callInfo(Student newStudent) throws InvocationTargetException, IllegalAccessException {

        StringBuilder callIn = new StringBuilder();
        callIn.append("Name of class: " + newStudent.getClass().getSimpleName() + "\n");
        callIn.append("\nDeclared fields: " + Arrays.toString(newStudent.getClass().getDeclaredFields()) + "\n");
        String group = newStudent.getGroup();
        String name = null;
        String surname = null;
        try {
            Field field = newStudent.getClass().getDeclaredField("name");
            field.setAccessible(true);
            name = (String) field.get(newStudent);
            field = newStudent.getClass().getDeclaredField("surname");
            field.setAccessible(true);
            surname = (String) field.get(newStudent);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        callIn.append(name + " " + surname + "\t" + group);
        System.out.println(callIn);
        System.out.println("Choose method to call:\n");
        Method[] methods = newStudent.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("Print number of method: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option <= 0 || option > methods.length)
        {
            System.out.println("Incorrect input!");
        }
        else{
            System.out.println(methods[option - 1].invoke(newStudent));
        }
    }
}
