import java.util.Scanner;

public class binary {
      public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter a array :");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter data which do you to search :");
        int k = sc.nextInt();
        int ans = binary(arr,k);
        System.out.println(ans);
        
    }
    public static int binary(int[] arr, int k){
        int left = 0;
        int right = arr.length -1;
        while (left<=right) { 
           int  mid = (left+right )/2;
           if(arr[mid] == k){
                return mid;
           }
           if(arr[mid]>k){
            right = mid -1;
           }
           else{
            left = mid +1;
           }
            
        }
        return -1;
    }
}
