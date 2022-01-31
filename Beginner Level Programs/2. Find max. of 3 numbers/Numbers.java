import java.lang.*;
import java.util.*;

class Numbers {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(a>b && a>c){
            System.out.print(a+" is greatest among three");
        }else if(b>a && b>c){
            System.out.print(b+" is greatest among three");
        }else if(c>a && c>b){
            System.out.print(c+" is greatest amomg three");
        }else{
            System.out.print("all are equal");
        }
    }
}