package src.trusova.task;

import java.util.Scanner;

public class TaskWorkItog2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение из 5 символов ");
        String arg[] = new String[5];
        int result = 0;
        String uravn = in.nextLine();
        if (uravn.length() == 5) {
            for (int i = 0; i < 5; i++) {
                arg[i] = uravn.substring(i, i + 1);
            }
            if (arg[3].equals("=")) {
                switch (arg[1]) {
                    case "+":
                        if (arg[0].equals("x") && arg[2].matches("^[0-9]") && arg[4].matches("^[0-9]")) {
                            result = Integer.parseInt(arg[4]) - Integer.parseInt(arg[2]);
                        } else if (arg[0].matches("^[0-9]") && arg[2].equals("x") && arg[4].matches("^[0-9]")) {
                            result = Integer.parseInt(arg[4]) - Integer.parseInt(arg[0]);
                        } else if (arg[0].matches("^[0-9]") && arg[2].matches("^[0-9]") && arg[4].equals("x")) {
                            result = Integer.parseInt(arg[0]) + Integer.parseInt(arg[2]);
                        } else {
                            System.out.println("Введены некорректные параметры");
                        }
                        break;
                    case "-":
                        if (arg[0].equals("x") && arg[2].matches("^[0-9]") && arg[4].matches("^[0-9]")) {
                            result = Integer.parseInt(arg[4]) + Integer.parseInt(arg[2]);
                        } else if (arg[0].matches("^[0-9]") && arg[2].equals("x") && arg[4].matches("^[0-9]")) {
                            result = Integer.parseInt(arg[0]) - Integer.parseInt(arg[4]);
                        } else if (arg[0].matches("^[0-9]") && arg[2].matches("^[0-9]") && arg[4].equals("x")) {
                            result = Integer.parseInt(arg[0]) - Integer.parseInt(arg[2]);
                        } else {
                            System.out.println("Введены некорректные параметры");
                        }
                        break;
                    default:
                        System.out.println("Введен знак отличный от + -");
                }
            } else {
                System.out.println("Нет знака = ");
            }
            System.out.println("Результат выполнения уравнения " + result);
        }
    }
}

