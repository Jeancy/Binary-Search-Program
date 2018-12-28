/*
 * Given an array of integers and an integer value, check if the value belongs to the array and
 * its position. 
 * Binary search is a fast search algorithm with run-time complexity of Ο(log n)
 *
 */
package binarysearchprogram;

import java.util.Arrays;

/**
 *
 * @author Jeancy Tshibemba
 * 
 */
public class BinarySearchProgram {
    /**
     * 
     * @param arr array of data 
     * @param num to be checked
     * @return 
     */
    
    public static int binarySearch(int [] arr , int num){
         int first  = 0;
         int last   = arr.length - 1;
         // To implement the binary search the array needs to be sorted first;
         Arrays.sort(arr); // sorting the array
         while( first <= last ){
             int middle = (first + last)/2;
             if ( arr[middle] < num ){
                  first = middle + 1;    
             }
             else if ( arr[middle] == num ){
                  System.out.println(num + " found at index or location " + (middle) + " of the array.");
                  return middle ;
                  
             }else{
                 last = middle - 1;
             }
         } 
         System.out.println("the key number ["+ num + "] does not belong to this array.");
         return - 1 ;//getting to this point m eans that the element does not belong to the given array
    }
        
    // Testing the program from the main method
    public static void main(String[] args) {
          int[] arrl = {3,5,6,9,11,15,18,22};
          binarySearch(arrl, 15);
          binarySearch(arrl, 10);
          binarySearch(arrl, 6);
    }
    
}
