package com.Collection.java;
import java.util.TreeSet;
//iterate all the elements of the treeset
public class treeset2 {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Sumit");
        tree_set.add("Dhruv");
        tree_set.add("Rahul");
        tree_set.add("Mukul");
        tree_set.add("Abhishek");
        tree_set.add("Amit");
        System.out.println(tree_set);
        for (String element : tree_set) {
            System.out.println(element);
        }
    }
}
