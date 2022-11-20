package org.example.searching;

import java.util.ArrayList;

public class BinarySearch {
    public static int binarySearch(ArrayList<Integer> arr, int key) {
        int high=arr.size()-1;
        int low=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr.get(mid) ==key)
            {
                System.out.println("Element found");
                return mid;
            }
            else if(arr.get(mid) >key)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Element not present");
        return -1;
        }
    }

