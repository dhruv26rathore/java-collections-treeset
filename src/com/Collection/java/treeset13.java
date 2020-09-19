package com.Collection.java;

import java.util.TreeSet;
//get an element in a tree set which is strictly less than the given element
public class treeset13 {
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
        System.out.println(tree_num.lower(6));
        System.out.println(tree_num.lower(3));
    }
}
