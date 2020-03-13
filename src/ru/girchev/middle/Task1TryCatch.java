package ru.girchev.middle;

public class Task1TryCatch {

    // What will be printed?
    public static void main(String[] args) {
        tryCatchReturn();
        tryCatchSystemExit();
    }

    public static void tryCatchReturn() {
        try {
            System.out.println("Try return");
            return;
        } catch (RuntimeException e) {
        } finally {
            System.out.println("Finally after return");
        }
    }

    public static void tryCatchSystemExit() {
        try {
            System.out.println("Try exit");
            System.exit(0);
        } catch (RuntimeException e) {
        } finally {
            System.out.println("Finally after Exit not executed");
        }
    }
}
