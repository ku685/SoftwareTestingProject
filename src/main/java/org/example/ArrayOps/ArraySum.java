package org.example.ArrayOps;

import java.util.ArrayList;

public class ArraySum {

    public int ArraySum(ArrayList<Integer> arr1){
        int s = 0;
        int size = arr1.size();
        for(int i=0; i<size;i++){
            s += arr1.get(i);
        }
        return s;
    }
}
