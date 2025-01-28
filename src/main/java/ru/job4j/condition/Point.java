package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(4, 4, 20, 20);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (10, 7) to (8, 5) " + result2);
    }
}