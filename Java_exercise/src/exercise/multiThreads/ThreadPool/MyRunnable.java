package exercise.multiThreads.ThreadPool;

import java.util.Date;

/**
 * @Projectname: Java_exercise
 * @Filename: ThreadPool
 * @Author: EdmundXie
 * @Data:2022/10/6 17:42
 * @Email: 609031809@qq.com
 * @Description:
 * 《阿里巴巴 Java 开发手册》中强制线程池不允许使用 Executors 去创建，而是通过 ThreadPoolExecutor 的方式，这样的处理方式让写的同学更加明确线程池的运行规则，规避资源耗尽的风险
 *
 * Executors 返回线程池对象的弊端如下：
 *
 * FixedThreadPool 和 SingleThreadExecutor ： 允许请求的队列长度为 Integer.MAX_VALUE ，可能堆积大量的请求，从而导致 OOM。
 * CachedThreadPool 和 ScheduledThreadPool ： 允许创建的线程数量为 Integer.MAX_VALUE ，可能会创建大量线程，从而导致 OOM。
 *
 * 创建线程的方法：
 * 1. 通过构造方法ThreadPoolExecutor实现 //推荐
 * 2. 通过Executor框架的工具类Excutors来实现
 * 我们可以创建三种类型的 ThreadPoolExecutor：
 *
 * FixedThreadPool ： 该方法返回一个固定线程数量的线程池。该线程池中的线程数量始终不变。
 * 当有一个新的任务提交时，线程池中若有空闲线程，则立即执行。若没有，则新的任务会被暂存在一个任务队列中，待有线程空闲时，便处理在任务队列中的任务。
 *
 * SingleThreadExecutor： 方法返回一个只有一个线程的线程池。
 * 若多余一个任务被提交到该线程池，任务会被保存在一个任务队列中，待线程空闲，按先入先出的顺序执行队列中的任务。
 *
 * CachedThreadPool： 该方法返回一个可根据实际情况调整线程数量的线程池。
 * 线程池的线程数量不确定，但若有空闲线程可以复用，则会优先使用可复用的线程。
 * 若所有线程均在工作，又有新的任务提交，则会创建新的线程处理任务。所有线程在当前任务执行完毕后，将返回线程池进行复用。
 */
public class MyRunnable implements Runnable{
    private String command;
    public MyRunnable(String s){
        this.command = s;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "Start.Time = " + new Date());
        processCommand();
        System.out.println(Thread.currentThread().getName()+ "End.Time = " + new Date());
    }
    private void processCommand(){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public String toString(){
        return this.command;
    }

}
