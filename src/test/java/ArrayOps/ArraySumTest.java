package ArrayOps;

import org.example.ArrayOps.ArraySum;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraySumTest {

    @Test
    public void ArraySumT(){

        ArraySum as = new ArraySum();

        // Test Path [1,2,4]
        ArrayList<Integer> exm1 = new ArrayList<Integer>(Arrays.asList());
        int res1 = 0;
        assertEquals(res1, as.ArraySum(exm1));

        // Test Path [1,2,3,2,4]
        ArrayList<Integer> exm2 = new ArrayList<Integer>(Arrays.asList(1,2,2));
        int res2 = 5;
        assertEquals(res2, as.ArraySum(exm2));
    }
}
