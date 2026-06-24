
import java.util.Scanner;

public class subset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int tns = (int) Math.pow(2, arr.length);

        for (int i = 0; i < tns; i++) {
            int bn = dtobin(i, 2);
            int div = (int) Math.pow(10, arr.length - 1);
            for (int j = 0; j < arr.length; j++) 
            {

                int q = bn / div;
                int r = bn % div;
                if (q == 1) {
                    System.out.println(arr[j]+" ");
                }
                else{
                    System.out.println("-" + " ");
                }
                bn = r;
                div = div /10;
            }
            System.out.println();
        }
    }

    public static int dtobin(int n, int b) {
        int ans = 0;
        int power = 1;

        while (n != 0) {
            int r = n % b;
            n = n / b;

            ans = ans + (r * power);
            power = power * 10;
        }

        return ans;

    }
}
