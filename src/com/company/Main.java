package com.company;


public class Main {

    public static void main(String[] args) {
        Apartment<Double, Float> d = new Apartment<>(1.5, 1.6f);
        Apartment<Integer, Double> i = new Apartment<>(55, 1.66);
        d.print();
        get(d, d);
        getNumber(i, i);

    }

    public static void get(Apartment<? extends Number, ? extends Number> apartment, Apartment<? extends Number, ? extends Number> apartment2) {
        System.out.println(apartment.getNumber() + " " + apartment2.getNumber2());
    }

    public static void getNumber(Apartment<? extends Number, ? extends Number> apartment, Apartment<? extends Number, ? extends Number> apartment2) {
        System.out.println(apartment.getNumber() + " " + apartment2.getNumber2());
    }
}
