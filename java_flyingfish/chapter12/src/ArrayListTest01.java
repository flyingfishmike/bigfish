import java.util.ArrayList;
import java.util.List;

/*
*ArrayList集合：
*   1、默认初始化容量10
*   2、集合底层是一个Object[]数组
*   3、构造方法：
*       new ArrayList()
*       new ArrayList(30)
*   4、ArrayList的扩容：
*       原容量的1.5倍
*       ArrayList底层是数组，底层是数组，尽可能少的扩容。数组扩容效率低，建议在使用ArrayList集合
*       预估计元素的个数，给定一个初始化容量
*   5、数组优点：
*       检索效率比较高
*   6、数组缺点：随机增删元素效率比较低，但是向数组末尾添加元素效率高
*       数组无法存储大量数据（很难找到一个非常巨大的内存空间）
*   7、ArrayList集合是非线程安全的
*   8、ArrayList集合是用的最多的集合，因为向数组末尾添加元素，效率不受影响，检索某个元素的操作较多
* */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //默认初始化容量是10
        List list1 = new ArrayList();
        System.out.println(list1.size());// 0
        //size()获取当前集合元素的个数，不是获取集合的容量

        //指定初始化容量
        List list2 = new ArrayList(30);
        System.out.println(list2.size());// 0
    }
}
