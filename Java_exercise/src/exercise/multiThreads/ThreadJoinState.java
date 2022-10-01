package exercise.multiThreads;

/**
 * @Projectname: Java_exercise
 * @Filename: ThreadJoinState
 * @Author: EdmundXie
 * @Data:2022/10/1 15:00
 * @Email: 609031809@qq.com
 * @Description:
 * t1.join(5000)表示t1抢占5s，正在运行的线程需等5s，状态为timed_waiting；join()不带参数则一直等待到执行完，状态为waiting
 */
public class ThreadJoinState {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(10000L);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                System.out.println("run t1.join(5000L) in t2");
                t1.join(5000L); //t2等t1 5s
                System.out.println("running t1.join() in t2");
                t1.join(); //t2等t1执行完
                System.out.println("t2 finished");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();

        Thread.sleep(1000L);
        System.out.println("Status of t2 " + t2.getState());

        Thread.sleep(5000L);
        System.out.println("Status of t2 " + t2.getState());
    }
}
