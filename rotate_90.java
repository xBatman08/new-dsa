import java.util.Scanner;

public class rotate_90 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        rotate(arr);
        display(arr);
}
public static void rotate(int[][] arr) {
    //1. Take transpose
    for(int i=0;i < arr.length - 1;i++) {
        for(int j=i+1;j < arr.length;j++) {
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }
    int left = 0;
 		int right = arr.length - 1;
 		while(left < right) {
 			for(int row=0;row < arr.length;row++) {
 				int temp = arr[row][left];
 				arr[row][left] = arr[row][right];
 				arr[row][right] = temp;
 			}
 			left++;
 			right--;
 		}
 	}

public static void display(int[][] arr) {
    for(int i=0;i < arr.length;i++) {
        for(int j=0;j < arr.length;j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}
}
