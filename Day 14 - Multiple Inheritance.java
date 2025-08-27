interface Dog {
    void bark();
}
interface Cat {
    void meow();
}
class Pet implements Dog, Cat {
    public void bark() {
        System.out.println("Dog barks.");
    }
    public void meow() {
        System.out.println("Cat meows.");
    }
    void play() {
        System.out.println("Pet loves to play.");
    }
}
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Pet myPet = new Pet();

        myPet.bark();  
        myPet.meow(); 
        myPet.play();  
    }
}
