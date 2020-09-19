package com.Collection.java;
import java.util.TreeSet;
// Get and remove the first and last element from the tree set
public class treeset14 {
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
        System.out.println(tree_num.pollFirst());
        System.out.println(tree_num.pollLast());
        System.out.println(tree_num);
    }
}
