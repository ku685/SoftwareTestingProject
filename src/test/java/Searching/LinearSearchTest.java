package Searching;

import org.example.searching.LinearSearching;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
public class LinearSearchTest {
    @Test
    public void linearsearch() {
        LinearSearching lc = new LinearSearching();

        //case 1
        //control flow while inside loop found and return 1;

        ArrayList<Integer> exp1 = new ArrayList<Integer>(Arrays.asList());
        int key = 65;
        //edge 1-5
        //path 1-5
        assertEquals(-1, lc.linearSearch(exp1,key));
                ArrayList<Integer> exp3 = new ArrayList<Integer>(Arrays.asList(87, 65, 74, 4,45,67,89,90,12,3,4));
                int key2 =87;

                //edge 1-2-3
        //path 1-2-3
                assertEquals(0,lc.linearSearch(exp3,key2));
        ArrayList<Integer> exp4 =new ArrayList<>(Arrays.asList(1,2));
        int key4 =3;

        //edge 1-2-4
        //path 1-2-4-2-4-5
        assertEquals(-1,lc.linearSearch(exp4,key4));



    }
}
