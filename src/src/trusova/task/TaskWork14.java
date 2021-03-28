package src.trusova.task;

import java.util.Random;
import java.util.Scanner;

public class TaskWork14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = -20;
        int b = 20;
        byte min,max;
        byte[] mass = new byte[15];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (byte) ((Math.random() * (b - a)) + a);
        }
        min = max = mass[0];
        for (byte x : mass) {
            System.out.print(" " + x + " ");
           min = (byte) Math.min(min,x);
           max = (byte) Math.max(max,x);
        }
        System.out.println();
        System.out.println("Минимальное число = " + min );
        System.out.println("Максимальное число = " + max);
        System.out.println("Наибольшее  число по модулю = " + Math.max(Math.abs(min),Math.abs(max)));
    }
}