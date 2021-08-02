package GB;

public class Homework6 {
    public static void main(String[] args){
    Animal animal = new Animal();
    Cat barsik = new Cat("Барсик");
    Dog igor = new Dog("Игорь");
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
    barsik.swim(125);
    igor.swim(6000);

    }
}
