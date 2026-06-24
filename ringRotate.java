import java.util.Scanner;

public class ringRotate {
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
        int sh = 1;
        int ro = 2;
        

        Ringrotate(arr,sh,ro);
        display(arr);
}
    public static void Ringrotate(int[][] arr,int sh,int ro){
        int [] la = fill1dfrom2d(arr,sh);
        rotate(la,ro);
        fill2dfrom1d(arr,la,sh);

    }
    public static int[] fill1dfrom2d(int[][] arr,int sh ){
        int idx = 0;
        int rmin = sh - 1;
        int cmin = sh -1;
        int rmax = arr.length -1;
        int cmax = arr[0].length -1;
        int sz = 2*(rmax + cmax -rmin -cmin);
        int [] la = new int[sz];
        //left 
        for(int row = rmin ; row < rmax ; row ++){
            la[idx] = arr[row][cmin];
            idx++;
        }
        cmin ++;
         //butttom
         for(int col = cmin ; col<cmax ; col ++){
            la[idx] = arr[rmax][col];
            idx++;
         }
         rmax--;
         //right 
         for(int row = rmax ; row> rmin ; row--){
            la[idx] = arr[row][cmax];
            idx++;
         }
         cmax--;
         //top
         for(int col = cmax ; col>cmin ; col --){
            la[idx] = arr[rmin][col];
            idx++;
         }
         return la;

    }
    public static void rotate(int[] la , int ro){
        reverse(la.length,ro);
        reverse()
    }
    public static void reverse() 
    public static void fill2dfrom1d(int[][] arr, int la,int sh){

    }
}
