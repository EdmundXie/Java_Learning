package exercise.multiThreads;

/**
 * @Projectname: Java_exercise
 * @Filename: SynchronizedDemo
 * @Author: EdmundXie
 * @Data:2022/10/4 17:24
 * @Email: 609031809@qq.com
 * @Description:
 * 主要解决的是多个线程之间访问资源的同步性，可以保证被它修饰的方法或者代码块在任意时刻只能有一个线程执行。
 * 构造方法不能使用Synchronized关键字修饰，因为构造方法本身就线程安全
 * synchronized 关键字最主要的三种使用方式：
 * 修饰实例方法
 * 修饰静态方法
 * 修饰代码块
 */
public class SynchronizedDemo {
    public void method(){
        synchronized (this){ //类加锁
            System.out.println("synchronized code block");
        }
    }
    public synchronized void method1(){} //实例加锁
    public static synchronized void method2(){} //类加锁
}
