import java.io.*;
import java.lang.reflect.Type;

public class Filecopy {
    public static void main(String[] args) throws IOException {
        File i=new File("D:\\my java\\java1\\MESS.java");
        FileInputStream i1=new FileInputStream(i);
        File j=new File("D:\\MESS.java");
        FileOutputStream j1= new FileOutputStream(j);
        byte[] a= new byte[1024];
        //6、读写操作 （抽水送水）
        int length=-1;//默认读取长度为-1
        while((length=i1.read(a))!=-1){
            j1.write(a,0,length);
            System.out.println("*");
            //从b数组中，第一个元素开始，取length长度的元素输出
        }

        //7、关闭流（关闭水管）
        j1.close();
        i1.close();
        System.out.println("文件复制成功");
    }
}
