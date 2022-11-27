package org.example;

import org.example.ArrayOps.*;
import org.example.Sorting.*;
import org.example.searching.BinarySearch;
import org.example.searching.JumpSearch;
import org.example.searching.LinearSearching;
import org.example.searching.Lowerbound;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = getChoice();

        if(choice==1){
            getChoiceSorting();
        } else if (choice==2) {
            getChoiceArrayOps();
        }
        else if(choice ==3)
        {
            getChoiceSearchingOps();
        }
        return;
    }

    private static int getChoiceSearchingOps() {


        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your choice");
//        int choice=sc.nextInt();3
//        while(choice!=6)
//        {
            System.out.println("Enter your choice");
            System.out.println("1.linear search");
            System.out.println("2.Binary serach");
            System.out.println("3.Jump Seach");
            System.out.println("4.lower bound of element");
            System.out.println("5.Upper bound of elemenbt");
            System.out.println("6.exit ");
            int choice=sc.nextInt();
            switch (choice)
            {

                case  1:
                    System.out.println("Enter the key for searching using linearsearch");
                    int key=sc.nextInt();
                    System.out.println("Enter the Size of the array");
                    int n = sc.nextInt();
                    System.out.println("Enter the Aray for searching");
                    ArrayList<Integer> array = new ArrayList<Integer>(n);
                    for (int i = 0; i < n; i++)
                    {
                        int ele = sc.nextInt();
                        array.add(ele);
                    }
                    LinearSearching.linearSearch(array,key);
                    break;
                case  2:
                    System.out.println("Enter the key for searching using binarysearch");
                    int key1=sc.nextInt();
                    System.out.println("Enter the Size of the array");
                    int n1= sc.nextInt();
                    System.out.println("Enter the Aray for searching");
                    ArrayList<Integer> array1 = new ArrayList<Integer>(n1);
                    for (int i = 0; i < n1; i++)
                    {
                        int ele = sc.nextInt();
                        array1.add(ele);
                    }
                    BinarySearch.binarySearch(array1,key1);
                    break;
                case  3:
                    System.out.println("Enter the key for searching using jump search");
                    int key3=sc.nextInt();
                    System.out.println("Enter the Size of the array");
                    int n3= sc.nextInt();
                    System.out.println("Enter the Aray for searching");
                    ArrayList<Integer> array3 = new ArrayList<Integer>(n3);
                    for (int i = 0; i < n3; i++)
                    {
                        int ele = sc.nextInt();
                        array3.add(ele);
                    }
                    JumpSearch.jumpSearch(array3,key3);
                    break;
                case 4:
                    System.out.println("Enter the element whose lower bound you eant");
                    int key4=sc.nextInt();
                    System.out.println("Enter the Size of the array");
                    int n4= sc.nextInt();
                    System.out.println("Enter the Aray for searching");
                    ArrayList<Integer> array4 = new ArrayList<Integer>(n4);
                    for (int i = 0; i < n4; i++)
                    {
                        int ele = sc.nextInt();
                        array4.add(ele);
                    }
                    Lowerbound.lowerbound(array4,key4);
                case  5:
                    System.out.println("Enter the element whose upper bound you want");
                    int key5=sc.nextInt();
                    System.out.println("Enter the Size of the array");
                    int n5= sc.nextInt();
                    System.out.println("Enter the Aray for searching");
                    ArrayList<Integer> array5 = new ArrayList<Integer>(n5);
                    for (int i = 0; i < n5; i++)
                    {
                        int ele = sc.nextInt();
                        array5.add(ele);
                    }
                    Lowerbound.lowerbound(array5,key5);
                default:break;


            }

//        }
        System.out.println("Hello Kushal!");
        return 0;
    }

    public static int getChoice(){
        System.out.println("Choices :- ");
        System.out.println("1. Sorting Utility");
        System.out.println("2. Array Operations Utility");
        System.out.println("3. Searching Utility");
        System.out.println("10. Exit");
        System.out.println("Input :: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }

    public static void getChoiceArrayOps(){
        System.out.println("Choices :- ");
        System.out.println("1. Find Array Sum");
        System.out.println("2. Find Mean of Array");
        System.out.println("3. Find Median of Array");
        System.out.println("4. Find Count of Even Integers in Array");
        System.out.println("5. Find Count of Odd Integers in Array");
        System.out.println("10. Exit");
        System.out.println("Input :: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice==1){
            System.out.println("This is Array Operations utility : Array Sum");
            System.out.println("Enter the Size of the array");
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>(n);
            System.out.println("Enter the array : ");
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                array.add(ele);
            }
            ArraySum as = new ArraySum();
            int a = as.ArraySum(array);
            System.out.println(a);
        }else if(choice==2){
            System.out.println("This is Array Operations utility : Array Mean");
            System.out.println("Enter the Size of the array");
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>(n);
            System.out.println("Enter the array : ");
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                array.add(ele);
            }
            ArrayMean am = new ArrayMean();
            double arr = am.ArrayMean(array);
            System.out.println(arr);
        }else if(choice==3){
            System.out.println("This is Array Operations utility : Array Median");
            System.out.println("Enter the Size of the array");
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>(n);
            System.out.println("Enter the array : ");
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                array.add(ele);
            }
            ArrayMedian am = new ArrayMedian();
            double arr = am.ArrayMedian(array);
            System.out.println(arr);
        }else if(choice==4){
            System.out.println("This is Array Operations utility : Even digit count");
            System.out.println("Enter the Size of the array");
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>(n);
            System.out.println("Enter the array : ");
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                array.add(ele);
            }
            CntEvenNums en = new CntEvenNums();
            int arr = en.CntEvenNums(array);
            System.out.println(arr);
        }else if(choice==5){
            System.out.println("This is Array Operations utility : Odd digit count");
            System.out.println("Enter the Size of the array");
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>(n);
            System.out.println("Enter the array : ");
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                array.add(ele);
            }
            CntOddNums on = new CntOddNums();
            int arr = on.CntOddNums(array);
            System.out.println(arr);
        }
        return;

    }

    public static void getChoiceSorting(){
        System.out.println("Choices :- ");
        System.out.println("1. BubbleSort");
        System.out.println("2. InsertionSort");
        System.out.println("3. SelectionSort");
        System.out.println("4. CountingSort");
        System.out.println("5. BucketSort");
        System.out.println("10. Exit");
        System.out.println("Input :: ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice==1){
            System.out.println("This is sorting utility : BubbleSort");
            System.out.println("Enter the Size of the array");
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>(n);
            System.out.println("Enter the array for sorting");
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                array.add(ele);
            }
            BubbleSort bs = new BubbleSort();
            ArrayList<Integer> arr = bs.BubbleSort(array);
        }else if(choice==2){
            System.out.println("This is sorting utility : InsertionSort");
            System.out.println("Enter the Size of the array");
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>(n);
            System.out.println("Enter the array for sorting");
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                array.add(ele);
            }
            InsertionSort is = new InsertionSort();
            ArrayList<Integer> arr = is.InsertionSort(array);
        }else if(choice==3){
            System.out.println("This is sorting utility : SelectionSort");
            System.out.println("Enter the Size of the array");
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>(n);
            System.out.println("Enter the array for sorting");
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                array.add(ele);
            }
            SelectionSort ss = new SelectionSort();
            ArrayList<Integer> arr = ss.SelectionSort(array);
        }else if(choice==4){
            System.out.println("This is sorting utility : CountingSort");
            System.out.println("Enter the Size of the array");
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>(n);
            System.out.println("Enter the array for sorting");
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                array.add(ele);
            }
            CountingSort cs = new CountingSort();
            ArrayList<Integer> arr = cs.CountingSort(array);
        }else if(choice==5){
            System.out.println("This is sorting utility : BucketSort");
            System.out.println("Enter the Size of the array");
            int n = sc.nextInt();
            ArrayList<Float> array = new ArrayList<Float>(n);
            System.out.println("Enter the array for sorting (Only in range 0 < ele < 1)");
            for (int i = 0; i < n; i++) {
                Float ele = sc.nextFloat();
                if(ele>1 || ele<0){
                    System.out.println("Input array values are wrong.");
                    return;
                }
                array.add(ele);
            }
            BucketSort bs = new BucketSort();
            ArrayList<Float> arr = bs.BucketSort(array);
        }
        return;

        //return choice;
    }
