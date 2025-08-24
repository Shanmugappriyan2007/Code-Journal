class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   
        d.walk();  
        d.bark();  
    }
}
