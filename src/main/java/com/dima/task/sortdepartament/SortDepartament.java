package com.dima.task.sortdepartament;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class SortDepartament {


    public static void main(String[] args) {
         List<String> department = new ArrayList<String>();
            department.add("K2");
            department.add("K2\\SK1");
            department.add("K2\\SK1\\SSK2");
            department.add("K2\\SK1\\SSK1");
            department.add("K1");
            department.add("K1\\SK1");
            department.add("K1\\SK1\\SSK2");
            department.add("K1\\SK1\\SSK1");
        TreeSet<String> dep = new TreeSet<String>(new Comparator() {
            public int compare(Object o1, Object o2) {
                return o1.equals(o2) ? -1 : 1;
            }
        });
        dep.add("K2");
        dep.add("K2\\SK1");
        dep.add("K2\\SK1\\SSK2");
        dep.add("K2\\SK1\\SSK1");
        dep.add("K1");
        dep.add("K1\\SK1");
        dep.add("K1\\SK1\\SSK2");
        dep.add("K1\\SK1\\SSK1");
        List<String> l = new ArrayList<String>(dep);
        System.out.println(l);
    }



}
