//polymorphism
public class Animal {
    public void makeSound(){
        System.out.println("make sound");
    }
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("meow");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("woof");
    }
}

class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}