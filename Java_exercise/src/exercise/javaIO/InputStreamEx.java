package exercise.javaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Projectname: Java_exercise
 * @Filename: InputStreamEx
 * @Author: EdmundXie
 * @Data:2022/9/29 15:40
 * @Email: 609031809@qq.com
 * @Description:
 * FileInputStream 是一个比较常用的字节输入流对象，可直接指定文件路径，可以直接读取单字节数据，也可以读取至字节数组中]
 * skip(long n) ：忽略输入流中的 n 个字节 ,返回实际忽略的字节数。
 * available() ：返回输入流中可以读取的字节数。
 * read() ：返回输入流中下一个字节的数据。返回的值介于 0 到 255 之间。如果未读取任何字节，则代码返回 -1 ，表示文件结束。
 * read(byte b[ ]) : 从输入流中读取一些字节存储到数组 b 中。如果数组 b 的长度为零，则不读取。如果没有可用字节读取，返回 -1。如果有可用字节读取，则最多读取的字节数最多等于 b.length ， 返回读取的字节数。这个方法等价于 read(b, 0, b.length)。
 * *不过，一般我们是不会直接单独使用 FileInputStream ，通常会配合 BufferedInputStream（字节缓冲输入流，后文会讲到）来使用。
 *
 */
public class InputStreamEx {
    public static void main(String[] args) {
        try(InputStream fis = new FileInputStream("input.txt")){
            System.out.println("Number of remaining bytes:" + fis.available());
            byte[] content;
            long skip = fis.skip(2);
            System.out.println("The actual number of bytes skipped:" + skip);
            System.out.println("The content read from file:");
            content = fis.readAllBytes();
            for(byte i : content){
                System.out.println((char)i);
            }
// 新建一个 BufferedInputStream 对象
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("input.txt"));
// 读取文件的内容并复制到 String 对象中
            String result = new String(bufferedInputStream.readAllBytes());
            System.out.println(result);
//            while((content = fis.read()) != -1){
//                System.out.println((char)content);
//            }
        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
