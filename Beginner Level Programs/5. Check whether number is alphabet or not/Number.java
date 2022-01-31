import java.lang.*;
import java.util.*;

class Number {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Character");

        char x = s.next().charAt(0);

        if((x>='A' && x<='Z')||(x>='a' && x<='z')){
            System.out.print(x + " is an alphabet");
        } else {
            System.out.println(x + " is not an alphabet");
        }
    }
}