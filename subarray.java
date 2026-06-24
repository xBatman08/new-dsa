import java.util.*;
class subset {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ans :");

        for(int si = 0 ;si< arr.length ; si++){
            for(int ei = si; ei < arr.length ; ei++){
                for( int i = si; i<=ei ; i++){
                    System.out.println(arr[i] + " ");
                }
            }System.out.println();
        }
    }
    
}