package com.Collection.java;
import java.util.TreeSet;
//Remove the given element from the tree set
public class treeset15 {
    public static void main(String[] args) {
        TreeSet<Integer> tree_num = new TreeSet<Integer>();
        tree_num.add(1);
        tree_num.add(2);
        tree_num.add(3);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(10);
        System.out.println(tree_num);
        tree_num.remove(6);
        System.out.println(tree_num);
    }
}