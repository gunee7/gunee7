package java07;

import java.util.Scanner;

public class jv07_01_동적배열 {
    public static void main(String[] args){
        //배열의 선언
        Scanner keyboard = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하시오");
        int x = keyboard.nextInt();
        
        int [] numbers = new int[x];

         
        
        
        //배열에 for문을 이용하여 값을 대입하시오
        for (int i = 0 ; i < numbers.length ; i=i+1){
        numbers[i] = i;
        }
        for (int i = 0 ; i < numbers.length ; i=i+1){
        System.out.println( numbers[i]);
    
}
    }
}
