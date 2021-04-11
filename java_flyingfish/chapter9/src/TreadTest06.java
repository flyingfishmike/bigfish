public class TreadTest06 {
    public static void main(String[] args) {
        Thread aa = new Thread(new MyRunnable2());
        aa.setName("caizhi");
        aa.start();
        try {
            aa.sleep(1000*3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        aa.interrupt();
    }
}
