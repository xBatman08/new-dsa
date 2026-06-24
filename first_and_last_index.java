import java.util.Scanner;

public class first_and_last_index {
     public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a array :");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter data which do you to search :");
        int k = sc.nextInt();
        int fi = -1;
        int li = -1;
        int left = 0;
        int right = arr.length -1;

        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid] == k){
                fi = mid;
                right = mid +1;

            }
            if(arr[mid]<k){
               
                left = mid + 1;
            }
            else {
                
                right = mid -1;
            }
        }
        System.out.println("first index = "+fi);

    
		 li = -1;
		left = 0;
		right = arr.length - 1;
		while(left <= right) {
			int mid = (left+right)/2;
			if(arr[mid] == k) {
				li = mid;
				left = mid + 1;
			}
			else if(arr[mid] < k) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
        System.out.println("last index = "+li);
        }
    }

