package ArrayOps;

import org.example.ArrayOps.ArrayMean;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArrayMeanTest {

    @Test
    public void ArrayMeanT(){

        ArrayMean am = new ArrayMean();

        // Test Path [1,2,4,5]
        ArrayList<Integer> exm1 = new ArrayList<Integer>(Arrays.asList());
        double res1 = 0;
        assertEquals(res1,am.ArrayMean(exm1),0);

        // Test Path [1,2,3,2,4,6]
        ArrayList<Integer> exm2 = new ArrayList<Integer>(Arrays.asList(1,2,2));
        double res2 = 2;
        assertEquals(res1,am.ArrayMean(exm1),0);
    }
}
