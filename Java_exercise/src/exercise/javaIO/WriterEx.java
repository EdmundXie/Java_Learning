package exercise.javaIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @Projectname: Java_exercise
 * @Filename: WriterEx
 * @Author: EdmundXie
 * @Data:2022/9/29 17:12
 * @Email: 609031809@qq.com
 * @Description:
 * Writer用于将数据（字符信息）写入到目的地（通常是文件），java.io.Writer抽象类是所有字节输出流的父类。
 */
public class WriterEx {
    public static void main(String[] args) {
        try (Writer output = new FileWriter("output.txt")) {
            output.write("你好，我是Guide。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
