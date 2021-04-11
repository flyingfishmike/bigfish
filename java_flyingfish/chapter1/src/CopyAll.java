import java.io.*;

public class CopyAll {
    public static void main(String[] args) {
        // 拷贝源
        File srcFile = new File("D:\\Java_practice");
        // 拷贝目标
        File destFile = new File("D:\\文件拷贝练习\\");
        // 调用方法拷贝
        copyDir(srcFile,destFile);

    }/*
    拷贝目录
    srcFile 拷贝源
    destFile 拷贝目标
    */

    private static void copyDir(File srcFile, File destFile) {
        if (srcFile.isFile()){
            // 如果srcFile是文件的话，递归结束
            FileInputStream in  = null;
            FileOutputStream out  = null;
            try {
                in = new FileInputStream(srcFile);
                String path = destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath()+"\\"
                        +srcFile.getAbsolutePath().substring(3);
                /*
                * System.out.println(destFile.getAbsolutePath());
                * D:\文件拷贝练习
                * System.out.println(srcFile.getAbsolutePath());
                * D:\Java_practice\1notepad++\HelloWorld.java
                * System.out.println(srcFile.getAbsolutePath().substring(3));
                * Java_practice\1notepad++\HelloWorld.java
                * System.out.println(path);
                * D:\文件拷贝练习\Java_practice\1notepad++\HelloWorld.java
                * */
                out = new FileOutputStream(path);
                // 一边读，一边写
                byte[] byt = new byte[1024 * 1024];// 一次复制1M
                int readCount = 0;
                while ((readCount=in.read(byt)) != -1){
                    out.write(byt,0,readCount);// 读了多少写多少
                }
                out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (out != null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        //获取源下面的子目录
        File[] files = srcFile.listFiles();
        for (File wenjian : files){
            // 获取所有文件的的绝对路径
//            System.out.println(wenjian.getAbsolutePath());
            // 递归调用
            if (wenjian.isDirectory()){
                //新建文件夹
//                System.out.println(wenjian.getAbsolutePath());
                String srcDir = wenjian.getAbsolutePath();
                /*
                System.out.println(srcDir.substring(3));
                Java_practice\.git\hooks
                System.out.println(destDir);  拼接后的结果如下
                D:\文件拷贝练习\Java_practice\hooks
                * */
                String destDir = destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath()+"\\"
                        +srcDir.substring(3);// subString(3)去掉前3个字符
                File newFile = new File(destDir);
                if(!newFile.isDirectory()){
                    newFile.mkdirs();
                }
            }
            copyDir(wenjian,destFile);
        }
    }
}
