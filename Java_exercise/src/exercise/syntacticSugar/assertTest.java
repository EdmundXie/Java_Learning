package exercise.syntacticSugar;
/*
断言 断言为真时继续执行代码，反之中断执行 需要在JVM配置中 -ea 开启断言检查开关，否则回忽略断言
 */
public class assertTest {
    public static void main(String args[]) {
        int a = 10_000;
        int b = 10_000;
        assert a == b;
        System.out.println("公众号：Hollis");
        assert a != b : "Hollis";
        System.out.println("博客：www.hollischuang.com");
    }

}
