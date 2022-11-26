package Searching;
import org.example.searching.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class BinarySearchTest {
    @Test
    public void binarysearch() {


        BinarySearch bs=new BinarySearch();

        ArrayList<Integer> exp0 = new ArrayList<Integer>(Arrays.asList());
        int key0 = 65;

        //edge 1-2-8
        //path 1-2-8
        assertEquals(-1,bs.binarySearch(exp0,key0));

        ArrayList<Integer> exp1 = new ArrayList<Integer>(Arrays.asList(87, 65, 74));
        int key = 65;
        //edge 1-2-4-5
        //path 1-2-4-5
        assertEquals(1,bs.binarySearch(exp1,key));

        int key2 =2;
        ArrayList<Integer> exp2= new ArrayList<Integer>(Arrays.asList(1,2, 3 ,4,5,6,7));
        //edge 1-2-4-6 ,1-2-4-5
        //1-2-4-6-2-4-5
        assertEquals(1,bs.binarySearch(exp2,key2));

        int key3=6;
        ArrayList<Integer> exp3= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        //edge 1-2-4-7
        //test path 1-2-4-7-2-4-5
        assertEquals(5,bs.binarySearch(exp3,key3));

        //if element is not present low>high and return -1
        ArrayList<Integer> exp4= new ArrayList<Integer>(Arrays.asList(200, 300 ,900));
        int key4=800;
        assertEquals(-1,bs.binarySearch(exp4,key4));





    }
}
