package exercise.SyntacticSugar;
/*
泛型类的静态变量与所有实例共享
 */
public class StaticTest{
    public static void main(String[] args){
        GT<Integer> gti = new GT();
        gti.var=1;
        GT<String> gts = new GT();
        gts.var=2;
        System.out.println(gti.var);
    }
}
class GT<T>{
    public static int var=0; //
    public void nothing(T x){}
}
