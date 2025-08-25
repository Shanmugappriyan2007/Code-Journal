class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof Woof!");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows: Meow Meow!");
    }
}
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.eat();  
        d.bark(); 
        Cat c = new Cat();
        c.eat();  
        c.meow();  
    }
}
