package com.dima.task.sortdepartament;

/**
 *
 * @Author Dmytro Petrenko (dino96gr@gmail.com)
 * @version $ID$
 * since 0.1
 */
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;


public class SortDepartamentUp {
    /**
     * Метод сортирует по убыванию.
     * @param  depa
     * @return List<String> sortedep
     */
    public List<String> sortup(List<String> depa){

        TreeSet<String> dep = new TreeSet<String>(depa);
        List<String> sortdep = new ArrayList<String>(dep);
        return sortdep;
    }
}
