/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.sorting;

/**
 *
 * @author apprentice
 */
public class SortingAnArray {

    public static void main(String[] args) {
        int[] arr = {45, 87, 39, 32, 93, 86, 12, 44, 75, 50};

        // Display the original (unsorted values)
        System.out.print("before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j--) {
                if (arr[i] == arr[j]) {
                    int src = i;
                    int dest = arr[j];//place in j to compare with
                    int temp = arr[src];//starting index
                    arr[src] = arr[dest];//index spot is swapped with second index
                    arr[i++] = temp;//moving to next slot to be swapped
           
                } //trying to sort through the numbers in the array,  i would be normal array index while j was the one I was swapping i's indexes with
            }
        }

        System.out.print("after : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
