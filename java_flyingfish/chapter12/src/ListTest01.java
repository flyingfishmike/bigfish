/*
测试List接口中常用方法
   1、List集合存储元素特点：有序可重复
    有序：list集合的元素有下标
    从0开始，以1递增。
    可重复：存储一个1，还可以存储1
    2、List既然是Collection接口的子接口，那么肯定List集合有自己特色的方法：
        以下只列出List接口的特有方法：
        void add(int index,E element)
* */

import java.util.*;

public class ListTest01 {
    public static void main(String[] args) {
        //创建List集合
        //List myList = new Vector();
        //List myList = new LinkedList();
        List myList = new ArrayList();
        //添加元素
        myList.add("A");//集合都是默认向集合末尾添加元素
        myList.add("B");
        myList.add("C");
        myList.add("D");
        // 在列表指定位置添加元素，index是下标
        myList.add(3,"morning");

        //迭代
        Iterator i = myList.iterator();
        while (i.hasNext()) {
            Object obj  = i.next();
            System.out.println(obj);
        }

        // 根据下标获取元素
        Object fobj = myList.get(1);
        System.out.println(fobj);

        // 因为有下标，所以list集合有自己比较特殊的遍历方式
        //通过下标获取
        for (int j = 0; j<myList.size();j++){
            Object o = myList.get(j);
            System.out.println(o);
        }
    }
}
