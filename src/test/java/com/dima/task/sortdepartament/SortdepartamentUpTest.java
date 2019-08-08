package com.dima.task.sortdepartament;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortdepartamentUpTest {
    @Test
    public void whenSortUpThenUp(){
        List<String> test = new ArrayList<String>();
        test.add("K2");
        test.add("K2\\SK1");
        test.add("K2\\SK1\\SSK2");
        test.add("K2\\SK1\\SSK1");
        test.add("K1");
        test.add("K1\\SK1");
        test.add("K1\\SK1\\SSK2");
        test.add("K1\\SK1\\SSK1");

        List<String> expected = new ArrayList<String>();
        expected.add("K1");
        expected.add("K1\\SK1");
        expected.add("K1\\SK1\\SSK1");
        expected.add("K1\\SK1\\SSK2");
        expected.add("K2");
        expected.add("K2\\SK1");
        expected.add("K2\\SK1\\SSK1");
        expected.add("K2\\SK1\\SSK2");


        SortDepartamentUp sortDepartamentUp = new SortDepartamentUp();
        List<String> result = new ArrayList<String>(sortDepartamentUp.sortup(test));
        assertThat(result, is(expected));
        //TreeSet<String> result = sortDepartamentUp.sortup(test);
        //List<String> result1 = new ArrayList<String>(result);
        //assertThat(result1, is(test));
    }
}
