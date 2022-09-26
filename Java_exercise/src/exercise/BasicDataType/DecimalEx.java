package exercise.BasicDataType;
/*
float f = 3.4;//错误 双精度数向下转型会造成精度丢失
Java默认小数为双精度数，如要设置但精度要加F，例如3.4F
 */
public class DecimalEx {
    public static void main(String[] args) {
        double d= 3.4F;
        System.out.println(d);
    }
}
