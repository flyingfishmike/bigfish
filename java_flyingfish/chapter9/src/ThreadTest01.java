public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread cai = new MyThread();// 创建新线程的方法，new一个，创建新线程对象
        cai.start();
        /*
        * cai.run();//使用run方法是单线程，不能并发
        * cai.start(); // 产生2个线程，主线程main和分支线程cai，实际的表现：交叉打印主线程和分支线程
        *
        * */
        for (int i = 0;i <= 1000;i++){
            System.out.println("主线程-----> "+i);
        }
    }
}
