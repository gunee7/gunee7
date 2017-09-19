package java04;

import java.util.Scanner;

public class ex04_04_합계구하기 {
    public static void main(String[] args) {
        
        
        Scanner keyborad = new Scanner(System.in);

        int sum = 0;
        
        System.out.println("시작값을 입력하세요");       
        int start = keyborad.nextInt();
        
        System.out.println("종료값을 입력하세요");       
        int end = keyborad.nextInt();

        for( int i = start; 
                        i <= end; 
                                i = i + 1) {
        sum = sum + i;
        }
        System.out.println(start + "부터" +end +"까지의" + "합계는:");
        
    }
    
}
