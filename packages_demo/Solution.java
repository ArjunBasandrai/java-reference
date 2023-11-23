package packages_demo;
import packages_demo.Pkg1.*;
import packages_demo.Pkg2.*;

import java.util.Scanner;

class Merge_Arrays extends Int_Sort implements Int_Array {
    int [] arr3;
    int n3;
    
    //Function to read an array
    public void read_arr (int[] arr, int n, Scanner scan){
        for (int i=0; i<n ; i++){
            arr[i] = scan.nextInt();
        }
    }
    
    //Function to print an Array
    public void print_arr (){
        for (int i=0; i<n3; i++){
            System.out.println(arr3[i]);
        }
    }
    
    //Function to merge and sort the arrays
    public void merge(int[] arr1, int n1, int[] arr2, int n2){
        arr3 = new int[n1+n2];
        int index = -1;
        for (int i=0; i<n1; i++){
            arr3[++index] = arr1[i];
        }
        for (int i=0; i<n2; i++){
            arr3[++index] = arr2[i];
        }
        n3 = arr3.length;
        
        
        for (int i=0; i<n3-1; i++){
            for (int j=0; j<n3-i-1; j++){
                if(arr3[j] > arr3[j+1]){
                    int temp = arr3[j];
                    arr3[j]=arr3[j+1];
                    arr3[j+1] = temp;
                }
            }
        }
    }
    
}




public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arr1;
        int[] arr2;
        Merge_Arrays obj = new Merge_Arrays();
        
        //Reading the Arrays
        int n1 = scan.nextInt();
        arr1 = new int[n1];
        obj.read_arr(arr1, n1, scan);
        int n2 = scan.nextInt();
        arr2 = new int[n2];
        obj.read_arr(arr2, n2, scan);
        
        obj.merge(arr1, n1, arr2, n2);
        
        obj.print_arr();
    }
}