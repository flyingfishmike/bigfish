public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        //方法1
        char c1 = s1.charAt(2);//返回指定下标的char值
        System.out.println(c1);
        //方法2
        //字符之间没有大小，需要用compareTo方法，返回1-25直接的数字，compare方法判断大小，但是equals只能判断相不相等
        String s2 = "10";
        System.out.println(s2.compareTo("23"));//-1
        System.out.println(s2.compareTo("10"));//0
        System.out.println(s2.compareTo("4"));//-3 ,比较第一位不相等就输出，不判断后面的
        //方法3
        //contain 判断前面的字符串是否包含后面的字符串，返回boolean
        String s3  ="caizhihang";
        System.out.println(s3.contains("zhi"));

        //方法4，endsWith，判读字符串以什么结尾，返回boolean
        String s4 = "caizhihang.txt";
        String s5 = "caizhihang.java";
        System.out.println(s4.endsWith(".txt"));//ture
        System.out.println(s5.endsWith(".txt"));//false
        //方法5,比较2个字符串必须使用equals方法，不能使用“==”。判断2个字符串是否相等，返回boolean
        /*
        *equals方法调用了compareTo方法
        *equals方法只能看出相不相等
        *
        *  */
        System.out.println("abc".equals("abc"));
        //方法6,compareToIgnoreCase判断2个字符串是否相等忽略大小写，返回boolean
        String c6 = "ABC";
        String c7 = "abc";
        System.out.println(c6.compareToIgnoreCase(c7));
        //方法1
        //方法1
        //方法1
        //方法1
        s1.substring(2,4);

    }
}
