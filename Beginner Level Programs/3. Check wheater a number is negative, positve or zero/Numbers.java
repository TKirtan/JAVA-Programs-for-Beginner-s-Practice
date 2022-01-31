import java.lang.*;
import java.util.*;

class Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        if(a<0){
            System.out.println(a+" is negative");
        }else if(a==0){
            System.out.println(a+" is zero");
        }else{
            System.out.println(a+" is positive");
        }
    }
}