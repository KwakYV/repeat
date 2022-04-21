package ru.gb.lesson1;

public class Square extends Figure{
    private int a;
    private int b;
    private int s;
    private int p;

    public Square(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    @Override
    public void square() {
        this.s =  a*b;
    }

    @Override
    public int perimeter() {
        return 2*a + 2*b;
    }

    public int getS() {
        return s;
    }

    public int getP() {
        return p;
    }
}
