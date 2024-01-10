package com.example.shellsort;
public class Main {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // gap will be divided by two  --> gap/=2
        for (int gap= intArray.length / 2; gap > 0; gap /= 2) {
            //the following code is like insertion sort but with the gap
            for ( int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];
                int j = i;
                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    //substract the gap from j
                    j -= gap;
                }

                intArray[j] = newElement;
            }

        }

        for ( int i = 0; i< intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
