package exercise.Reflection;

public class TargetObject {
    private String value;
    public TargetObject(){
        value = "JavaGuide";
    }
    public void publicMethod(String s){
        System.out.println("I love " + s);
    }
    private void privateMethod(){
        System.out.println("value is " + value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
