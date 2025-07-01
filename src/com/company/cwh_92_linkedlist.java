package com.company;

import java.util.*;
import java.util.ArrayList;

public class cwh_92_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(12);
        l2.add(13);
        l2.add(14);


        l1.addFirst(23345);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,1);
//        l1.addAll(l2);
        l1.addAll(0,l2);
//        l1.clear();
//        l1.clone();
        l1.set(1,23);
        l1.addLast(6524);
        System.out.println(l1.contains(74));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        for(int i = 0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}
