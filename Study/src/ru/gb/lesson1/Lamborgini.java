package ru.gb.lesson1;

/**
 * Класс наследуется от абстрактного класса Vehicle и реализует интерфейс Actionable
 * Таким образом получили четкое разделение описание объекта и его поведение.
 */
public class Lamborgini extends Vehicle implements Actionable{
    @Override
    public void open() {
        System.out.println("Lambo is open");
    }

    @Override
    public void start() {
        System.out.println("Lambo has been started");

    }

    @Override
    public void move() {
        System.out.println("Lambo is moving");

    }

    @Override
    public void stop() {
        System.out.println("Lambo has been stopped");

    }
}
