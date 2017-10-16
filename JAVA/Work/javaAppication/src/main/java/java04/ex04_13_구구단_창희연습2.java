package java04;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import org.springframework.context.annotation.ScannedGenericBeanDefinition;

public class ex04_13_구구단_창희연습2 {
    public static void main(String[] args) {
        
        
        for (int i = 1; i <= 5; i = i + 1) {
            for (int j = 1; j <= 5; j = j + 1) {
                
                System.out.print("[" + i + "," + j + "]");   
              if( i <=5)  
                  System.out.println();
              else
                  System.out.print();
                
                
            }
            
            System.out.println();
            
        }
        
    }
}
