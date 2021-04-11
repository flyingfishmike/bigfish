public class ArrayTest02 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();
        Animal[] aa = {a1,a2,a3};
        for (int i = 0;i < aa.length;i++){
            // Animal类型数组使用方法，实例对象使用方法move
            aa[i].move();
        }
    }
}
class Animal{
    public void move(){
        System.out.println("move");
    }
}
