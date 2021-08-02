package GB;

public class Dog extends Animal {


    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance < 500) {
            System.out.println(name + " пробежал " + distance + " метров");
        } else {
            System.out.println(name + " пробежал 500 метров");
        }
    }
    @Override
    public void swim(int distance) {
        if (distance < 10) {
            System.out.println(name + " проплыл " + distance + " метров");
        } else {
            System.out.println(name + " проплыл 10 метров");
        }
    }
}
