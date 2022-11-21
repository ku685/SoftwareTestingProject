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















//    int max_ele = arr.get(0);
//        for(int i=1;i<n; i++){
//        if(arr.get(i)>max_ele){
//        max_ele = arr.get(i);
//        }
//        }
//
//        ArrayList<Integer> cnt_array = new ArrayList<Integer>(max_ele+1);
//
//        ArrayList<Integer> op_array = new ArrayList<Integer>(max_ele+1);
//        //Initialize count array with value 0
//
//        for(int i=0;i<max_ele+1;i++) {
//        cnt_array.add(0);
//        op_array.add(0);
//        }
//        //Store count of each element
//
//        for(int i=0; i<n; i++){
//        //System.out.println(i);
//        cnt_array.set(arr.get(i),cnt_array.get(arr.get(i))+1);
//        }
//
//        //System.out.println("OK1");
//        //find cummulative sum
//
//        for(int i=1; i<=max_ele; i++){
//        cnt_array.set(i,cnt_array.get(i-1)+cnt_array.get(i));
//        }
//
//        //System.out.println("OK2");
//        for(int i=n-1;i>=0;i--){
//        op_array.set(cnt_array.get(arr.get(i)-1),arr.get(i));
//        cnt_array.set(arr.get(i),cnt_array.get(arr.get(i))-1);
//        }
//
//        //System.out.println("OK3");
//        //copy sorted array
//        for(int i=0; i<n; i++){
//        arr.set(i,op_array.get(i));
//        }
//
//        for (int i=0; i<n; ++i)
//        System.out.print(arr.get(i)+" ");
//        System.out.println();
//        return arr;
//        }