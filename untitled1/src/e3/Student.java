package e3;

public class Student {
    private String name;
    private String group;
    private String univer;

    public Student(String name, String group, String univer) {
        this.name = name;
        this.group = group;
        this.univer = univer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setUniver(String univer) {
        this.univer = univer;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getUniver() {
        return univer;
    }
}
