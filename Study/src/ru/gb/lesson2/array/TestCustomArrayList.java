package ru.gb.lesson2.array;

public class TestCustomArrayList {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.put(1);
        list.put(2);
        list.put(3);
        list.put(4);
        list.put(5);
        list.put(6);

        for (int i=0; i<list.getSize(); i++) {
            System.out.println(list.get(i));
        }

        list.remove(3);

        for (int i=0; i<list.getSize(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.find(3));
    }
}
