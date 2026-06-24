import java.util.Scanner;

public class digit_frequency {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int ans = digit_frequency(n,d);
        System.out.println("ans ="+ans);

    }
    public static int digit_frequency(int n ,int d){
        int count =0;
        while(n!=0){
            int r = n%10;
             n = n/10;
            
             if (r ==d){
                count = count +1;
             }
        }
        return count ;

    }
    
}
