
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();

        System.out.println();

        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();

        System.out.println();

        NoiseCapable dog2 = new Dog();
        dog.makeNoise();
        NoiseCapable cat2 = new Cat("Garfield");
        cat2.makeNoise();
        Cat c = (Cat) cat2;
        c.purr();

    }
}
