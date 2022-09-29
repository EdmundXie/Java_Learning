package exercise.javaIO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Projectname: Java_exercise
 * @Filename: OutputStreamEx
 * @Author: EdmundXie
 * @Data:2022/9/29 16:10
 * @Email: 609031809@qq.com
 * @Description:
 * OutputStream用于将数据（字节信息）写入到目的地（通常是文件），java.io.OutputStream抽象类是所有字节输出流的父类。
 * FileOutputStream 是最常用的字节输出流对象，可直接指定文件路径，可以直接输出单字节数据，也可以输出指定的字节数组。
 */
public class OutputStreamEx {
    public static void main(String[] args) {
        try(FileOutputStream output = new FileOutputStream("output.txt")){
            byte[] array = "EdmundXieJavaGuide".getBytes();
            output.write(array);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
