package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float input = 4200;
        float expectedE = 60;
        float outputE = Converter.rubleToEuro(input);
        boolean passedE = expectedE == outputE;
        float expectedD = 70;
        float outputD = Converter.rubleToDollar(input);
        boolean passedD = expectedD == outputD;
        System.out.println("4200 rubles are 60 euro. Test result : " + passedE);
        System.out.println("4200 rubles are 70 dollar. Test result : " + passedD);
    }
}