
import java.util.*;

class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("enter a array :");
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        reverse( arr);
        System.out.println("after reverse:");
        display(arr);
    }

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length -1 ;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
         
            left++;
            right--;
        }
    }
    public static void display(int[] arr){
        int n = arr.length ;
        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }
  
    }
}
