package org.example.Sorting;

import java.util.ArrayList;

public class SelectionSort {

    public ArrayList<Integer> SelectionSort(ArrayList<Integer> arr){
        int n = arr.size();

        for(int i=0; i<n-1; i++){
            int min_index = i;

            for(int j=i+1; j<n; j++){

                //select minimum element in each loop
                if(arr.get(j) < arr.get(min_index)){
                    min_index = j;
                }
            }

            // Placing minimum element at its position
            int temp = arr.get(i);
            arr.set(i,arr.get(min_index));
            arr.set(min_index,temp);
        }

        for (int i=0; i<n; ++i)
            System.out.print(arr.get(i)+" ");
        System.out.println();

        return arr;
    }
}
