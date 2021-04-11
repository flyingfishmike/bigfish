import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy01 {
    public static void main(String[] args) {
        // 使用FileOutputStream和FileInputStream拷贝文件
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("chapter1\\src\\QQ音乐.txt");
            fos = new FileOutputStream("chapter1\\src\\QQ音乐备份.txt");
            byte[] byt = new byte[1024*1024];
            int readCount;
            // 核心代码
            while ((readCount = fis.read(byt)) != -1){
                fos.write(byt,0,readCount);
            }

            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
