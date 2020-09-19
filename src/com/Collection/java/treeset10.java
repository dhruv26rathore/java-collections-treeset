package com.Collection.java;
import java.util.TreeSet;
//get an element from a tree which is greater and equal to given element
public class treeset10 {
    public static void main(String[] args) {
        TreeSet <Integer>tree_num = new TreeSet<Integer>();
        tree_num.add(10);
        tree_num.add(22);
        tree_num.add(36);
        tree_num.add(25);
        tree_num.add(16);
        tree_num.add(70);
        tree_num.add(82);
        tree_num.add(89);
        tree_num.add(14);
        System.out.println(tree_num.ceiling(16));
        System.out.println(tree_num.ceiling(79));
    }
}