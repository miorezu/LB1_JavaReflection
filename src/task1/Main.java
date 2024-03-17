package task1;

import javax.swing.*;
import java.awt.*;

public class Main {
    static Toolkit toolkit = Toolkit.getDefaultToolkit();
    static Dimension screenSize = toolkit.getScreenSize();
    static int screenWidth = (int) screenSize.getWidth();
    static int screenHeight = (int) screenSize.getHeight();
    public static int Width = screenWidth / 2;
    public static int Height = screenHeight / 2;

    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(Width, Height);
        frame.setTitle("Analyze class");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        try {
            Class<?> myClass = Class.forName("task1.University.Student");
            ClassInfo.getInfo(myClass);
        } catch (ClassNotFoundException e) {
            System.out.println("Class was not found");
        }

        System.out.println("--------------------------------------------------------\n");
        ClassInfo.getInfo(java.io.Console.class);
    }
}