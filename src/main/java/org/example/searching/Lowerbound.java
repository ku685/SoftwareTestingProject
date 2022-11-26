package org.example.searching;

import java.util.ArrayList;

public class Lowerbound {

    public static int lowerbound(ArrayList<Integer> arr, int key)
    {
        if (arr == null || arr.size() == 0) {
            return 0;
        }
        int l = 0;
        int r = arr.size() - 1;
        if (key <= arr.get(0)) {
            return 0;
        }
        if (key > arr.get(r)) {
            return -1;
        }
        while (l  <  r) {
            int m = l + (r - l ) / 2 ;

            if (arr.get(m) >= key) {
                r = m;
            }else {
                l = m + 1;
            }
        }
        return r;
    }
}
