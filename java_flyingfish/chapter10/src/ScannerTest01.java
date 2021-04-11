import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("next方式接收：");

        if (a.hasNext()){//判断是否还有下一个输入项
            String  cai = a.next();
            /*
            * a.next()与a.nextLine的区别
            * next()：作为字符串输入的方法，自动屏蔽掉输入的分隔符，如空格、Tab键、回车键，直到遇到有效地字符输入后，则将这些分隔符作为结束标志；
            nextLine()；
            * 则是将从开始运行所输入的所有的字符，包括分隔符，均作为控制台输入，只有在遇到enter回车键时，才结束输入，并将所有的内容作为输入内容传给Scanner；
            也就是说，next()方法并不能返回带空格、Tab键、回车符的字符串，而nextLine可以；
————————————————
版权声明：本文为CSDN博主「qauchangqingwei」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qauchangqingwei/article/details/80803627
            * */
            System.out.print("输入的内容： "+cai);
        }
        a.close();
    }
}
