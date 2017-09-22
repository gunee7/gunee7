package java04;

import java.util.Scanner;

import org.springframework.context.annotation.ScannedGenericBeanDefinition;

public class jv04_21_무한루프 {
    public static void main(String[] args){
        
        int x = 0;
       
        int r = 0;
        int z = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        x = keyboard.nextInt();
        System.out.println("입력한 값은" + x + "입니다." );
        
        for( r=x; true ;r=r+1 ) {

            // 반복되는 코드를 적는다.
            }
            // 루프 탈출
            if( x < 0 ) {
                System.out.println(x) ;
            }
                break; {
                    System.out.println(z) ;
        
                }   
    }
}
