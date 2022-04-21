package ru.gb.lesson1;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.sql.SQLOutput;

/**
 *  Здесь сразу ошибка в том, что нет реализации абстрактного метода open(),
 *  поэтому его надо добавить в реализацию в данном классе
 */
public class Lorry extends Car implements Moveable, Stopable {
    @Override
    public void move() {
        System.out.println("Lory car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Lorry car is stop");
    }

    @Override
    void open() {
        System.out.println("Lorry car is open");
    }
}
