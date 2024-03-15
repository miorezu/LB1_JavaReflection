package task3;

public class Main {
    public static void main(String[] args) {
        Numbers myObject = new Numbers();
        SaveClass[] arguments1 = new SaveClass[]{
                new SaveClass(90, int.class),
                new SaveClass(7, int.class)
        };
        ClassInfo.StrMethodResult(myObject, "add", arguments1);
        SaveClass[] arguments2 = new SaveClass[]{
                new SaveClass(27.8, double.class),
                new SaveClass(24.2, double.class)
        };
        ClassInfo.StrMethodResult(myObject, "add", arguments2);
        SaveClass[] arguments3 = new SaveClass[]{
                new SaveClass("20", String.class),
                new SaveClass("21", String.class)
        };
        ClassInfo.StrMethodResult(myObject, "add", arguments3);
    }
}