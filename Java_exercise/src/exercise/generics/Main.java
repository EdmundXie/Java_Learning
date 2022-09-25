package exercise.Generics;

public class Main {
    public static <T> void printArray(T[] inputArray){
        for(T element: inputArray){
            System.out.println(element);
        }
    }
    public static void main(String[] args){
        GenericClass<Integer> GC = new GenericClass<>(3456);
        GenericImplement GI = new GenericImplement();
        int[] a = {1,3,2,4,5};
        char[] b = "asdasoijgs".toCharArray();

        printArray(new Integer[]{1,3,2,4,5});
        printArray(new String[]{"a","d","c","oo"});
        //printArray(a) or printArray(b)不可用，因为静态泛型方法优先类的实例化
//        System.out.println(GI.method2());
//        System.out.println(GC.value);
    }

}
