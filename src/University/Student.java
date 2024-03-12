package University;

import javax.xml.crypto.Data;
import java.io.Serializable;

public class Student implements Serializable, Data {
    private String name;
    public String group;
    public Student() {
    }
    public Student(String name, String group) {
        this.name = name;
        this.group = group;
    }
    public String getGroup() {
        return group;
    }
}