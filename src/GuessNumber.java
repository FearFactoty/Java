import java.util.Scanner;

/**
 * Lesson3 GB
 *
 * @author Vladislav Akolzin
 * @version dated 05.07.2021
 */

public class GuessNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ваша задача - угадать число");
        System.out.println("Выберите уровень сложности 1-4");
        System.out.println("1-Новичок. От 0 до 10");
        System.out.println("2-Опытный. От 0 до 20");
        System.out.println("3-Эксперт. От 0 до 50");
        System.out.println("4-Маньяк. От 0 до 100");
        int range = 0;
        int hardness = scanner.nextInt();
        if (hardness == 1){
            range = 10;
            System.out.println("1-Новичок. От 0 до 10");
        }else if (hardness == 2){
            range = 20;
            System.out.println("2-Опытный. От 0 до 20");
        }else if (hardness == 3){
            range = 50;
            System.out.println("3-Эксперт. От 0 до 50");
        }else {range = 100;
            System.out.println("4-Маньяк. От 0 до 100");}
        int number = (int) (Math.random() * range);
        while(true){
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("Вы угадали.");
                break;
            }else if (input_number > number){
                System.out.println("Загаданное число меньше");
            }else
            {System.out.println("Загаданное число больше");
            }
        }
        scanner.close();
    }
}
