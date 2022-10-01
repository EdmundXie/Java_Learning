package exercise.multiThreads;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @Projectname: Java_exercise
 * @Filename: MultiThread
 * @Author: EdmundXie
 * @Data:2022/9/30 18:10
 * @Email: 609031809@qq.com
 * @Description:
 * Java 程序天生就是多线程程序,从下面的输出内容可以看出：一个 Java 程序的运行是 main 线程和多个其他线程同时运行。
 * Thread运行时有6个状态：
 * New：初始状态，线程被创建出来但没有被调用 start() 。
 * Runnable：运行状态，线程被调用了 start()等待运行的状态。
 * Waiting：等待状态，表示该线程需要等待其他线程做出一些特定动作（通知或中断）。
 * Timed_Waiting：超时等待状态，可以在指定的时间后自行返回而不是像 WAITING 那样一直等待。
 * Blocked：阻塞状态，需要等待锁释放。
 * Terminated：终止状态，表示该线程已经运行完毕。
 */
public class MultiThread {
    public static void main(String[] args) {
        // 获取 Java 线程管理 MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的 monitor 和 synchronizer 信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        // 遍历线程信息，仅打印线程 ID 和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.getThreadName());
        }
    }
}
