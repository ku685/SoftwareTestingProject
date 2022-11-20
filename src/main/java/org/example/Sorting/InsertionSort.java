package org.example.Sorting;

import java.util.ArrayList;

public class InsertionSort {
    public ArrayList<Integer> InsertionSort(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i=1; i<n; i++){
            int k = arr.get(i);
            int j = i-1;

            // Compare key with each element on the left
            while(j>=0 && k<arr.get(j)){
                arr.set(j+1,arr.get(j));
                --j;
            }
            arr.set(j+1,k);
        }

        for (int i=0; i<n; ++i)
            System.out.print(arr.get(i)+" ");
        System.out.println();
        return arr;

    }
}
