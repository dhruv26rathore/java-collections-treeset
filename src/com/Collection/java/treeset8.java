package com.Collection.java;
import java.util.TreeSet;
// compare two tree sets
public class treeset8 {
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
        tree_set2.add("Sumit");
        tree_set2.add("Dhruv");
        tree_set2.add("Ankit");
        tree_set2.add("Lavish");
        tree_set2.add("Abhishek");
        tree_set2.add("Amit");
        System.out.println(tree_set2);
        TreeSet<String> tree_set3 = new TreeSet<String>();
        for (String element : tree_set){
            System.out.println(tree_set2.contains(element) ? "Yes" : "No");
        }
    }
}
