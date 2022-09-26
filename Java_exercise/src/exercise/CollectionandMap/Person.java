package exercise.CollectionandMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Projectname: Java_exercise
 * @Filename: Person
 * @Author: EdmundXie
 * @Data:2022/9/26 15:46
 * @Email: 609031809@qq.com
 * @Description:
 * TreeMap 有排序能力，传入一个comparator就行
 */
public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
//        Map<Person,String> treemap = new TreeMap<>((Person p1,Person p2) -> {
//            int num = p1.getAge() - p2.getAge();
//            return Integer.compare(num,0);
//        });
        Map<Person,String> treemap = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int num  = o1.getAge()-o2.getAge();
                return Integer.compare(num,0);
            }
        });
        treemap.put(new Person(16),"Alice");
        treemap.put(new Person(18),"Anthony");
        treemap.put(new Person(15),"Nia");
        treemap.put(new Person(23),"Edmund");
        treemap.entrySet().stream().forEach(personStringEntry -> {
            System.out.println(personStringEntry.getValue());
        });
    }
}
