import java.util.LinkedList;
import java.util.List;

/*
*链表的优点：
*   链表在储存空间上不连续
*   随机增删元素的时候不会有大量元素位移，因此随机增删效率高
*
* 链表缺点：
*   不能通过数学表达式计算被查找的元素的内存地址，每次都是从头开始遍历，直到找到为止。LinkedList集合检索/查找的效率低。
* */
public class LinkedListTest01 {
    public static void main(String[] args) {
        //LinkedList集合也是有下标
        //ArrayList之所以检索效率高，不是单纯因为下标原因。因为底层数组发挥的作用。
        //LinkedList检索效率低因为只能从节点的头开始一个一个遍历
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list.size());
        for (int i = 0; i<list.size();i++){
            Object obj = list.get(i);
            System.out.println(obj);
        }
    }
}
