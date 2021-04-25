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
             if ( arr[middle] < num ){ // If the middle element is is less than the number we are looking for, we must only search for the in the top half
                  first = middle + 1; // We shift first 1 position up
             }
             else if ( arr[middle] == num ){ // If middle element is equals to number we are looking then the search is over.
                  System.out.println(num + " found at index or location " + (middle) + " of the array.");
                  return middle ; // We return the index on which we found the element 
                  
             }else{ // If the middle element is is greater than the number we are looking for, we must only search for the in the bottom half
                 last = middle - 1; // We shift last 1 position down
             }
         } 
         System.out.println("the key number ["+ num + "] does not belong to this array.");
         return - 1 ;//getting to this point means that the element does not belong to the given array
    }
        
    // Testing the program from the main method
    public static void main(String[] args) {
          int[] arrl = {3,5,6,9,11,15,18,22};
          binarySearch(arrl, 15);
          binarySearch(arrl, 10);
          binarySearch(arrl, 6);
    }
    
}
