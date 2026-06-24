import java.util.Scanner;

class NcR{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nf = factorial(n);
        int rf = factorial(r);
        int nmrf = factorial(n-r);
        int ans = nf/(rf *nmrf);
        System.out.println("ans = "+ans);
    }
    public static int factorial(int x){
        int xf =1;
        for(int i =1;i<=x;i++){
            xf = xf *i;
        }
        return xf;
    }

}
