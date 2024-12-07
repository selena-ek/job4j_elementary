package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short heightM = 177;
        double man = Fit.manWeight(heightM);
        short heightW = 165;
        double woman = Fit.manWeight(heightW);
        System.out.println("Man " + heightM + " is " + man);
        System.out.println("Woman " + heightW + " is " + woman);
    }

}