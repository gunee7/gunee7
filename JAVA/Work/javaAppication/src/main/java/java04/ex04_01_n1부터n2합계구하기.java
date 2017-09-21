package java04;

import java.util.Scanner;

public class ex04_01_n1부터n2합계구하기 {
    public static void main(String[] args){
        
    int n1 = 0, n2 = 0;
    int sum = n1 + n2 ;
      
    Scanner keyboard = new Scanner(System.in);
    System.out.print("정수를 입력하세요 : ");
    n1 = keyboard.nextInt(); // 정수 입력
    n2 = keyboard.nextInt(); // 정수 입력
    
    for (int i=1; i<=10; i=i+1) {
                sum = sum * i;
    }


    } 
}
