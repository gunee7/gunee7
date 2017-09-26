package java04;

import java.util.Scanner;

import org.springframework.context.annotation.ScannedGenericBeanDefinition;

public class ex04_07_합계구하기2 {
    public static void main(String[] args) {
        
        // 변수 선언 및 초기화
        int sum = 0;
        int x = 0; // 시작값
        int y = 0; // 종료값
        
        // 표준 입력;키보드에서 숫자 2개받기
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작값를 입력하시오.");
        x = keyboard.nextInt(); // 정수 입력
        
        System.out.print("종료값을 입력하세요.");
        y = keyboard.nextInt(); // 문자열 입력
 

        for( int i=x;  i<=y; i=i+1 ) {
            sum = sum + i;
        }
        System.out.println( x +"부터" + y + "까지의 합은" + sum + "입니다");
        
        }
        
    }



