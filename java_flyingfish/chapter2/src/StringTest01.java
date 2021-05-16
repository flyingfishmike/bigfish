public class StringTest01 {
    public static void main(String[] args) {
        //字符串的构造方法
        //第一种
        String a = "hello";
        //第二种
        byte[] by = {97,98,99};// 97是a，98是b，99是c
        String b = new String(by);//abc
/*      输出一个引用的时候，会自动调用toString方法，默认Object的话，自动输出内存地址
        String 类已经重写了toSting（）方法
        输出字符串对象，输出不是对象的内存地址，而是字符串本身
               */
        System.out.println(b);
        //第三种
        byte[] bytes = {97,98,99,97,98,99,97,98,99};
        String c = new String(bytes, 2,5);// cabca
        System.out.println(c);
        //第四种
        char[] c1 = {'离','离','原','上','草','。'};
        String d = new String(c1);
        String s1 = new String(c1,1,3);
        System.out.println(d);
        System.out.println(s1);

    }
}
