package Searching;

import org.example.searching.Lowerbound;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LowerboundTest {

    @Test
    public  void  lowerbound()
    {
        Lowerbound lb= new Lowerbound();

        // for edge 1-10
        //test path 1-10
        ArrayList<Integer> exp1 = new ArrayList<Integer>(Arrays.asList());
        int key1 = 65;
        assertEquals(0,lb.lowerbound(exp1,key1));
        //for edge 1-2-3
        //test path 1-2-3
        ArrayList<Integer> exp2 = new ArrayList<Integer>(Arrays.asList(34,67,98,45,234,678));
        int key2 = 5;
        assertEquals(0,lb.lowerbound(exp2,key2));

        //for edge 1-2-4
        //test path 1-2-4
        ArrayList<Integer> exp3 = new ArrayList<Integer>(Arrays.asList(34,67,98,45,234,678));
        int key3 =555567;
        assertEquals(-1,lb.lowerbound(exp3,key3));

        //for edge  1-2-5-6-7-5-9
        //test path 1-2-5-6-7-5-6-8-5-6-8-5-9
        ArrayList<Integer> exp4 = new ArrayList<Integer>(Arrays.asList(1,2,16,20,23));
        int key4 =14;
        assertEquals(2,lb.lowerbound(exp4,key4));

        //for edge 1-2-5-6-8-5-9
        //test path 1-2-5-6-8-5-6-7-5-9
        ArrayList<Integer> exp5 = new ArrayList<Integer>(Arrays.asList(1,2,16,20,23));
        int key5 =18;
        assertEquals(3,lb.lowerbound(exp5,key5));


    }
}
