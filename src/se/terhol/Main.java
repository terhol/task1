package se.terhol;

/**
 * @author Tereza Holm
 */
public class Main {

    public static void main(String[] args) {

        Memory memory1 = new Memory(1000);
        Memory memory2 = new Memory(800);
        Task task1 = new Task(500);
        Task task2 = new Task(600);
        Task task3 = new Task(700);

        memory1.allocate(task1);
        memory1.allocate(task2);
        memory2.allocate(task1);
        memory2.allocate(task3);

        System.out.println(memory1.toString());
        System.out.println(memory2.toString());
        System.out.println(task1.toString());
        System.out.println(task2.toString());
        System.out.println(task3.toString());
    }
}
