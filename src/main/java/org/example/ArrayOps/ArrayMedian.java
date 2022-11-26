package org.example.ArrayOps;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayMedian {

    public double ArrayMedian(ArrayList<Integer> arr1){
        int size = arr1.size();

        if(size<=0) return 0;
        Collections.sort(arr1);

        //for even size
        if(size%2==0){
            return (double) arr1.get(size/2);
        }
        return (double) (arr1.get((size-1)/2) + arr1.get(size/2)) / 2.0;
    }
}
