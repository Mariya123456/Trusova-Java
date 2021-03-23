package src.trusova.task;

import java.util.Scanner;

public class TaskWork7 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите размер массива");
    int razmer = in.nextInt();
    int X = 2;
    int Y = 7;
    int Z = 3;
    int[] array = new int[razmer];
    for(int i=0; i<razmer; i++){
        System.out.println("Введите значение массива в " + i +" ячейку");
        array[i] = in.nextInt();


        }
    for (int i=0; i<array.length; i++) {
        System.out.println("Элемент массива "+ i +": " + array[i]);
        if (array[i] == X || array[i] == Y || array[i] == Z){
            System.out.println("Данное значение имеется в константах ");
        }
    }
}
}
