import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add("a");
        c.add("蔡志航");
        c.add(100);
        c.add(new Object());
        // 获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();
        // 通过以上获取的迭代器对象开始迭代/遍历集合
        while (it.hasNext()){
            Object Mike = it.next();
            System.out.println(Mike);
        }
        System.out.println("===");
        String a= "asa";
        System.out.println(a.hashCode());
        System.out.println(System.identityHashCode(a));
        // anpai
        // sss
    }
}
