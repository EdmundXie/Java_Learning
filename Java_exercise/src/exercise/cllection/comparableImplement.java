package exercise.cllection;
/*
Comparable用于自比较，重写compareTo；Comparator用于两个对象比较，重写compare，两者都为接口
 */
public class comparableImplement implements Comparable<Integer>{
    public comparableImplement(int x) {
        this.x = x;
    }

    private int x;

    @Override
    public int compareTo(Integer o) {
        return this.x>o?x:o;
    }

    public static void main(String[] args) {
        int y = 0;
        comparableImplement ci = new comparableImplement(1);
        System.out.println(ci.compareTo(y));
    }
}
