import java.util.Scanner;

public class state_of_wakanda2 {
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
        for(int d = 0 ; d <arr.length ; d++){
            int i = 0;
            int j = d;
            while(i < arr.length && j< arr.length ){
                System.out.println(arr[i][j]);
                i++;
                j++;
            }
        }
}}
