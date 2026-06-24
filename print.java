import java.util.*;

public class print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nod =0;
        int a=n;
        while(n!=0){
            n =n/10;
            nod=nod+1;
            
        }
        System.out.println("count =" +nod);
        int div = (int)Math.pow(10,nod -1);
        while(div!=0){
           
            int q=a/10;
            int r = a%10;
            System.out.println(q);
            a=r;
            div = div/10;

        }
        


    }
}