package org.example.Sorting;

import java.util.ArrayList;

public class CountingSort {
    public ArrayList<Integer> CountingSort(ArrayList<Integer> arr){
        int n = arr.size();
        int[] t_array = new int[n];

        for(int i=0; i<n; i++){
            t_array[i] = arr.get(i);
        }

        // We will first find largest element of the array

        int[] op_array = new int[n+1];
        int max_ele = t_array[0];

        for(int i=1; i<n; i++){
            if(max_ele<t_array[i]) {
                max_ele = t_array[i];
            }
        }

        int[] cnt_array = new int[max_ele+1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max_ele; i++) {
            cnt_array[i] = 0;
        }

        // Store the count of each element
        for (int i = 0; i < n; i++) {
            cnt_array[t_array[i]]++;
        }

        // Store the cummulative count of each array
        for (int i = 1; i <= max_ele; i++) {
            cnt_array[i] += cnt_array[i - 1];
        }

        // Find the index of each element of the original array in count array
        for (int i = n - 1; i >= 0; i--) {
            op_array[cnt_array[t_array[i]] - 1] = t_array[i];
            cnt_array[t_array[i]]--;
        }

        for (int i = 0; i < n; i++) {
            t_array[i] = op_array[i];
        }

        for(int i=0; i<n; i++){
            arr.set(i,t_array[i]);
        }

        for (int i=0; i<n; ++i)
            System.out.print(arr.get(i)+" ");
        System.out.println();
        return arr;
    }
}

