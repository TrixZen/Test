package main;

public class Main {
    public static void main(String[] args) {
        Print.printer("Hello world");
        System.out.println(Main.calculateSum(5, 10));
        System.out.println(Main.calculateSum(7, 15));
    }
    private static int calculateSum(int a, int b) {
        return a + b ;
    }
}
