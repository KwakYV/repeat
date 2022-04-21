package ru.gb.lesson1;

public class Test {
    public static void main(String[] args) {
        Figure square = new Square(4, 4);
        square.square();
        System.out.println("Square - " + ((Square)square).getS());
        System.out.println("Perimeter - " + square.perimeter());
    }
}
