/**
 * Lesson 1
 *
 * Akolzin Vladislav
 *
 * @dated 13.07.2021
 *
 * Так как первое задание не отображается в выводе, нумерацию заданий в выводе я вел от их отображения в командной строке.
 */
//1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
package Lesson1;

import com.sun.org.apache.xpath.internal.objects.XString;

import javax.management.ValueExp;


public class HomeWorkApp {
    public static void main(String[] args){

//Задание 2.
        printThreeWords("Orange", "Banana", "Apple");
//Задание 3.
        int checksum = checkSumSign(5,17);
        System.out.println(" ");
        System.out.println("Задание 2");
        System.out.println("Сумма переменных = " + checksum);
        if (checksum >= 0) {
            System.out.println("Сумма положительная");
        }  else {System.out.println("Сумма отрицательная");
        }
//Задание 4.
        int color = printColor(77);
        System.out.println(" ");
        System.out.println("Задание 3");
        if (color <= 0){
            System.out.println("Красный");
        } else if (color > 100){
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
//Задание 5.
        int compnum = compareNumbers(27,18);
        System.out.println(" ");
        System.out.println("Задание 4");
        if (compnum > 0){
            System.out.println("a < b");
        } else {
            System.out.println("a => b");
        }

    }
    //2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    public static void printThreeWords(String orange, String banana, String apple) {
        System.out.println("Задание 1");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

/*        3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
        Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
        то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”; */
    public static int checkSumSign(int ValueA, int ValueB){
        return ValueA + ValueB;
    }
    //4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
    //        Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
    //        если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
    //        если больше 100 (100 исключительно) - “Зеленый”;
    public static int printColor(int ValueX){
        return ValueX;
    }
    //5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
    //        и инициализируйте их любыми значениями, которыми захотите.
    //        Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
public static int compareNumbers(int IntA, int IntB){
        return IntB - IntA;
}}
