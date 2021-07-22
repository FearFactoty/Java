/** Homework2 GB
 *
 * Akolzin Vladislav
 *
 * @dated 22.07.2021
*/

package GB;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println(fromTenToTwenty(1, 8));
        System.out.println(fromTenToTwenty(2, 12));
        System.out.println();
        System.out.println("Задание 2");
        positiveOrNegativ(5);
        positiveOrNegativ(-13);
        System.out.println();
        System.out.println("Задание 3");
        System.out.println(reverse(5));
        System.out.println(reverse(-88));
        System.out.println();
        System.out.println("Задание 4");
        stringCount("Test", 5);
        System.out.println();
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean fromTenToTwenty(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    //положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void positiveOrNegativ(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    //если число отрицательное, и вернуть false если положительное.
    public static boolean reverse(int a) {
        return a < 0;
    }

    //4. Написать метод, которому в качестве аргументов передается строка и число,
    //метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void stringCount(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }

    }
}
