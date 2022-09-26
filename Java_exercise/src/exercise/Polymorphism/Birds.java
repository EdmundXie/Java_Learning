package exercise.Polymorphism;

public class Birds extends Animals{
    public static String Type = "Birds";
    public String name = "Kiwi";
    public static void test(){
        System.out.println("birds static function" + Type);
    }
    @Override
    public void run(){
        System.out.println("Actually I can fly!");
    }
}
