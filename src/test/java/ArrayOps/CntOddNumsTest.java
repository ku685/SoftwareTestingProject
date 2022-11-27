package ArrayOps;

import org.example.ArrayOps.CntOddNums;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CntOddNumsTest {

    @Test
    public void CntOddNumsT(){

        CntOddNums on = new CntOddNums();

        // Test Path [1,2,4]
        ArrayList<Integer> exm1 = new ArrayList<Integer>(Arrays.asList());
        int res1 = 0;
        assertEquals(res1, on.CntOddNums(exm1));

        // Test Path [1,2,3,5,6,2,4]
        ArrayList<Integer> exm2 = new ArrayList<Integer>(Arrays.asList(1,2,2));
        int res2 = 1;
        assertEquals(res2, on.CntOddNums(exm2));

        // Test Path [1,2,3,6,2,4]
        ArrayList<Integer> exm3 = new ArrayList<Integer>(Arrays.asList(2,2,2));
        int res3 = 0;
        assertEquals(res3, on.CntOddNums(exm3));
    }
}
