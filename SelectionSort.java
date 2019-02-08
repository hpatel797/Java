/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harshpatel_a4_selectionsort.java;

/**
 *
 * @author hpatel797
 */
public class SelectionSort {
     // Start of selectionSort
    public <T extends Comparable<T>> void selectionSort(T[] array) {
        int min; // pointer to current min
        int len = array.length; // length of array
        for(int i = 0; i < len - 1; i++) { //go through each element  
            min = i; // innitialize position of min
            for(int idx = i + 1; idx < array.length; idx++) {
                if(array[idx].compareTo(array[min]) < 0)
                    min = idx; // Comparing the current min with next element
            }
            swap(array, i, min);
            // Swap the position of the new minimum with the initial min pointer.
        }
    } // End of selectionSort

  
    public <T extends Comparable<T>> void printArray(T[] arr) {
        System.out.print("["); 
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1) 
                System.out.print(", "); //no space after last element
        }
        System.out.println("]");
    } 

    private <T extends Comparable<T>> void swap(T[] ary, int p1, int p2) {
        T temp = ary[p1];
        ary[p1] = ary[p2]; // swapping val of a[x] with a[y]
        ary[p2] = temp;
    } 
    
}
