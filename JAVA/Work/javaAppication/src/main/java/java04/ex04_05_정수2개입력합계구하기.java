package java04;

import java.util.Scanner;

public class ex04_05_정수2개입력합계구하기 {
    public static void main(String[] args){
    
        int sum =0;
        int x = 0;
        int y = 0;
        
        Scanner keyboard = new Scanner (System.in);
        System.out.println("시작값을 입력하세요");
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        
        
        for(int i=1; i<=2; i=i+1) {
        sum = sum + i;
        }
        for(int i=2; i<=3; i=i+1) {
            sum = sum + i;
            }
        
        System.out.println( x +"부터" + y + "까지의 합은" + sum + "입니다");
    } 
        
    
}
