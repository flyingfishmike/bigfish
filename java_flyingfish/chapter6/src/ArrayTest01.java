public class ArrayTest01 {
    public static void main(String[] args) {
        // 遍历二维数组
        int[][] arrays  = new int[3][4];
        for(int i = 0;i < arrays.length; i++){
            for(int j = 0;j <arrays[i].length;j++){
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
        // 匿名数组的语法
        printArray(new int[][]{{1,2,3,4},{5,6,7,8,},{9,10,11,12}});
    }
    public static void printArray(int[][] arrays){
        for(int i = 0;i < arrays.length; i++){
            for(int j = 0;j <arrays[i].length;j++){
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }

}
