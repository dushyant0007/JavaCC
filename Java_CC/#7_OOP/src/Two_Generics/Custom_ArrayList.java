package Two_Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Custom_ArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public Custom_ArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int removed = data[--size];
        data[--size] = 0;
        size = size - 1;
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
       return "data = " + Arrays.toString(data) +
                 "\nsize = "+size;
    }

    public static void main(String[] args) {

        Custom_ArrayList one = new Custom_ArrayList();

        System.out.println(one.size());
        one.add(10);

        System.out.println(one.size());
        one.add(20);

        System.out.println(one.size());
        one.add(30);

        System.out.println(one.remove());

        System.out.println(one.size());

        System.out.println(one.get(0));
        System.out.println(one.get(1));
        System.out.println(one.get(2));
        System.out.println(one.get(3));

        System.out.println(one);

    }

}
