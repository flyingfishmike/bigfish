import java.io.Serializable;

public class Student implements Serializable {// 序列号的标志接口
    private static final long serialVersionUID = 222l;
    private int no;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
