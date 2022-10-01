package exercise.multiThreads;

/**
 * @Projectname: Java_exercise
 * @Filename: ThreadSleepState
 * @Author: EdmundXie
 * @Data:2022/10/1 14:44
 * @Email: 609031809@qq.com
 * @Description:
 * 主线程与创建的线程分开执行，互不干扰
 * sleep(1000)表示等待1s，状态为timed_waiting；
 * 区别于wait() 将使线程出锁
 */
public class ThreadSleepState {
    static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            try{
                while (running){
                    System.out.println("t1 running is false, t1 will sleep");
                    Thread.sleep(10000L);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        System.out.println("new t1, status of t1: " + t1.getState()); // new
        t1.start();
        Thread.sleep(2000L);
        running = false;
        Thread.sleep(2000L);
        System.out.println("t1.sleep() status: " + t1.getState()); //timed_waiting
    }
}
