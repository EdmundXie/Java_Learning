package exercise.Polymorphism;
/*
***
类加载过程：
1. 将类信息加载在内存中（类信息在方法栈，动态分配的对象在堆，局部变量在栈）
2. 给静态变量赋默认值
3. 加载父类
4. 设置父子关系
5. 执行类的初始化代码
***
创建类实例过程：
1. 将类实例加载在内存中
2. 给实例变量赋默认值
3. 执行实例初始化代码（从父类开始到子类）
***
* 针对 Animal animal = new Bird();这样的代码：
* 编译器检查有哪些方法存在的是Animal的静态类型
* 执行时重写的实例方法执行看Bird()实例类型；实例变量，静态变量和方法若重写则有两个，具体为哪个看Animal的静态类型
 */

public class Main {
    public static void main(String[] args) {
        Birds b = new Birds();
        Animals a = b;
        System.out.println(b.name);
        b.test();
        System.out.println(a.name);
        a.test();
        b.run();
        a.run();
    }
}
