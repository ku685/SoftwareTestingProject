package Sorting;


import org.example.Sorting.BubbleSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void test1() {
        BubbleSort bs = new BubbleSort();
        ArrayList<Integer> exp2 = new ArrayList<Integer>(Arrays.asList(1,2,3,6));
        ArrayList<Integer> act2 = new ArrayList<Integer>(Arrays.asList(1,2,6,3));
        assertArrayEquals(exp2.toArray(), bs.BubbleSort(act2).toArray());

    }
}
