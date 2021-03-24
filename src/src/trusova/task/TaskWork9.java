package src.trusova.task;

import java.util.Scanner;

public class TaskWork9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = in.nextInt();
        double summa = 0;
        double srednee = 0;
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент массива " + i);
            array[i] = in.nextDouble();
        }
        for (double x : array) {
            summa = x + summa;
        }
        srednee = summa / n;
        System.out.println("среднее арифметическое элементов массива = " + srednee);
        for (double x : array) {
            System.out.println("умножение элемента массива на среднее арифметическое = " + (x * srednee));
        }
    }
}


