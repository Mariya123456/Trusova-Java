package src.trusova.task;

import java.util.Scanner;

public class TaskWork12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "I like Java!!!";
        System.out.println(a);
        if (a.contains("Java")) {
            if (a.startsWith("I like")) {
                if (a.endsWith("!!!")) {
                    String result = a.toLowerCase();
                    System.out.println(result);
                    String resultA = a.replace("a",  "o");
                   String jovo = resultA.substring(7, 11);
                    System.out.println(jovo);
                }
            }
        }
    }
}
