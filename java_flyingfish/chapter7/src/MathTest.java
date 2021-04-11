public class MathTest {
    public static void main(String[] args) {
        Mymath a = new Mymath();
        // 不使用匿名内部类
        a.mySum(new ComputeImpl(),110,200);

        Mymath mm = new Mymath();
        // 使用匿名内部类
        mm.mySum(new Compute() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        },10,22);
    }
}
