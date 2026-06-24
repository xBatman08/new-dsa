import java.util.Scanner;

public class gaurav {
    public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number of row and columns");

        int n = scn.nextInt();
        int m = scn.nextInt(); 
        int[][] arr = new int[n][m];
		int target = 6;
        for(int i=0;i < n;i++) {
        	for(int j=0;j < m;j++) {
        		arr[i][j] = scn.nextInt();
        	}
			System.out.print("");
        }
		int rmin = 0;
		int cmin = 0 ;
		int rmax = arr.length -1;
		int cmax = arr[0].length - 1;
		int a = 0 ;
		int left = 0;
		//left
		for(int row = rmin ; row <= rmax ; row ++){
			a = arr[row][cmin];
			left = left + a;
		}
		//buttom
		int b = 0;
		int buttom = 0 ;
		for(int col = cmin ; col <= cmax ; col ++){
			b = arr[rmax][col];
			buttom = buttom + b;
		}
		//right
		int c = 0 ;
		int right = 0;
		for(int row = rmax; row >= rmin ; row --){
			c = arr[row][cmax];
			right = right + c;
		}
		//top 
		int d = 0;
		int top = 0;
		for(int col = cmin ; col >= cmax ; col ++){
			d = arr[rmin][col];
			top = top + d;
		}
		int sum1 = left + buttom;
		int sum2 = buttom + right ;
		int sum3 = top + right;

		if(sum1 > sum2 && sum1 > sum2){
			System.out.println("sum1 = "+sum1);
		}
		else if(sum2 > sum3 && sum2 > sum3){
			System.out.println("sum2 = "sum2);
		}
		else{
			System.out.println(sum3);
		}
		
}}
