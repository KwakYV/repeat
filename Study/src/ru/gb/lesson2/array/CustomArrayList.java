package ru.gb.lesson2.array;

public class CustomArrayList<T> {
    private final int CAPACITY = 20;
    private int size;
    private T[] data;

    public CustomArrayList(){
        data = (T[]) new Object[CAPACITY];
    }

    public void put(T item) {
        if (data.length - size < 3) {
            T[] newArray = (T[]) new Object[data.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = data[i];
            }
            data = newArray;
        }
        data[size] = item;
        size++;
    }

    public T get(int index) {
        return data[index];
    }

    public void remove(int index) {
        for (int i = index; i < size; i ++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public int find(T item) {
        for(int i = 0; i < size; i++) {
            if (data[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

}
