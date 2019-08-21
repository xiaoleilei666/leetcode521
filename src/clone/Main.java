package clone;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(23, "zhangsan");
        Person person1 = person;
        System.out.println(person);
        System.out.println(person1);
    }
}
