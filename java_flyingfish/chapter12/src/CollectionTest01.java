import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
        // 创建一个集合对象
        // Collection c = new Collection();// 接口是抽象的，无法实例化
        // 多态
        Collection c = new ArrayList();
        // 测试接口中的常用方法
        c.add(1200);//自动装箱，实际上是放进去了一个内存地址，Integer X = new Integer(1200);
        c.add(3.14);// 自动装箱
        c.add(new Object());
        c.add(new Student());
        c.add(true);// 自动装箱
        System.out.println("集合中的元素个数是："+c.size());// 5个
        c.clear();// 清空集合
        System.out.println("集合中的元素个数是："+c.size());// 0个
        c.add("hello");// 存放了hello对象的内存地址
        c.add("world");
        c.add("浩克");
        c.add("绿巨人");
        c.add(1);
        // 判断集合中是否有“绿巨人”
        boolean flag = c.contains("绿巨人");
        System.out.println(flag);
        boolean flag2 = c.contains("绿巨人2");
        System.out.println(flag2);
        System.out.println(c.contains(1));//true
        //删除集合中的某个元素
        c.remove(1);
        System.out.println("集合中的元素个数是："+c.size());// 4个
        // 判断集合是否为空
        System.out.println(c.isEmpty());// false
        c.clear();
        System.out.println(c.isEmpty());// true 集合中没有元素了
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add("HelloWorld");
        c.add(new Student());
        c.add(new Flower());//内存地址
        Object[] ac  = c.toArray();// 转换成数组
        for (int i = 0;i <ac.length; i++){
            Object o = ac[i];
            System.out.println(o);
        }
    }
}
class Flower{

}
