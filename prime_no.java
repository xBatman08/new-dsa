import java.util.*;
class prime_no{
    public static void main(System[] args){
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
        }}
        