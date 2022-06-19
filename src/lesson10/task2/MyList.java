package lesson10.task2;


import java.util.List;

public class MyList <T> {

    private final int DEF_SIZE = 10;
    private final int GROW = 3;
    private int index = 0;
    Object[] array = new Object[DEF_SIZE];

    public void addElement(T temp){
        if (index == array.length - 1){
            Object[] newArray = new Object[array.length + GROW];
            System.arraycopy(array, 0, newArray, 0, index);
            array = newArray;
        }
        array[index++] = temp;
    }

}
