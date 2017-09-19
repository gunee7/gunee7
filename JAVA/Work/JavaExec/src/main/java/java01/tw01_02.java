package java01;

import java.util.Scanner;

public class tw01_02 {
    public static void main(String[] args) {
        
        Scanner keyborad = new Scanner(System.in); 
        System.out.println("정수를 입력하세요:"); 
        int x = keyborad.nextInt();
        
        System.out.println("문자를 입력하세요:");
        String y= keyborad.next();
        
        System.out.println( "더하기: " + x  );
        System.out.println( "더하기: " + y  );
        
        
    }
}
