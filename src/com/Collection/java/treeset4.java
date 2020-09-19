package com.Collection.java;
import java.util.Iterator;
import java.util.TreeSet;
//Print list elements in reverse order
public class treeset4 {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Sumit");
        tree_set.add("Dhruv");
        tree_set.add("Rahul");
        tree_set.add("Mukul");
        tree_set.add("Abhishek");
        tree_set.add("Amit");
        System.out.println(tree_set);
        Iterator it = tree_set.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}