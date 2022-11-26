package ArrayOps;

import org.example.ArrayOps.ArrayMean;
import org.example.ArrayOps.ArrayMedian;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArrayMedianTest {

    @Test
    public void ArrayMedianT(){

        ArrayMedian am = new ArrayMedian();

        // Test Path [1,2]
        ArrayList<Integer> exm1 = new ArrayList<Integer>(Arrays.asList());
        double res1 = 0;
        assertEquals(res1,am.ArrayMedian(exm1),0);

        // Test Path [1,3,4]
        ArrayList<Integer> exm2 = new ArrayList<Integer>(Arrays.asList(1,2,2,3));
        double res2 = 2;
        assertEquals(res1,am.ArrayMedian(exm1),0);

        // Test Path [1,3,5]
        ArrayList<Integer> exm3 = new ArrayList<Integer>(Arrays.asList(1,2,3));
        double res3 = 2;
        assertEquals(res1,am.ArrayMedian(exm1),0);

    }
}
