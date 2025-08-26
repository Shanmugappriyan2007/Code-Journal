class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}
interface Cat {
    void meow();
}
class Pet extends Dog implements Cat {
    public void meow() {
        System.out.println("Cat meows.");
    }
    void play() {
        System.out.println("Pet loves to play.");
    }
}
public class HybridInheritanceExample {
    public static void main(String[] args) {
        Pet myPet = new Pet();

        myPet.eat();   
        myPet.bark();  
        myPet.meow(); 
        myPet.play();  
    }
}
