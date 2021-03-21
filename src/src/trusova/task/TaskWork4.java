package src.trusova.task;
import java.util.Scanner;
public class TaskWork4 {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите X: ");
        int X= in.nextInt();
        System.out.println("Вы ввели X=: " + X);
        System.out.println("Введите Y: ");
        int Y= in.nextInt();
        System.out.println("Вы ввели Y=: " + Y);
        System.out.println("Введите Z: ");
        int Z= in.nextInt();
        System.out.println("Вы ввели Z=: " + Z);
        int SREDNEE = (X + Y + Z)/3;
        System.out.println("Среднее арифметическое =: " + SREDNEE);
        int DELENIE = SREDNEE/2;
        System.out.println("Деление на 2 =: " + DELENIE);
        if (DELENIE > 3) { System.out.println("Программа выполнена корректно");
        }
        }
    }
