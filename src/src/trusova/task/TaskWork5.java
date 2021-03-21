package src.trusova.task;
import java.util.Scanner;
public class TaskWork5 {  public static void main( String[] args ) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите X: ");
    int X= in.nextInt();
    int ITOG = 0;
    System.out.println("Вы ввели X=: " + X);
    System.out.println("Введите Y: ");
    int Y= in.nextInt();
    System.out.println("Вы ввели Y=: " + Y);
    System.out.println("Введите Символ +, -, * или / : ");
    String SIMVOL= in.next();
    System.out.println("Вы ввели Символ =: " + SIMVOL);
    switch(SIMVOL){
        case "+": ITOG = X + Y;
            break;
        case "-": ITOG = X - Y;
            break;
        case "*": ITOG = X * Y;
            break;
        case "/": ITOG = X / Y;
            break;
        default: System.out.println("Вы ввели некорректный знак");
            break;
    }
    System.out.println("ИТОГ =: " + ITOG);
}
}

