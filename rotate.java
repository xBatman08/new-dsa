
import java.util.Scanner;


public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("enter a value of k ");
        int k = sc.nextInt();
        System.out.println("enter a array : ");
        for(int i =0; i<6; i++){
            arr[i] = sc.nextInt();
        }
        rotate(arr,k);
        System.out.println("ans :");
        display(arr);


    }
    public static void rotate(int[] arr,int k){
        k = k % 6;
        if(k<0){
            k = k + 6;
        }
        reverse( arr,0,arr.length -1);
        reverse( arr ,0,k -1);
        reverse( arr,k , arr.length -1);


    }
    public static void reverse(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }
    }
    public static void display(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
    
}

