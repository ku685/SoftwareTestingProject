package Searching;
import org.example.searching.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class BinarySearchTest {
    @Test
    public void binarysearch() {

        //mid control flows goes to mid if equals return mid
        BinarySearch bs=new BinarySearch();
        ArrayList<Integer> exp1 = new ArrayList<Integer>(
                Arrays.asList(87, 65, 74));

        int key = 65;
        //control flows goes to before mid side
        assertEquals(1,bs.binarySearch(exp1,key));
        int key2 =2;
        ArrayList<Integer> exp2= new ArrayList<Integer>(
                Arrays.asList(2, 3 ,4));
        assertEquals(0,bs.binarySearch(exp2,key2));
        //if value greater than goes control flows toward right of mid
        int key3=900;
        ArrayList<Integer> exp3= new ArrayList<Integer>(
                Arrays.asList(200, 300 ,900));
        assertEquals(2,bs.binarySearch(exp3,key3));

        //if element is not present low>high and return -1
        ArrayList<Integer> exp4= new ArrayList<Integer>(
                Arrays.asList(200, 300 ,900));
        int key4=800;
        assertEquals(-1,bs.binarySearch(exp4,key4));





    }
}
