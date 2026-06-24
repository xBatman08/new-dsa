import java.util.Scanner;

class broken_economy{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a array :");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter data which do you to search :");
        int k = sc.nextInt();

        int ceil = -1;
        int floor = -1;
        int left = 0;
        int right = arr.length -1;

        while(left<= right){
            int mid = (left+right)/2;

            if(arr[mid] == k){
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
            if(arr[mid]<k){
                floor = arr[mid];
                left = mid + 1;
            }
            else {
                ceil = arr[mid];
                right = mid -1;
            }
        }
        System.out.println("floor =" +floor);
        System.out.println("ceil = "+ceil);
    }
}