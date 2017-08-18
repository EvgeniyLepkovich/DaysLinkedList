package com.epam;

import com.collection.DayLinkedList;

import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        DayLinkedList<String> days = new DayLinkedList<>();
        days.add("Sat");
        days.add("Mon");
        days.add("Thu");
        days.add("Mon");
        days.add("Fri");
        days.add("Wed");
        days.add("Hello world");
        System.out.println("before: " + days);
        days.sort();
        System.out.println("after: " + days);
    }
}
