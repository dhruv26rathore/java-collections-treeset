package com.Collection.java;

import java.util.TreeSet;
// get the first and last element of the treeset
public class treeset5 {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Sumit");
        tree_set.add("Dhruv");
        tree_set.add("Rahul");
        tree_set.add("Mukul");
        tree_set.add("Abhishek");
        tree_set.add("Amit");
        System.out.println(tree_set);
        Object first_element = tree_set.first();
        System.out.println(first_element);
        Object last_element = tree_set.last();
        System.out.println(last_element);
    }
}
