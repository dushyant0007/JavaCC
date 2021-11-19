package Two_Generics;

import java.util.Arrays;

public class Custom_Generic_ArrayList<generic>/*or <generic extends Number>  */ {
    //                                                                  This means we can only add Number class or his child classes

    // <generic  Number> -> In this case you can only pass Class Number type
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public Custom_Generic_ArrayList() {
        this.data = new Object [DEFAULT_SIZE];
    }

    public void add(generic num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public generic remove() {
        generic removed = (generic)data[--size];
        data[--size] = 0;
        size = size - 1;
        return removed;
    }

    public generic get(int index) {
        return (generic)data[index];
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
                "\nsize = " + size;


    }

    public static void main(String[] args) {

        Custom_Generic_ArrayList <String> one = new  Custom_Generic_ArrayList();


        System.out.println(one.size());
        one.add("kbc");

        System.out.println(one.size());
        one.add("ckb");

        System.out.println(one.size());
        one.add("Delhi");

        System.out.println(one.remove());

        System.out.println(one.size());

        System.out.println(one.get(0));
        System.out.println(one.get(1));
        System.out.println(one.get(2));
        System.out.println(one.get(3));

        System.out.println(one);

    }

}



