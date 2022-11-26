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
        ArrayList<Integer> exp1 = new ArrayList<Integer>(
                Arrays.asList(87, 65, 74, 4));
        int key = 65;
        assertEquals(1, lc.linearSearch(exp1,key));
        //control flow goes inside if not found comes out then exit code with -1;
        ArrayList<Integer> exp3 = new ArrayList<Integer>(
                Arrays.asList(87, 65, 74, 4,45,67,89,90,12,3,4));
                int key2 =990;
                assertEquals(-1,lc.linearSearch(exp3,key2));

    }
}
