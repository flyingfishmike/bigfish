import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

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
    // 重写equals方法
    // 只要姓名相同就表示同一个用户
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
