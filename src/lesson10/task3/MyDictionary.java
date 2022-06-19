package lesson10.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class MyDictionary<K, V> {

    private K key;
    private V value;

    ArrayList list = new ArrayList<>();

    public MyDictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public MyDictionary() {
    }

    public void addPair() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter key: ");
        K k = (K) sc.next();
        System.out.print("Enter value: ");
        V v = (V) sc.next();
        MyDictionary element = new MyDictionary(k, v);
        list.add(element);
    }

    public int size() {
        return list.size();
    }

    public MyDictionary get(int index) {
        return (MyDictionary) list.get(index);
    }

    public void printAllElements() {
        for (Object m : list) {
            System.out.print(m + " ");
        }
    }

    @Override
    public String toString() {
        return "'" + key + ":" + value + "'";
    }
}
