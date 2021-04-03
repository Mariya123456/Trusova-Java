package src.trusova.task;

import java.util.Scanner;

public class TaskWorkItog4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result;
        int kolichpopitok;
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает ");
        String otvet = "Заархивированный вирус";
        String podskazka = "Подсказка";
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите ответ ");
            String otvetfact = in.nextLine();
            result = otvetfact.compareToIgnoreCase(podskazka);
            if (result == 0) {
                if (i == 0) {
                    System.out.println("Касперский визжит на него свиньёй ");
                    i = 2;
                } else {
                    System.out.println("Подсказка уже недоступна ");
                }
                System.out.println("Введите ответ ");
                otvetfact = in.nextLine();
            }
            result = otvetfact.compareToIgnoreCase(otvet);
            if (result == 0) {
                System.out.println("Правильно! ");
                break;
            }
            if (i == 2) {
                System.out.println("Обидно, приходи в другой раз ");
            } else {
                System.out.println("Подумай еще! ");
            }
        }
    }
}