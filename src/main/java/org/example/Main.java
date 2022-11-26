package org.example;

import org.example.searching.BinarySearch;
import org.example.searching.JumpSearch;
import org.example.searching.LinearSearching;
import org.example.searching.Lowerbound;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        while(choice!=6)
        {
            System.out.println("Enter your choice");
            System.out.println("1.linear search");
            System.out.println("2.Binary serach");
            System.out.println("3.Jump Seach");
            System.out.println("4.lower bound of element");
            System.out.println("5.Upper bound of elemenbt");
            System.out.println("6.exit ");
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

        }
        System.out.println("Hello Kushal!");
    }
}