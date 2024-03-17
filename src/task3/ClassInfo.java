package task3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassInfo {
    public static void StrMethodResult(Object myObject, String strMethod, SaveClass[] args) {
        Class<?> objClass = myObject.getClass();
        Class<?>[] argTypes = new Class<?>[args.length];
        Object[] argValues = new Object[args.length];
        for (int i = 0; i < args.length; i++) {
            argTypes[i] = args[i].getType();
            argValues[i] = args[i].getValue();
        }

        Method method = null;
        try {
            method = objClass.getMethod(strMethod, argTypes);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        try {
            method.invoke(myObject, argValues);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}