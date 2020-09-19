package com.Collection.java;
import java.util.Iterator;
import java.util.TreeSet;
//get all the value which is less than 7
public class treeset9 {
    public static void main(String[] args) {
        TreeSet <Integer>tree_num = new TreeSet<Integer>();
        TreeSet <Integer>tree_headset = new TreeSet<Integer>();
        tree_num.add(1);
        tree_num.add(2);
        tree_num.add(3);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(10);
        tree_headset = (TreeSet)tree_num.headSet(7);
        Iterator iterator;
        iterator = tree_headset.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
    }
}