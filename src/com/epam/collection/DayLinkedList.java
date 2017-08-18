package com.epam.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Yayheniy_Lepkovich on 8/18/2017.
 */
public class DayLinkedList<T extends String> extends LinkedList<T> {
    @Override
    public boolean add(T e) {
        if (InnerDayValidator.validate(e)){
            super.add(e);
            return true;
        }
        return false;
    }

    public void sort(){
        Object[] a = super.toArray();
        String[] days = Arrays.copyOf(a, a.length, String[].class);
        for(int i = 0; i < days.length - 1; i++){
            for(int j = i + 1; j < days.length; j++){
                if (Week.getDayValue(days[i]) > Week.getDayValue(days[j])){
                    String tmp = days[i];
                    days[i] = days[j];
                    days[j] = tmp;
                }
            }
        }
        ListIterator<T> i = this.listIterator();
        for (String e : days) {
            i.next();
            i.set((T) e);
        }
    }

    private static class InnerDayValidator {
        public static boolean validate(String day) {
            return Week.isDay(day);
        }
    }
}
