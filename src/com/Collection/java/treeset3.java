package com.Collection.java;
import java.util.TreeSet;
//merge two tree sets
public class treeset3 {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Sumit");
        tree_set.add("Dhruv");
        tree_set.add("Rahul");
        tree_set.add("Mukul");
        tree_set.add("Abhishek");
        tree_set.add("Amit");
        System.out.println(tree_set);
        TreeSet<String> tree_set2 = new TreeSet<String>();
        tree_set2.add("Anuj");
        tree_set2.add("Abhay");
        tree_set2.add("Ankit");
        tree_set2.add("Keshav");
        tree_set2.add("hitesh");
        tree_set2.add("Divyansh");
        tree_set.addAll(tree_set2);
        System.out.println(tree_set);
    }
}
