package Searching;

import org.example.searching.Upperbound;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class UpperboundTest {

    @Test
    public  void  upperbound()
    {
        Upperbound ub= new Upperbound();

        // for edge 1-12
        //test path 1-12
        ArrayList<Integer> exp1 = new ArrayList<Integer>(
                Arrays.asList());
        int key1 = 65;
        assertEquals(0,ub.upperbound(exp1,key1));

        //foir edge 1-2-3
        ArrayList<Integer> exp2 = new ArrayList<Integer>(
                Arrays.asList(100,200,300,400));
        int key2 = 65;
        assertEquals(-1,ub.upperbound(exp2,key2));

        //for edge 1-2-4
        ArrayList<Integer> exp3 = new ArrayList<Integer>(
                Arrays.asList(100,200,300,400));
        int key3 =1065;
        assertEquals(3,ub.upperbound(exp3,key3));

        //for edge 1-2-5-6-8-5-9-10
        // test path 1-2-5-6-7-5-6-8-5-9-10
        ArrayList<Integer> exp4 = new ArrayList<Integer>(
                Arrays.asList(10,20,30,40,50));
        int key4 =35;
        assertEquals(2,ub.upperbound(exp4,key4));

        //for edge 1-2-5-6-7-5-9-11
        //test path 1-2-5-6-7-5-6-7-5-9-11
        ArrayList<Integer> exp5 = new ArrayList<Integer>(
                Arrays.asList(10,20,30,40,50));
        int key5=45;
        assertEquals(3,ub.upperbound(exp5,key5));
    }
}
