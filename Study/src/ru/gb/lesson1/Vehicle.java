package ru.gb.lesson1;

/**
 * Copy of Car class with optimizations
 */
public abstract class Vehicle {
    private Engine engine;
    private String color;
    private String name;

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
