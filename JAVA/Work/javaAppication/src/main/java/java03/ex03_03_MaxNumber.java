package java03;

import java.util.Scanner;

public class ex03_03_MaxNumber {
    
    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        int z = 0;
        
        Scanner keyborad = new Scanner(System.in);
        System.out.println("첫번째 수를 입력하세요:");
        x = keyborad.nextInt();
        
        System.out.println("두번째 수를 입력하세요:");
        y = keyborad.nextInt();
        
        System.out.println("세번째 수를 입력하세요:");
        z = keyborad.nextInt();
        
        if (x >= y) {
            if (x >= z) {
                System.out.println("입력 받은 수중 카장큰 수는" + x + "입니다");
                
                    } else {
                        if (y >= x) {
                            if (y >= z) {
                            System.out.println("입력 받은 수중 카장큰 수는" + y + "입니다");
                    }

                
            } else {
                System.out.println("입력 받은 수중 카장큰 수는" + z + "입니다");
            }
        }
    }

    }
}
