

/**
 * @Description: TODO
 * @ClassName: Person
 * @auther: xubin
 * @date: 2020/5/4 下午4:43
 * @Version 1.0
 */
//@Data
public class Person {
    private static int count = 0;
    int id;
    String name;
    int age;

    public Person() {
        id = ++count;
    }

    public String toString() {
        return "Id:" + id + ", Name:" + name + ", Age:" + age;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "zhangsan";
        p1.age = 10;
        Person p2 = new Person();
        p2.name = "lisi";
        p2.age = 12;
        System.out.println(p1);
        System.out.println(p2);
    }

    public void tests(){
        System.out.println("qq");
    }



}