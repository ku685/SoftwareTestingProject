package org.example.ArrayOps;

import java.util.ArrayList;

public class CntEvenNums {

    public int CntEvenNums(ArrayList<Integer> arr1){
        int cnt = 0;

        int size = arr1.size();

        for(int i=0; i<size; i++){
            int temp = arr1.get(i);
            if(temp%2==0){
                cnt++;
            }
        }

        return cnt;
    }
}
