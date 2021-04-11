import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest03 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();
        // 创建用户对象
        User u1 = new User("jack");
        User u2 = new User("jack");
        // 加入集合
        c.add(u1);
        System.out.println(c.contains(u2));
    }
}
class User{
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}
