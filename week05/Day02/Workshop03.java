
public class Workshop03 {
    public static void main(String[] args) {
    Animal animal = new Animal();
    Bird bird = new Bird();
    Dog dog = new Dog();

        System.out.println("Testing Animal");
    // how does it speak, sleep, and tell me about its lifeExpectancy and if its a carnivore
        animal.Speak();
        animal.Sleep();
        animal.toString();
        System.out.println("\nTesting Bird");
    // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore
        bird.Speak();
        bird.Sleep();
        bird.Fly();
        bird.toString();

        System.out.println("\nTesting Dog");
    // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
        dog.Speak();
        dog.Sleep();
        dog.Beg();
        dog.toString();
        dog.hasTail();
        System.out.println("\nTesting Dog2");

        Animal dog2 = new Dog();
    // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?
        dog2.Speak();
        dog2.Sleep();

        dog2.toString();

        System.out.println("\nTesting Dog 'd'");
    // how does it speak, sleep, what else it can do and tell me about its lifeExpectancy and if its a carnivore, and what about the tail?

}
}
