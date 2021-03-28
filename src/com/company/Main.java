package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        int q = input.nextInt();
        int[] arr1 = getFilledArray(10, q, (x,y)->{return x+y;});
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = getFilledArray(10, q, (x,y)->{return x*y;});
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = getFilledArray(10, q, (x,y)->{return x*y*2;});
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = getFilledArray(10, q, (x,y)->{return x*y+2;});
        System.out.println(Arrays.toString(arr4));

    }

    static int[] getFilledArray(int length, int modfy, FInt a) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.process(i, modfy);
        }
        return arr;

    }

}

