package exercise.StringEx;

/**
 * 字符串常量值J
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "str";
        String str2 = "ing";
        String str3 = "str" + "ing";
        String str4 = str1 + str2;
        String str5 = "string";
        System.out.println(str3 == str4); //str1与str2为变量 无法折叠 False
        System.out.println(str3 == str5); //编译时常量折叠 True
        System.out.println(str5 == str4); //False
    }
}
