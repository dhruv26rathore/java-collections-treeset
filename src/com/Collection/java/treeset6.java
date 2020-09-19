package com.Collection.java;
import java.util.TreeSet;
//clone the tree set
public class treeset6 {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Sumit");
        tree_set.add("Dhruv");
        tree_set.add("Rahul");
        tree_set.add("Mukul");
        tree_set.add("Abhishek");
        tree_set.add("Amit");
        System.out.println(tree_set);
        TreeSet<String> tree_set2 = (TreeSet<String>)tree_set.clone();
        System.out.println(tree_set2);
    }
}
