import java.util.*;
public class Array_Methods {
    public static void main(String[] args) {
        
        int arr[]={1,2,-2,3,4,5};
       
        Arrays.sort(arr);
        int []arr2=Arrays.copyOf(arr, arr.length);
        if(Arrays.equals(arr, arr2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println(Arrays.toString(arr2));
        int i=Arrays.binarySearch(arr,99);
        System.out.println(i);
       int arr3[]=new int[10];
       Arrays.fill(arr3,6);
       System.out.println(Arrays.toString(arr3));

    }
}
