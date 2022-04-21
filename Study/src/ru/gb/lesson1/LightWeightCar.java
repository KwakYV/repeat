package ru.gb.lesson1;

public class LightWeightCar extends Car implements Moveable{
    @Override
    void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    /**
     * Данную машину можно открыть, завети и даже поехать, но вот остановиться на ней нельзя,
     * так как она не реализует интерфейс Stopable
     * В целом не имеет смысла разделять действия над объектам по категориям действий, так в конечном итоге - это все действия над одним и тем же объектом,
     * поэтому интерфейсы Moveable and Stopable нужно объндинить в один.
     */
}
