import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a = 363;
        int b = 726;
        if(a == 0 || b == 0) {
            System.out.println(0);
        } else {
            while(a != 0 && b != 0) {
                if(a > b) {
                    a = a % b;
                } else {
                    b = b % a;
                }
            }
            System.out.println(a + b);
        }



    }

}
