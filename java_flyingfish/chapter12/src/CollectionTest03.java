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
        // 重写之前equals比较的结果是false
        //System.out.println(c.contains(u2));// false
        // 重写之后结果是true
        System.out.println(c.contains(u2));// true
        c.remove(u2);
        System.out.println(c.size());//结果是0，因为重写了equals方法
        Integer x = new Integer(1000);
        c.add(x);
        Integer y = new Integer(1000);
        System.out.println(c.contains(y));// ture

        // 创建集合对象
        Collection cc = new ArrayList();
        // 创建数组对象
        String s1= new String("hello");
        String s2= new String("hello");
        // 删除s2
        cc.remove(s2);
        //集合中的个数是
        System.out.println(cc.size());//0个
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
