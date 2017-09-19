package java03;

import java.util.Scanner;

public class jv02_01_LargeSmall {
    public static void main(String[] args) {
        int n = 120;
        
        Scanner keyborad = new Scanner(System.in);
        System.out.println("Grade : " + n );
        
        int x = keyborad.nextInt();
        
        if ( n >= 100) {
            System.out.println("large");
        }
        else {
            System.out.println("small");
            
        }
    }
}
