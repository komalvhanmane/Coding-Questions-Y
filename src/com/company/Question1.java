package com.company;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int x = arr[0];

        for(int i=1;i<n;i++){
            x = x & arr[i];
        }

        //2 3 4 5
//        2&3&4&5
        System.out.println(x);
    }
}
