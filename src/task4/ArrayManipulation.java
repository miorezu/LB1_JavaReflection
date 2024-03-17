package task4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public abstract class ArrayManipulation {
    public static Object createArray(Class<?> classObj, int size) {
        return Array.newInstance(classObj, size);
    }

    public static Object changeArraySize(Object[] oldArray, int newSize) {
        int length = Math.min(oldArray.length, newSize);
        Object[] newArray = (Object[]) Array.newInstance(oldArray.getClass().getComponentType(), newSize);
        java.lang.System.arraycopy(oldArray, 0, newArray, 0, length);
        return newArray;
    }

    public static Object[] getArray(Object array) {
        if (array instanceof Object[])
            return (Object[]) array;
        int arraySize = Array.getLength(array);
        Object[] outputArray = new Object[arraySize];
        for (int i = 0; i < arraySize; ++i) {
            outputArray[i] = Array.get(array, i);
        }
        return outputArray;
    }

    public static String getArrayString(Object[] array) {
        return Arrays.deepToString(array);
    }

    public static void fillArrayRandomInt(Object[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public static void fillArrayRandomDouble(Object[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(100.0);
        }
    }
}