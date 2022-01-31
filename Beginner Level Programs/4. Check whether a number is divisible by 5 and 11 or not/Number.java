import java.lang.*;
import java.util.*;

class Number {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        int b = a%5;
        int c = a%11;

        if(b==0 && c==0){
            System.out.print(a + " is divisible by 5 and 11");
        } else {
            System.out.print(a + " is not divisible by 5 and 11");
        }
    }
}