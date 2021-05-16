public class IntegerTest01 {
    public static void main(String[] args) {
        // 手动装箱
        Integer x = new Integer(123);
        //手动拆箱
        int y = x.intValue();
        System.out.println(y);

        Integer a = new Integer("23");

//        Integer b = new Integer("中文");// NumberFormatException 数字格式化异常
        //重点方法
        //static int pareInt(String a)
        //静态方法，传参String，返回int
        int aReturn = Integer.parseInt("1234");// String -转换-》int
        System.out.println(aReturn+222);

    }
}
