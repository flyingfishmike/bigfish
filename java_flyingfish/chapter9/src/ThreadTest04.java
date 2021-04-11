public class ThreadTest04 {
    public static void main(String[] args) {
        for (int i =0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"------->"+i);
            try {
                Thread.sleep(1000);// 使用Thread类名调用
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
