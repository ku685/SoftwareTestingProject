package Searching;

import org.example.searching.JumpSearch;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class JumpSearchTest {

    @Test
    public void Jumptest()
    {
        JumpSearch js=new JumpSearch();

        //for edge 1-2-6-10-12
        // test paths 1-2-6-10-12
        ArrayList<Integer> exp1 = new ArrayList<Integer>(Arrays.asList(4, 5, 6, 7));
        int key1=-1;
        assertEquals(-1,js.jumpSearch(exp1,key1));
        //for edge 1-2-6-10-11
        // test paths 1-2-6-10-12
        ArrayList<Integer> exp2 = new ArrayList<Integer>(Arrays.asList(-1, 5, 6, 7));
        int key2=-1;
        assertEquals(0,js.jumpSearch(exp2,key2));

        //for edge 1-2-3-5
        //test path 1-2-3-4-2-3-5
        ArrayList<Integer> exp3 = new ArrayList<Integer>(Arrays.asList(-1, 5, 6, 7));
        int key3=8;
        assertEquals(-1,js.jumpSearch(exp3,key3));

       // for edge 1-2-6-7-9
        //test path 1-2-6-7-8-6-7-9
        ArrayList<Integer> exp4 = new ArrayList<Integer>(Arrays.asList(-1, 5, 6, 7));
        int key4=3;
        assertEquals(-1,js.jumpSearch(exp4,key4));

        //for edge 1-2-6-10-11
        //test path 1-2-6-10-11
        ArrayList<Integer> exp5= new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5,5));
        int key5=5;
        assertEquals(0,js.jumpSearch(exp5,key5));

    }



}
