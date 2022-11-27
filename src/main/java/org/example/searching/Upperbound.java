package org.example.searching;

import java.util.ArrayList;

public class Upperbound {

    public  static  int upperbound(ArrayList<Integer> arr, int key)
    {
        if (arr == null || arr.size() == 0) {
            return 0;
        }
        int l = 0;
        int r = arr.size() - 1;
        if (key < arr.get(0)) {
            return -1;
        }
        if (key >= arr.get(r)) {
            return r;
        }
        while (l  <  r - 1) {
            int m = l + (r - l ) / 2 ;
            if (arr.get(m) <= key) {
                l = m;
            }else {
                r = m - 1;
            }
        }
         if(arr.get(r) <= key)
             return r ;
         else
             return l;
    }
}
