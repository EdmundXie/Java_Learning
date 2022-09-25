package exercise.SyntacticSugar;
/*
Java语法糖支持 switch和枚举
 */
public class switchString {
    public static void main(String[] args) {
        String str = "world";
        switch (str) {
            case "hello":
                System.out.println("hello");
                break;
            case "world":
                System.out.println("world");
                break;
            default:
                break;
        }
    }
}
//反编译后
//public class switchDemoString
//{
//    public switchDemoString()
//    {
//    }
//    public static void main(String args[])
//    {
//        String str = "world";
//        String s;
//        switch((s = str).hashCode())
//        {
//        default:
//            break;
//        case 99162322:
//            if(s.equals("hello"))
//                System.out.println("hello");
//            break;
//        case 113318802:
//            if(s.equals("world"))
//                System.out.println("world");
//            break;
//        }
//    }
//}

