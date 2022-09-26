package exercise.Polymorphism;

public class Birds extends Animals{
    public static String Type = "Birds";
    @Override
    public void run(){
        System.out.println("Actually I can fly!");
    }
}
