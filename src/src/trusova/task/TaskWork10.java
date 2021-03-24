package src.trusova.task;

import java.util.Scanner;

public class TaskWork10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк ");
        int x = in.nextInt();
        System.out.println("Введите количество столбцов ");
        int y = in.nextInt();
        int[][] twoDimArray = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Введите элемент строки " + i + " столбца " + j);
                twoDimArray[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < y; i++) {
            System.out.println("элемент массива " + i + " умноженный на 3 = " + (twoDimArray[0][i] * 3));

        }

    }
}
