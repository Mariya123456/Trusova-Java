package src.trusova.task;

import java.util.Scanner;

public class TaskWorkItog3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк ");
        int kolichestvo = in.nextInt();
        int itog = 0;
        int indexmax = 0;
        int sumsim[] = new int[kolichestvo];
        String arg[] = new String[kolichestvo];
        in.nextLine();
        for (int i = 0; i < kolichestvo; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            arg[i] = in.nextLine();
        }
        for (int x = 0; x < arg.length; x++) {
            String stroka = arg[x];
            for (int i = 0; i < stroka.length(); i++) {
                String sim = stroka.substring(i, i + 1);
                for (int j = i; j < stroka.length(); ) {
                    if (++j == stroka.length()) {
                        itog++;
                        break;
                    }
                    if (sim.equals(stroka.substring(j, j + 1))) {
                        break;
                    }
                }
            }
            sumsim[x] = itog;
            itog = 0;
        }
        for (int i = 0; i < arg.length; i++) {
            System.out.println("Строка " + arg[i] + " количество разных символов " + sumsim[i]);
        }
        for (int i = 0; i < sumsim.length; i++) {
            if (sumsim[i] > sumsim[indexmax]) {
                indexmax = i;

            }
        }
        System.out.println("Строка " + arg[indexmax] + " Содержит максимальное количество разных символов : " + sumsim[indexmax]);
    }
}