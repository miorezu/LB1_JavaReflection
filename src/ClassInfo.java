import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public abstract class ClassInfo {
    public static void getInfo(Class<?> myClass) {

        StringBuilder infoClass = new StringBuilder();
        infoClass.append("Package: " + myClass.getPackage() + "\n");
        infoClass.append("Name: " + myClass.getSimpleName() + "\n");
        infoClass.append("Modifiers: " + Modifier.toString(myClass.getModifiers()) + "\n");
        infoClass.append("Base class: " + myClass.getSuperclass() + "\n");
        infoClass.append("Implemented interfaces: ");
        Class<?>[] interfaces = myClass.getInterfaces();
        if (interfaces.length > 0) {
            for (Class<?> listOfInterfaces : interfaces) {
                infoClass.append(listOfInterfaces.getName()).append("\n\t\t\t\t\t\t");
            }
        } else {
            infoClass.append("None");
        }
        infoClass.append("\nDeclared fields: " + Arrays.toString(myClass.getDeclaredFields()) + "\n");
        infoClass.append("\nDeclared methods: ");
        Method[] declaredMethods = myClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            infoClass.append(method + "\n");
        }
        infoClass.append("\nConstructors: " + Arrays.toString(myClass.getConstructors()) + "\n");
        System.out.println(infoClass);
    }

    public static void callInfo(University.Student newStudent) throws InvocationTargetException, IllegalAccessException {

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
        System.out.println(methods[option - 1].invoke(newStudent));
    }
}
