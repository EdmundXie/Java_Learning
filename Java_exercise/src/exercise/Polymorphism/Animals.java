package exercise.Polymorphism;


/*
父类构造方法会在子类之前执行
 */
public class Animals {
    public static String Type = "Animals";
    public String name = "animals";
    public static void test(){
        System.out.println("animals static function" + Type);
    }
    public void run(){
        System.out.println("I believe I can run");
    }

}
