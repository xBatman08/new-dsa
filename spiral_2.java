import java.util.Scanner;

public class spiral_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row and col");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("matrix is = ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0 ;
        int rmin = 0;
        int cmin = 0;
        int rmax = arr.length -1;
        int cmax = arr[0].length -1;
        System.out.println("ans = ");
        while(count < n*m){
            //top
            for(int col = cmin ; col<=cmax && count < m*n; col ++){
                System.out.println(arr[rmin][col]);
                count++;
            }
            rmin++;
            //right 
            for(int row = rmin ; row <= rmax && count < n*m ; row++){
                System.out.println(arr[row][cmax]);
                count ++;
            }
            cmax--;
            //buttom
            for(int col = cmax ;col>= cmin && count < n*m ; col--){
                System.out.println(arr[rmax][col]);
                count ++;
            }
            rmax--;
            //left
            for(int row =rmax ; row >= rmin && count < n*m; row--){
                System.out.println(arr[row][cmin]);
                count ++;
            }
            cmin ++;
        }
    }
}

