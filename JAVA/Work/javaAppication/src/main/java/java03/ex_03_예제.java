package java03;

import java.util.Scanner;

public class ex_03_예제 {
    public static void main(String[] args) {
        int K = 0;
        
        Scanner keyborad = new Scanner(System.in);
        System.out.println("K:");
        K = keyborad.nextInt();
        
        if (K <= 0) {
            System.out.println("A:");
        }
        if (K > 3) {
            System.out.println("B:");
        } else {
            System.out.println("C :");
        }
        
    }
}
