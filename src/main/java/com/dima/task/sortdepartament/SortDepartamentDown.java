package com.dima.task.sortdepartament;

/**
 *
 * @Author Dmytro Petrenko (dino96gr@gmail.com)
 * @version $ID$
 * since 0.1
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;



public class SortDepartamentDown {
    /**
     * Метод сортирует по убыванию
     * @param depa
     * @return List<String> sortdep
     */
    public List<String> sortdown(List<String> depa){
        TreeSet<String> dep = new TreeSet(new Comparator() {
            public int compare(Object o1, Object o2) {
                return o1.equals(o2) ? 1 : -1;
            }
        });
        //TreeSet<String> dep = new TreeSet<String>(depa);
        for (String a : depa) {
            dep.add(a);
        }
        List<String> sortdep = new ArrayList<String>(dep);
        return sortdep;
    }
}
