package task4;

public class Main {
    public static void main(String[] args) {
        Object[] arrayInt = ArrayManipulation.getArray(ArrayManipulation.createArray(int.class, 10));
        ArrayManipulation.fillArrayRandomInt(arrayInt);
        System.out.println("Your array(int): " + ArrayManipulation.getArrayString(arrayInt));
        arrayInt = (Object[]) ArrayManipulation.changeArraySize(arrayInt, 15);
        System.out.println("Your array after change size: " + ArrayManipulation.getArrayString(arrayInt) + "\n");

        Object[] arrayDouble = ArrayManipulation.getArray(ArrayManipulation.createArray(double.class, 10));
        ArrayManipulation.fillArrayRandomInt(arrayDouble);
        System.out.println("Your array(double): " + ArrayManipulation.getArrayString(arrayDouble));
        arrayDouble = (Object[]) ArrayManipulation.changeArraySize(arrayDouble, 15);
        System.out.println("Your array after change size: " + ArrayManipulation.getArrayString(arrayDouble) + "\n");

        Object[] arrayString = ArrayManipulation.getArray(ArrayManipulation.createArray(String.class, 5));
        arrayString[0] = "Hello";
        arrayString[1] = "Me";
        arrayString[2] = "Java";
        arrayString[3] = "Array";
        arrayString[4] = "Manipulation";
        System.out.println("Your array(String): " + ArrayManipulation.getArrayString(arrayString));
        arrayString = (Object[]) ArrayManipulation.changeArraySize(arrayString, 15);
        System.out.println("Your array after change size: " + ArrayManipulation.getArrayString(arrayString) + "\n");
    }
}