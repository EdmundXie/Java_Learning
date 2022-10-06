package exercise.multiThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Projectname: Java_exercise
 * @Filename: VolatileDemo
 * @Author: EdmundXie
 * @Data:2022/10/4 17:20
 * @Email: 609031809@qq.com
 * @Description:
 * volatile 关键字其实并非是 Java 语言特有的，在 C 语言里也有，它最原始的意义就是禁用 CPU 缓存。
 * 如果我们将一个变量使用 volatile 修饰，这就指示 编译器，这个变量是共享且不稳定的，每次使用它都到主存中进行读取。
 * volatile 关键字能保证数据的可见性，但不能保证数据的原子性。synchronized 关键字两者都能保证。
 *
 * #
 */
public class VolatileDemo {
    public volatile static int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        VolatileDemo volatileAtomicityDemo = new VolatileDemo();
        for (int i = 0; i < 5; i++) {
            threadPool.execute(() -> {
                for (int j = 0; j < 500; j++) {
                    volatileAtomicityDemo.increase();
                }
            });
        }
        // 等待1.5秒，保证上面程序执行完成
        Thread.sleep(1500);
        System.out.println(inc);
        threadPool.shutdown();
    }
}
