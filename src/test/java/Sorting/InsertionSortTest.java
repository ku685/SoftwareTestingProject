package Sorting;

import org.example.Sorting.InsertionSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void InsertionSortT(){
        InsertionSort is = new InsertionSort();

        // Test Path [1,2,7,8]
        ArrayList<Integer> exm1 = new ArrayList<Integer>(Arrays.asList(1));
        ArrayList<Integer> res1 = new ArrayList<Integer>(Arrays.asList(1));
        assertArrayEquals(res1.toArray(), is.InsertionSort(exm1).toArray());


        // Test Path [1,2,3,4,5,2,7,8]
        ArrayList<Integer> exm2 = new ArrayList<Integer>(Arrays.asList(1,2));
        ArrayList<Integer> res2 = new ArrayList<Integer>(Arrays.asList(1,2));
        assertArrayEquals(res2.toArray(), is.InsertionSort(exm2).toArray());


        // Test Path [1,2,3,4,6,4,5,2,7,8]
        ArrayList<Integer> exm3 = new ArrayList<Integer>(Arrays.asList(11,12,13,16,14,12,12,10));
        ArrayList<Integer> res3 = new ArrayList<Integer>(Arrays.asList(10,11,12,12,12,13,14,16));
        assertArrayEquals(res3.toArray(), is.InsertionSort(exm3).toArray());
    }
}
