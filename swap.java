// passing array to function

import java.util.Scanner;

class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println("before swap a = "+arr[0]);
        System.out.println("before swap b = "+arr[1]);

        swap(arr);
        System.out.println("after swap a = "+arr[0]);
        System.out.println("after swap b = "+arr[1]);

    } 
    public static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}