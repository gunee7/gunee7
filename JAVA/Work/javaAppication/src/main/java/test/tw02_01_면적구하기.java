package test;

import java.util.Scanner;

public class tw02_01_면적구하기 {
    public static void main(String[] args) {
        
        int w = 0;
        int h = 0;
        double area = w*h;
        double perimeter = 2*(w+h);
        
        Scanner keyborad = new Scanner(System.in);
        System.out.println("가로의 길이:");
        System.out.println("세로의 길이:");    
        w = keyborad.nextInt(); 
        h = keyborad.nextInt();
                
        area = w*h;
        perimeter = 2*(w+h);
        
        System.out.println("직사각형의 넓이:" +area);                            
        System.out.println("직사각형의 둘레:" +perimeter);

        
    }
}
