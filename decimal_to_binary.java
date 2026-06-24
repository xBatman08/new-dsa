import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int ans = decimal_to_binary(n,b);
        System.out.println("ans = "+ans);

    }
    public static int decimal_to_binary(int n ,int b){
        int power = 1;
        int ans = 0;
        while(n!=0){
            int r =n % b;
            n = n/b;
             ans = ans+(r*power);
            power = power *10;

        }
        return ans;
    }
}
