package src.trusova.task;

import java.util.Scanner;

public class TaskWorkItog1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс доллара ");
        double kurs = in.nextDouble();
        System.out.println("Вы ввели " + kurs);
        System.out.println("Введите количество рублей ");
        int rub = in.nextInt();
        System.out.println("Вы ввели " + rub);
        double itog = rub / kurs;
        String formattedDouble = String.format("%.2f", itog);
        System.out.print("Итого : " + formattedDouble + " долларов");
    }
}
