package GB;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args){

//        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Задание 1");
        int[] zeroAndOne = {1, 1, 0, 1, 0, 1, 1, 0, 1, 0};
        for (int i = 0; i < zeroAndOne.length; i++) {
        if (zeroAndOne[i] == 1){
            System.out.print("0 ");
        }else {System.out.print("1 ");}}
        System.out.println();

//        2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        System.out.println("Задание 2");
        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            hundred[i] = i + 1;
            System.out.print(hundred[i] + " ");
        }
        System.out.println();

//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("Задание 3");
        int[] biggerSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < biggerSix.length; i++) {
            if (biggerSix[i] < 6) biggerSix[i] *= 2;
        }System.out.print(Arrays.toString(biggerSix));
        System.out.println();
//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//        Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        System.out.println("Задание 4");
        int[][] diag = new int[9][9];
        for (int i = 0; i < diag.length; i++) {
            for (int j = 0; j < diag[i].length; j++) {
                if(i == j || i + j == 8){ diag[i][j] = 1;
            } else{diag[i][j] = 0;}
                System.out.print(diag[i][j] + "\t");
        }System.out.println();
        }
        System.out.println();
//        5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
//        каждая ячейка которого равна initialValue;
        System.out.println("Задание 5");
        System.out.print(Arrays.toString(oneLineMassive(8,666)));
        System.out.println();
    }
    // Задание 5
    public static int[] oneLineMassive (int len, int initialValue){
        int[] oneLineMas = new int[len];
        for (int i = 0; i < len; i++) {
            oneLineMas[i] = initialValue;
        }
        return oneLineMas;
    }

}
