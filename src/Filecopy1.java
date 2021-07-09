import java.io.*;

public class Filecopy1 {
    public static void main(String[] args) throws IOException {
        File x = new File("D:\\my java\\java1");
        FileReader x1 = new FileReader(x);
        File y = new File("D:\\java1");
        FileWriter y1 = new FileWriter(y);
        char[] b = new char[1024];
        int length = -1;
        while ((length = x1.read(b))!=-1)
            y1.write(b,0,length);
        System.out.println("*");
        y1.close();
        x1.close();
        System.out.println("文件夹复制成功");
    }
}