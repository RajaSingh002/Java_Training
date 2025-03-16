import java.util.Arrays;

public class Array_Practice {

    public class Student{
        String name;
        int age;
        Student(String name,int age){
            this.name=name;
            this.age=age;
        }

        @Override
        public String toString(){
            return "Name "+this.name+" Age "+ this .age;
        }
    }

    public static void main(String[] args) {
        boolean arr[] = new boolean[10];
        System.out.println(arr[0]);
        int arr1[] = new int[] { 1, 2, 3 };// Array Initializer
        int arr2[];
        arr2 = new int[] { 2, 34, 5 };// Array Initializer
        int arr3[] = { 2, 3, 4, 5 };// Anonymus Array
        System.out.println(arr2[1]);
        char[] ch = new char[3];
        String[] str = new String[23];
        
        Array_Practice a=new Array_Practice();
        Student []st=new Student[]{
           a.new Student("Raja", 12)
        };

        System.out.println(st[0]);

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i] + " ");
        }

    for(int i=0;i<arr3.length;i++){
        arr3[i]=arr3.length-i;
    }
   
    for (int i = 0; i < arr3.length; i++) {
        System.out.print(arr3[i] + " ");
    }

    for(int x:arr3){
       
        System.out.print(x+" ");
        x+=2;
    }

    int[] arr8 = {10, 20, 30, 40};

    for (int num : arr8) {
        num = num * 2;
        System.out.println("Value: " + num);
       
    }
    for(int i=0;i<arr8.length;i++){
        arr8[i]=arr8[i]*2;
    }
    System.out.println(Arrays.toString(arr8));

   System.out.println();
   System.out.print(Arrays.toString(arr3));

    Object object=arr3;
    if(object instanceof int[]){
    System.out.println(true);
    }






    }
}
