package task1;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame() {
        JButton analysis = new JButton("Analysis");
        JButton clear = new JButton("Clear");
        JButton exit = new JButton("Exit");
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Enter full name of class:");
        topPanel.add(label, BorderLayout.NORTH);
        JTextField textField = new JTextField();
        topPanel.add(textField, BorderLayout.CENTER);
        add(topPanel, BorderLayout.NORTH);

        buttonPanel.add(analysis);
        buttonPanel.add(clear);
        buttonPanel.add(exit);
        add(buttonPanel, BorderLayout.SOUTH);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        analysis.addActionListener(e -> {
            String classToAnalyze = textField.getText();
            textArea.setText("");
            System.out.println(classToAnalyze);
            try {
                Class<?> myClass = Class.forName(classToAnalyze);
                textArea.setText(ClassInfo.getInfo(myClass));
            } catch (ClassNotFoundException a) {
                System.out.println("Class was not found");
                textArea.setText("Class was not found");
            }
        });

        clear.addActionListener(e -> {
            textField.setText("");
            textArea.setText("");
        });

        exit.addActionListener(e -> {
            System.exit(0);
        });
    }
}
