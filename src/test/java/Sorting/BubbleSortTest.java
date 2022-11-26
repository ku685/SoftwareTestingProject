package Sorting;


import org.example.Sorting.BubbleSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void BubbleSortT() {

        BubbleSort bs = new BubbleSort();

        // Test Path [1,2,11,12]
        ArrayList<Integer> exm1 = new ArrayList<Integer>(Arrays.asList(1));
        ArrayList<Integer> res1 = new ArrayList<Integer>(Arrays.asList(1));
        assertArrayEquals(res1.toArray(), bs.BubbleSort(exm1).toArray());

        // Test Path [1,2,3,4,5,6,9,8,4,5,6,7,8,4,10,2,11,12]
        ArrayList<Integer> exm2 = new ArrayList<Integer>(Arrays.asList(11,12,13,16,14,12,12,10));
        ArrayList<Integer> res2 = new ArrayList<Integer>(Arrays.asList(10,11,12,12,12,13,14,16));
        assertArrayEquals(res2.toArray(), bs.BubbleSort(exm2).toArray());

        // Test Path [1,2,3,4,5,6,9,8,4,10,2,11,12]
        ArrayList<Integer> exm3 = new ArrayList<Integer>(Arrays.asList(1,2));
        ArrayList<Integer> res3 = new ArrayList<Integer>(Arrays.asList(1,2));
        assertArrayEquals(res3.toArray(), bs.BubbleSort(exm3).toArray());

    }
}
