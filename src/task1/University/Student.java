package task1.University;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable, Data {
    private String name;
    private String surname;
    public String group;

    public Student() {
    }

    public Student(String name, String surname, String group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public String getSName() {
        return name + " " + surname;
    }

    public void rate() {
        System.out.println("What rating would you like to give?");
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();
        System.out.println("You rated it - " + mark);
    }

}