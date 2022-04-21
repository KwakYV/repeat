package ru.gb.lesson1;

/**
 *  Интерфейс, описывающие действия проводимые над объектом Car
 */
public interface Actionable {
    void open();
    void start();
    void move();
    void stop();
}
