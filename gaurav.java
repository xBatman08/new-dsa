import java.util.ArrayList;
import java.util.Scanner;

public class gaurav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(sc.nextInt());

        for(int i = 0 ; i <al.size(); ){
            for(int n = 0;n<i; n++){
                if(i%n == 0){
                    i++;
                }
                else{
                    System.out.println(i);
                }
            }
                
            }
    }
}
