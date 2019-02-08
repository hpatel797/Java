/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harshpatel_a4_selectionsort.java;
import java.util.Scanner;

/**
 *
 * @author hpatel797
 */
public class HarshPatel_A4_SelectionSortJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SelectionSort ss = new SelectionSort(); 
        Scanner input = new Scanner(System.in);
        int len; // input size of array
        System.out.print("Enter array length: ");
        len = input.nextInt();

        Integer[] intData = new Integer[len]; //initilize int array
        Float[] floatData = new Float[len]; // initialize floar array 

        System.out.print("Enter " + len + " integers: ");
        for(int i = 0; i < len; i++) {
            intData[i] = input.nextInt();   // inserting values
        } 

        System.out.print("Enter " + len + " floating point values: ");
        for(int i = 0; i < len; i++) {
            floatData[i] = input.nextFloat(); //inserting values
        } 

        // Start processing the integer array
        System.out.print("\n Unsorted Integer Array: ");
        ss.printArray(intData);
        ss.selectionSort(intData);
        System.out.print(" Sorted Integer Array: ");
        ss.printArray(intData);
        // End of processing the integer array

        // Start processing the float array
        System.out.print("\n Unsorted Float Array: ");
        ss.printArray(floatData);
        ss.selectionSort(floatData);
        System.out.print(" Sorted Float Array: ");
        ss.printArray(floatData);
        // End of processing the float array
    }   
}
