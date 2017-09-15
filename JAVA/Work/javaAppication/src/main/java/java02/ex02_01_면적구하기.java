package java02;

import java.util.Scanner;

public class ex02_01_면적구하기 {
    public static void main(String[] args) {
        int w = 3;
        int h = 5;
        int area = w*h;
        int perimeter = 2*(w+h);
        
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("가로 : " );
        w = keyboard.nextInt();
        
        System.out.println("새로 : " );
        h = keyboard.nextInt();
        
        area = w*h;
        System.out.println("사각형의 넓이 = " +area);
        perimeter = 2*(w+h);
               
        System.out.println("사각형의 둘레 = " +perimeter);
    }
}
