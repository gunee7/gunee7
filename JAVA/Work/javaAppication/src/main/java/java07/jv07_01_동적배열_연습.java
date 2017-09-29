package java07;

import java.util.Scanner;

import org.springframework.context.annotation.ScannedGenericBeanDefinition;

public class jv07_01_동적배열_연습 {
    public static void main(String[] args){
        
        int x = 0;
        
        Scanner keyboard = new Scanner (System.in);
        System.out.println("배열의 크기를 입력하시오");
        x = keyboard.nextInt();
      
        int size = x;
        int [] numbers = new int[size];
        
        for (int i = 0 ; i< numbers.length ; i=i+1){
        numbers[i] = i;
        }
        for (int i = 0; i<numbers.length ; i=i+1){
        System.out.println(numbers[i]);
        } 
            
            
        }
        
        
      
    }

