package exercise.multiThreads;

/**
 * @Projectname: Java_exercise
 * @Filename: ThreadSynchronizedState
 * @Author: EdmundXie
 * @Data:2022/10/1 16:34
 * @Email: 609031809@qq.com
 * @Description:
 * synchronized 为同步状态，只能有一个线程进入，主线程优先抢到锁
 */
public class ThreadSynchronizedState {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            synchronized (ThreadSynchronizedState.class){
                System.out.println("t1 got the lock");
            }
        });
        synchronized (ThreadSynchronizedState.class){
            t1.start();
            Thread.sleep(1000L);
            System.out.println("t1 can't get the lock " + t1.getState());
        }
    }
}
