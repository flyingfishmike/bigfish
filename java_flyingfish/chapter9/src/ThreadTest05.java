public class ThreadTest05 {
    public static void main(String[] args) {
        Thread cai = new MyThread();
        cai.setName("wind");
        cai.start();
        try {
            cai.sleep(1000*5);// 让main线程睡眠5秒，不会让分支线程睡眠，sleep方法是静态方法，虽然用引用对象调用。实际还是类名调用
            // 等于Thread.sleep
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("离离原上草");
    }
}
