public class ArrayTest03 {
    public static void main(String[] args) {
        // 数组拷贝
        int[] a = {1,2,3,4,5};
        int[] b = new int[43];
        System.arraycopy(a,1,b,3,4);
        // a 想要拷贝的数组，b ：把a拷到b里。srcPos是a的第一位，destPos是b的索引，length是拷贝的长度
        for (int i = 0;i < b.length;i++){
            System.out.print(b[i] +" ");
        }
    }
}
