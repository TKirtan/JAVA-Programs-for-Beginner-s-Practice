import java.lang.*;
import java.util.*;

class Numbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if(a>b){
            System.out.print(a+" is greater than" +b);
        }else{
            System.out.println(b+" is greater than "+a);
        }
    }
}