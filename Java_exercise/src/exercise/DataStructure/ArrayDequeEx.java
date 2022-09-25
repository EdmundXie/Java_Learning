package exercise.DataStructure;
/*
ArrayDeque
* 内部用Object[]数组+双指针实现双端队列
* 不支持存储Null型数据
* 插入操作分摊后时间复杂度O(1)
* 也可以用于实现栈，虽然都实现了Deque接口，性能比LinkedList要好
* 默认从队尾加入，从队头删除
 */
import java.util.ArrayDeque;

public class ArrayDequeEx {
    public static void main(String[] args){
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(100);
        deque.add(50);
        deque.removeFirst();
        System.out.println(deque);
    }
}
