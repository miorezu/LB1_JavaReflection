package task1;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public abstract class ClassInfo {
    public static String getInfo(Class<?> myClass) {

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
        return infoClass.toString();
    }
}
