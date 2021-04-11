public class Test01 {
    public static void main(String[] args) {
        Cat jack = new Cat("mike");
        jack.CatchMouse();
        jack.run();
//        Cat heimao  = new Animal();这个编译不通过
        Animal heimao = new Cat();
        heimao.run();
        // heimao.CatchMouse方法用不了
        System.out.println("======");
        Animal b = new Cat();
        if (b instanceof Cat){ // b这个引用指向的对象是一个Cat类型； b是一个名为Cat类的实例
            Cat baimao = (Cat)b;// 从右到左变小，是向下转型，强制类型转换（Animal-->Cat）
            baimao.CatchMouse();
        }else if(b instanceof Fish){
            Fish yu = (Fish)b;
            yu.Swimming();
        }
/*        Cat baimao = (Cat)b;
        baimao.CatchMouse();*/
    }
}
