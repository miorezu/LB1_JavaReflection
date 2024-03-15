package task3;

public class SaveClass {
    public SaveClass(Object value, Class<?> type) {
        this.value = value;
        this.type = type;
    }

    private Object value;
    private Class<?> type;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Class<?> getType() {
        return type;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

}
