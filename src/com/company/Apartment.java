package com.company;

import java.util.Scanner;

public class Apartment<E, F extends Number> implements Printable<E> {
    E number;
    F number2;

    public E getNumber() {
        return number;
    }

    public void setNumber(E number) {
        this.number = number;
    }

    public F getNumber2() {
        return number2;
    }

    public void setNumber2(F number2) {
        this.number2 = number2;
    }

    public Apartment(E number, F number2) {
        this.number = number;
        this.number2 = number2;
    }



    @Override
    public E print() {
        return number;
    }
}
