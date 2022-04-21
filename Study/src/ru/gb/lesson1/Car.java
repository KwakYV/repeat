package ru.gb.lesson1;

public abstract class Car {
//    public Engine engine; // Надо инкапсулировать поля, чтобы они не были доступны из вне
    private Engine engine;
    private String color;
    private String name;

    /**
     *  Данные методы лучше вынести из абстрактного класса,
     *  так как они описывают непосредственно действия над объектом.
     */
    //    ==============================================
    protected void start() {
        System.out.println("Car starting");
    }
    abstract void open();

    //    ==============================================

    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
