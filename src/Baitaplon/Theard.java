package Baitaplon;

public class Theard {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.setPriority(1);
        System.out.println(t.getPriority());
    }
}
