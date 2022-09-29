package exercise.javaIO;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Projectname: Java_exercise
 * @Filename: ReaderEx
 * @Author: EdmundXie
 * @Data:2022/9/29 17:12
 * @Email: 609031809@qq.com
 * @Description:
 * Reader用于从源头（通常是文件）读取数据（字符信息）到内存中，java.io.Reader抽象类是所有字符输入流的父类。
 * Reader 用于读取文本， InputStream 用于读取原始字节。
 * Reader 常用方法 ：
 * read() : 从输入流读取一个字符。
 * skip(long n) ：忽略输入流中的 n 个字符 ,返回实际忽略的字符数。
 * 用来读字符 不会有乱码问题 但速度较慢
 * // 字节流转换为字符流的桥梁
 * public class InputStreamReader extends Reader {
 * }
 * // 用于读取字符文件
 * public class FileReader extends InputStreamReader {
 * }
 */
public class ReaderEx {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("input.txt")){
            int content;
            long skip = fileReader.skip(3);
            System.out.println("The actual number of bytes skipped:" + skip);
            System.out.print("The content read from file:");
            while ((content = fileReader.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
