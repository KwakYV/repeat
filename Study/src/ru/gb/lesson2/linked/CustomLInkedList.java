package ru.gb.lesson2.linked;

import java.util.Iterator;

/**
 * Возможно не все операции учел,
 * но постарался базовые учесть.
 * @param <T>
 */

public class CustomLInkedList<T> implements Iterable<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;


    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public void add(T item) {
        if (head == null) {
            head = new Node<>();
            head.setValue(item);
            tail = head;
        } else {
            Node<T> next  = new Node<>();
            next.setValue(item);
            tail.setNext(next);
            next.setPrev(tail);
            tail = next;
        }
        size++;
    }


    public Node<T> find(T item) {
        Node<T> current = getHead();
        for(int i=0; i < size; i++) {
            if (current.getValue().equals(item)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public Node<T> removeHead() {
        Node<T> removable = getHead();
        head = removable.getNext();
        head.setPrev(null);
        return removable;
    }

    public Node<T> removeTail() {
        Node<T> removable = getTail();
        tail = removable.getPrev();
        tail.setNext(null);
        return removable;
    }



    @Override
    public Iterator<T> iterator() {
        return new CustomLinkedListIterator<>(this);
    }


    private class CustomLinkedListIterator<T> implements Iterator<T> {
        private Node<T> current;

        public CustomLinkedListIterator(CustomLInkedList<T> object){
            current = object.getHead();
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T value = current.getValue();
            current = current.getNext();
            return value;
        }
    }
}
