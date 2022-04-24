package ru.gb.lesson2.linked;

public class TestLinkedList {
    public static void main(String[] args) {
        CustomLInkedList<String> custom = new CustomLInkedList();
        custom.add("hello");
        custom.add("bye");
        custom.add("aloha");

        for (String s : custom) {
            System.out.println(s);
        }

        System.out.println(custom.find("aloha").getValue());
        custom.removeHead();

        for (String s : custom) {
            System.out.println(s);
        }

        custom.removeTail();

        for (String s : custom) {
            System.out.println(s);
        }
    }
}
