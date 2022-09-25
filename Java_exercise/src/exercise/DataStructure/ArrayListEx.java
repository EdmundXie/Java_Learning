package exercise.DataStructure;
/*
ArrayList
* 用Object[]数组存储，末尾加元素O(1)
* 快速查找元素：根据index访问元素O(1)
* 实现了RandomAccess接口，不含任何操作，只是支持快速随机访问的标识
* 比LinkedList性能好
* 内存空间占用：会在结尾留一定空间
*** 扩容机制
首先创建一个elementData数组，第一次加入元素时扩至10，若后续不够扩至原容量1.5倍，还不够就是用需要长度作为elementData数组的长度，
为防止溢出，如果扩容后容量大于Integer.Max_Value-8，将所需容量与Integer.Max_Value-8比较，若大于，扩容后容量为Integer.Max_Value,
不大于则为Integer.Max_Value-8
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        System.out.println(list.get(3));
    }
}
