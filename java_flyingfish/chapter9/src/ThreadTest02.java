public class ThreadTest02 {
    public static void main(String[] args) {
        /*
        * 实现线程的第二种方式，编写一个类实现java.lang.Runnable接口
        * */
/*        MyRunnable mr = new MyRunnable();//实现方法
        Thread t = new Thread(mr);
        */
        Thread ct = Thread.currentThread();// 获取当前线程的名称，静态方法
        System.out.println(Thread.currentThread().getName());
        System.out.println(ct.getName());
        Thread t = new Thread(new MyRunnable());// 合并代码
        t.setName("sunShine");// 设置线程的名称，默认名称是Thread-0
        System.out.println(t.getName());// 获取线程的名称
        t.start();// 启动线程
        for (int i = 0;i <= 1000;i++){
            System.out.println(Thread.currentThread().getName()+"主线程-----> "+i);
        }
    }
}
