package org.example.Sorting;

import java.util.ArrayList;

public class BubbleSort {
    public ArrayList<Integer> BubbleSort(ArrayList <Integer> arr)
    {
        int n = arr.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr.get(j) > arr.get(j+1))
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
        for (int i=0; i<n; ++i)
            System.out.print(arr.get(i)+" ");
        System.out.println();
        return arr;
    }
}