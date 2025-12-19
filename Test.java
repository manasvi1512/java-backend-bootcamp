//inheritance
class Animal{
    String name;
    String age;
}
class Cat extends Animal{
    String breed;
}

public class Test extends Cat{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Bob";
    }
}