package GB;

public class Animal {
    String name;
    String color;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
        this.color = color;
    }

    public void animalInfo(String name) {
        System.out.println("Животное: " + name);
    }

    public void run(int distance) {
        System.out.println(name  + " пробежал " + distance + " метров");
    }

    public void swim(int distance) {
        System.out.println(name  + " проплыл " + distance + " метров");
    }

}
