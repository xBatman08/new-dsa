import java.util.Scanner;


public class linear {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter a array :");
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter data which do you to search :");
        int k = sc.nextInt();
        linear(arr,k);
    }
    public static void  linear(int arr[],int k){
        for (int i = 0; i<arr.length; i++){
            if(arr[i] == k){
                System.out.println("yes");
            }
        }
    }
}
