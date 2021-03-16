package src.trusova.task;

public class TaskWork3 {
    public static void main(String[] args){
    int[] massive = new int[] {1, 2, 3, 4, 5};
    int temp;
    temp = massive[0];
    massive[0] = massive[massive.length-1];
    massive[massive.length-1] = temp;
    int sred = massive.length / 2;
    int sum = massive[0] + massive[sred];
    System.out.println("сумма 0 и "+ (sred)  +" элементов = "+ sum);
    }
}
