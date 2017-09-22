package java04;

import java.util.Scanner;

import org.springframework.context.annotation.ScannedGenericBeanDefinition;

public class ex04_09_무한입력 {
    public static void main(String[] args) {
        
        int x = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("정수를 입력하시오");
        x = keyboard.nextInt();
        
        System.out.println("입력한 값은" + x + "입니다.");

        int s = 0;
        for (int i=1; i<=10000; i=i+1) {
                    s = s * i;
        }
        
        if ( x < 0) {
            System.out.println("정상 종료합니다.");
        } else {
            System.out.println("정수를 입력하시오");
            System.out.println();
        }
        
        
        System.out.println();
    }
}
