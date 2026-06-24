import java.util.*;
public class sum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1 value: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for(int i =0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("enter n2 value: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n1];
        for(int i =0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }
        int sz = Math.max(n1, n2) + 1;
        int[] ans = new int[sz];

        int i = arr1.length -1;
        int j = arr2.length -1;
        int k = ans.length -1;
        int carry = 0;
        int sum = 0;
       


        while (true) { 
            sum =  carry ;
            if(i >= 0){
                sum = sum + arr1[i];
        }
        if(j >= 0){
            sum = sum + arr2[j];
    }
        if(sum < 10){
           
            carry = 0;
        }
        else{
            sum = sum -10;
            carry = 1;
            
        }
        ans[k] = sum;
        i --;
        k--;
        k--;
        

    }

   
    
}

    
}

