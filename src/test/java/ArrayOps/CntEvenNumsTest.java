package ArrayOps;

import org.example.ArrayOps.CntEvenNums;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CntEvenNumsTest {

    @Test
    public void CntEvenNumsT(){

        CntEvenNums en = new CntEvenNums();

        // Test Path [1,2,4]
        ArrayList<Integer> exm1 = new ArrayList<Integer>(Arrays.asList());
        int res1 = 0;
        assertEquals(res1, en.CntEvenNums(exm1));

        // Test Path [1,2,3,5,6,2,4]
        ArrayList<Integer> exm2 = new ArrayList<Integer>(Arrays.asList(1,2,2));
        int res2 = 2;
        assertEquals(res2, en.CntEvenNums(exm2));

        // Test Path [1,2,3,6,2,4]
        ArrayList<Integer> exm3 = new ArrayList<Integer>(Arrays.asList(1,3,5));
        int res3 = 0;
        assertEquals(res3, en.CntEvenNums(exm3));
    }
}
