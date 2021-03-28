package src.trusova.task;

import java.util.Scanner;

public class TaskWork13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        System.out.println("Введите строку ");
        String х = in.nextLine();
        System.out.println("Вы ввели : " + х);
        String[] massiv = х.split(" ");
        for (String line : massiv) {
            if (line.matches("^[a-zA-Z]+$")) {
                System.out.println(line);
                i++;
            }
        }
        System.out.println(i);
    }
}
