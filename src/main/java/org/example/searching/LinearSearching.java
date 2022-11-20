package org.example.searching;

import java.util.ArrayList;

public class LinearSearching {
    public static int linearSearch(ArrayList<Integer> arr, int key) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == key) {
                System.out.println("Element found");
                return 1;
            }
        }
        System.out.println("Element not found");
        return -1;
    }
}
