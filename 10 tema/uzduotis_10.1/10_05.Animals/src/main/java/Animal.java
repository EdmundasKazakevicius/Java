
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println(name + " sleeps");
    }

    void eat() {
        System.out.println(name + " eats");

    }

    public String getName() {
        return name;
    }
}
