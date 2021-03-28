package src.trusova.task;

import java.util.Scanner;

public class TaskWork11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        String stringX;
        int x;
        stringX = in.next();
        System.out.println("Вы ввели число " + stringX);
        x = Integer.parseInt(stringX);
        System.out.println("Введите второе число ");
        int y = in.nextInt();
        int resultInt = Math.max(x, y);
        System.out.println("Максимальное число " + resultInt);
        int resultIntMin = Math.min(x, y);
        System.out.println("Минимальное число " + resultIntMin);
    }
}