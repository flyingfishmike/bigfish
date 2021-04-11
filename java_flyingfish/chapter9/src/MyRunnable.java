public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i <= 1000;i++){
            Thread ct = Thread.currentThread();
            System.out.println(ct.getName()+"分支线程-----> "+i);
        }
    }
}
