package GB;

import java.util.Random;

import java.util.Scanner;

public class Homework4 {

    public static int mapSize = 3;
    public static final char emptySlot = '•';
    public static final char playerSlot = 'X';
    public static final char computerSlot = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(playerSlot)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(computerSlot)) {
                System.out.println("Вы проиграли!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static boolean checkWin(char fullSlot) {
        for (int i = 0; i < 3; i++)
            if ((map[i][0] == fullSlot && map[i][1] == fullSlot &&
                    map[i][2] == fullSlot) ||
                    (map[0][i] == fullSlot && map[1][i] == fullSlot &&
                            map[2][i] == fullSlot))
                return true;
        if ((map[0][0] == fullSlot && map[1][1] == fullSlot &&
                map[2][2] == fullSlot) ||
                (map[2][0] == fullSlot && map[1][1] == fullSlot &&
                        map[0][2] == fullSlot))
            return true;
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (map[i][j] == emptySlot) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(mapSize);
            y = rand.nextInt(mapSize);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = computerSlot;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = playerSlot;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= mapSize || y < 0 || y >= mapSize) return false;
        if (map[y][x] == emptySlot) return true;
        return false;
    }
    public static void initMap() {
        map = new char[mapSize][mapSize];
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = emptySlot;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= mapSize; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < mapSize; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < mapSize; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}