public class ThreadTest03 {
    public static void main(String[] args) {
        // 第三种实现方式
        Thread tt = new Thread(new Runnable() {// 线程的匿名内部类实现方式
            @Override
            public void run() {
                for (int i = 0;i <= 1000;i++){
                    System.out.println("分支线程-----> "+i);
                }
            }
        });
        tt.start();
        for (int i = 0;i <= 1000;i++){
            System.out.println("main线程-----> "+i);
        }
    }
}
