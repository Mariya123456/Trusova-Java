package src.trusova.task;

import java.util.Scanner;

public class TaskWork8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int n = in.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                total += i;
            }
        }
        System.out.println("Сумма нечетных чисел от 1 до " + n + " = " + total);
    }
}
