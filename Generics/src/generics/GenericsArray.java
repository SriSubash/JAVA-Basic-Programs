package generics;

import java.util.Arrays;

public class GenericsArray<T> {
    private T[] array;
    private int size;

    public GenericsArray(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public void addElement(T element, int position) {
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == array.length) {
            resizeArray();
        }
        for (int i = size; i > position; i--) {
            array[i] = array[i-1];
        }
        array[position] = element;
        size++;
    }

    public void addFirst(T element) {
        addElement(element, 0);
    }

    public void addLast(T element) {
        addElement(element, size);
    }

    public T deleteElement(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException();
        }
        T deletedElement = array[position];
        for (int i = position; i < size-1; i++) {
            array[i] = array[i+1];
        }
        array[size-1] = null;
        size--;
        return deletedElement;
    }

    public T[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    private void resizeArray() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public static void main(String[] args) {
        GenericsArray<Integer> arrayOps = new GenericsArray<>(5);
        arrayOps.addLast(10);
        arrayOps.addLast(20);
        arrayOps.addLast(30);
        arrayOps.addLast(40);
        arrayOps.addLast(50);
        System.out.println("Array before deletion: " + Arrays.toString(arrayOps.getArray()));
        arrayOps.deleteElement(2);
        System.out.println("Array after deletion: " + Arrays.toString(arrayOps.getArray()));
        arrayOps.addFirst(5);
        System.out.println("Array after adding element at the beginning: " + Arrays.toString(arrayOps.getArray()));
        arrayOps.addElement(25, 3);
        System.out.println("Array after adding element at the middle: " + Arrays.toString(arrayOps.getArray()));
        arrayOps.addLast(60);
        System.out.println("Array after adding element at the end: " + Arrays.toString(arrayOps.getArray()));
    }
}

