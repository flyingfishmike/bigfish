import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamTest01 {
    public static void main(String[] args) {
        Student s = new Student(22,"caizhhang");// 对实例化的对象s进行序列号，保存到students中
        List<Student> ss= null;
        ObjectOutputStream oos = null;
        try {
             oos = new ObjectOutputStream(new FileOutputStream("chapter8/src/students"));
             // 序列号多个对象
            ss = new ArrayList<>(); // Student类的集合
            ss.add(new Student(1,"wangheng"));
            ss.add(new Student(4,"wanghengcai"));
            ss.add(new Student(2,"jiapan"));
            ss.add(new Student(3,"xuming"));
             oos.writeObject(s);
             oos.writeObject(ss);
             oos.flush();
             oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
