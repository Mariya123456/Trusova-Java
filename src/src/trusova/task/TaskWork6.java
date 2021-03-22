package src.trusova.task;

import java.util.Scanner;

public class TaskWork6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int vibor = in.nextInt();
        double chislo;
        System.out.println("Вы ввели" + vibor);
        if (vibor == 1) {
            System.out.println("Введите единицу измерения: 1 - кг, 2 - граммы");
        }
        else {
            System.out.println("Введите единицу измерения: 1 - метр, 2 - км");
        }
        int izmerenie = in.nextInt();
        System.out.println("введите число = " );
        chislo = in.nextDouble();

        switch (vibor){
            case 1: switch (izmerenie) {
                case 1:
                    System.out.println("Результат");
                    System.out.println("Килограммы " + chislo);
                    System.out.println("Граммы " + (chislo * 1000));
                    break;
                case 2:
                    System.out.println("Результат");
                    System.out.println("Килограммы " + chislo / 1000);
                    System.out.println("Граммы " + (chislo));
                    break;
                default:
                    System.out.println("Введен не верный вариант");
                    break;
            }
            break;
            case 2: switch (izmerenie) {
                case 1:
                    System.out.println("Результат");
                    System.out.println("Метры " + chislo);
                    System.out.println("Километры " + (chislo / 1000));
                    break;
                case 2:
                    System.out.println("Результат");
                    System.out.println("Метры " + chislo * 1000);
                    System.out.println("Километры " + (chislo));
                    break;
                default:
                    System.out.println("Введен не верный вариант едениц измерения");
                    break;
            }
            break;
            default:
                System.out.println("Введен не верный вариант");
                break;
            }
        }

    }

