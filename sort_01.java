import java.util.Scanner;

public class sort_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a array :");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);
        System.out.println("answer is :");
        display(arr);
    }
    public static void sort(int[] arr){
        int i =0;
        int j =0;
        while(i < arr.length){
            if(arr[i] == 0){
                swap(arr,i,j);
                i ++;
                j++;

            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr ,int i,int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void display(int[] arr) {
		for(int i=0;i < arr.length;i++) {
			System.out.println(arr[i]);
        }
}
}
