package java04;

import java.util.Scanner;

public class ex04_14_for실습예제_구구단_가로출력 {
      public static void main(String[] args){
        
        int r =0;
        int x =0;
        int y=0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("구구단 시작값을 입력하시요 :");
        x = keyboard.nextInt();
        
        System.out.println("구구단 종료값을 입력하시요 :");
        y = keyboard.nextInt();
        
        for(int i=x ; i<=y ; i=i+1){
            for(int j=1 ; j<=9 ; j=j+1){
            r = i * j;
            
            System.out.print(i+"x"+j + "=" + r);   
            
            if ( j<9  ) 
                System.out.print(",") ;
                
             else 
                System.out.print(".") ;
               
             }
            System.out.println();
        }
            
                
    }
    
        }
    


