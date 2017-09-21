package java04;

import java.util.Scanner;

import org.springframework.context.annotation.ScannedGenericBeanDefinition;

public class ex04_04_합계구하기1 {
    public static void main(String[] args){
        
        int x = 0;
        int y = 0;

        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("정수의 시작값를 입력하시오.");
        x = keyboard.nextInt(); // 정수 입력
        System.out.print("정수의 종료값을 입력하세요.");
        y = keyboard.nextInt(); // 문자열 입력
       
        int r = 0;
        for (int i=x; i<=y; i=i+1) {
            r = r + i;
        }


        if ( x > y ) {
            System.out.println("종료값을 temp에 넣는다.") ;
           
         }
         else {
            System.out.println("temp을 시작값에 넣는다.") ;


        System.out.println( x +"부터"+y +"까지의 합계는" + r + "입니다.");
    }
}   
    }

