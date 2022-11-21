package org.example.Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    public ArrayList<Float> BucketSort(ArrayList<Float> arr){
        int n = arr.size();

        ArrayList<Float>[] bucketList =  new ArrayList[n];

        //Create empty buckets
        for(int i=0; i<n; i++){
            bucketList[i] = new ArrayList<Float>();
        }

        // Add elements into buckets
        for(int i=0; i<n; i++){
            float num = arr.get(i)*n;
            int bucketIndex = (int) num;
            bucketList[bucketIndex].add(arr.get(i));
        }

        //Sort the elements in buckets
        for(int i=0; i<n; i++){
            Collections.sort((bucketList[i]));
        }

        //Get sorted array
        int index = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<bucketList[i].size(); j++){
                arr.set(index,bucketList[i].get(j));
                index++;
            }
        }


        for (int i=0; i<n; ++i)
            System.out.print(arr.get(i)+" ");
        System.out.println();
        return arr;
    }
}
