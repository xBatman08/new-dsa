import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k =sc.nextInt();
        int nod =0;
        
        int n = num ;
        while(n!=0){
            n =n/10;
            nod = nod+1;
        }
        k = k % nod;
        if(k<0){
            
        }
        int div = (int)Math.pow(10,k);
        int multi = (int)Math.pow(10,nod-k);
       
        int q = num /div;
        int r =num %div;
        r = (r*multi)+q;
        System.out.println(r);

    }
    
}