//    public static void main(String[] args) {
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your choice");
//        int choice=sc.nextInt();
//        while(choice!=6)
//        {
//            System.out.println("Enter your choice");
//            System.out.println("1.linear search");
//            System.out.println("2.Binary serach");
//            System.out.println("3.Jump Seach");
//            System.out.println("4.lower bound of element");
//            System.out.println("5.Upper bound of elemenbt");
//            System.out.println("6.exit ");
//            switch (choice)
//            {
//
//                case  1:
//                    System.out.println("Enter the key for searching using linearsearch");
//                    int key=sc.nextInt();
//                    System.out.println("Enter the Size of the array");
//                    int n = sc.nextInt();
//                    System.out.println("Enter the Aray for searching");
//                    ArrayList<Integer> array = new ArrayList<Integer>(n);
//                    for (int i = 0; i < n; i++)
//                    {
//                        int ele = sc.nextInt();
//                        array.add(ele);
//                    }
//                    LinearSearching.linearSearch(array,key);
//                    break;
//                case  2:
//                    System.out.println("Enter the key for searching using binarysearch");
//                    int key1=sc.nextInt();
//                    System.out.println("Enter the Size of the array");
//                    int n1= sc.nextInt();
//                    System.out.println("Enter the Aray for searching");
//                    ArrayList<Integer> array1 = new ArrayList<Integer>(n1);
//                    for (int i = 0; i < n1; i++)
//                    {
//                        int ele = sc.nextInt();
//                        array1.add(ele);
//                    }
//                    BinarySearch.binarySearch(array1,key1);
//                    break;
//                case  3:
//                    System.out.println("Enter the key for searching using jump search");
//                    int key3=sc.nextInt();
//                    System.out.println("Enter the Size of the array");
//                    int n3= sc.nextInt();
//                    System.out.println("Enter the Aray for searching");
//                    ArrayList<Integer> array3 = new ArrayList<Integer>(n3);
//                    for (int i = 0; i < n3; i++)
//                    {
//                        int ele = sc.nextInt();
//                        array3.add(ele);
//                    }
//                    JumpSearch.jumpSearch(array3,key3);
//                    break;
//                case 4:
//                    System.out.println("Enter the element whose lower bound you eant");
//                    int key4=sc.nextInt();
//                    System.out.println("Enter the Size of the array");
//                    int n4= sc.nextInt();
//                    System.out.println("Enter the Aray for searching");
//                    ArrayList<Integer> array4 = new ArrayList<Integer>(n4);
//                    for (int i = 0; i < n4; i++)
//                    {
//                        int ele = sc.nextInt();
//                        array4.add(ele);
//                    }
//                    Lowerbound.lowerbound(array4,key4);
//                case  5:
//                    System.out.println("Enter the element whose upper bound you want");
//                    int key5=sc.nextInt();
//                    System.out.println("Enter the Size of the array");
//                    int n5= sc.nextInt();
//                    System.out.println("Enter the Aray for searching");
//                    ArrayList<Integer> array5 = new ArrayList<Integer>(n5);
//                    for (int i = 0; i < n5; i++)
//                    {
//                        int ele = sc.nextInt();
//                        array5.add(ele);
//                    }
//                    Lowerbound.lowerbound(array5,key5);
//                default:break;
//
//
//            }
//
//        }
//        System.out.println("Hello Kushal!");
//    }
}