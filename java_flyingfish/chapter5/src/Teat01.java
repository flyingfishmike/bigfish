public class Teat01 {
    public static void main(String[] args) {
        User a= new User("caizhihang",new Address("莆田市","涵江区","111111"));
        User b= new User("caizhihang",new Address("莆田市","涵江区","111111"));
        User c= new User("caizhihang",new Address("莆田","涵江区","111111"));
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        // 父类型引用，指向子类型对象=多态
    }

}
