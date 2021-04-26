import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArrayListTest02 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList(100);

        // 创建一个HashSet集合
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(400);
        c.add(500);

        //通过这个构造方法将HashSet转换成List集合
        List as = new ArrayList(c);
        for(int i = 0; i< as.size();i++){
            System.out.println(as.get(i));
        }
    }
}
