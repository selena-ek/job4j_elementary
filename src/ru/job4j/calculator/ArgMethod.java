package ru.job4j.calculator;

public class ArgMethod {

    public static void hello(String name,String Name, String nAme) {
        System.out.println("Hello," + name + "." + " Hello, " + Name + "." + " Hello, " + nAme + ".");
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + " age " + age);
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void hello(int age) {
        System.out.println(age);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello(name);

        ArgMethod.hello(name,age);

        ArgMethod.hello(age);

        ArgMethod.hello(name,name,name);
    }
}