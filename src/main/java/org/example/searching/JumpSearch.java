package org.example.searching;

import java.util.ArrayList;

public class JumpSearch {

    public static int jumpSearch(ArrayList<Integer> arr, int key)
    {
        int n = arr.size();

        // Finding block size to be jumped
        //in ideal condition m=sqrt(n);
        int step = (int)Math.floor(Math.sqrt(n));

        // Finding the block where element is
        // present (if it is present)
        int prev = 0;
        while (arr.get(Math.min(step, n) - 1) < key)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;

        }

        // Doing a linear search for x in block
        // beginning with prev.
        while (arr.get(prev) < key)
        {
            prev++;

            // If we reached next block or end of
            // array, element is not present.
            if (prev == Math.min(step, n))
                return -1;
        }

        // If element is found
        if (arr.get(prev) == key)
            return prev;

        return -1;
    }
}
