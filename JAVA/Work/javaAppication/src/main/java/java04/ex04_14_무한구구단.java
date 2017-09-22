package java04;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

import org.springframework.context.annotation.ScannedGenericBeanDefinition;

public class ex04_14_무한구구단 {
    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        int tmp;
        int r = 0;
                 
        
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작 단수를 입력하세요 : ");
        int i = keyboard.nextInt(); // A 입력
        System.out.print("종료 단수를 입력하세요 : ");
        int j = keyboard.nextInt(); // B 입력
        r = i * j;
       
        System.out.println(i + " * " + j + "= " + r);
    
        if ( i > j) {
            System.out.print(j + " * " + i + "= " + r);
            
        } else {
            System.out.print("시작 단수를 입력하세요 : ");
            i = keyboard.nextInt(); // A 입력
            System.out.print("종료 단수를 입력하세요 : ");
            j = keyboard.nextInt(); // B 입력
        }

    }
    
}
