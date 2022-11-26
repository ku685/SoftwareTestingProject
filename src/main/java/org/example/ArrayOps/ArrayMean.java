package org.example.ArrayOps;

import java.util.ArrayList;

public class ArrayMean {

    public double ArrayMean(ArrayList<Integer> arr1){
        int s = 0;
        int size = arr1.size();
        for(int i=0; i<size;i++){
            s += arr1.get(i);
        }

        if(s==0) {
            return 0;     //to avoid empty list case
             }
        double ans = (double) s / (double) size;
        return ans;
    }
}
