package java01;

import java.util.Scanner;

public class tw01_04_예제면적구하기 {
    public static void main(String[] args) {
        
        int w = 0;
        int h = 0;
        int area = w*h;
        int perimeter = 2*(w+h);
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("가로의 길이");
        w = keyboard.nextInt();
        
        System.out.println("세로의 길이");
        h = keyboard.nextInt();
        area = w*h ;
        perimeter = 2*(w+h);
        
        System.out.println("직사각형의 넓이" + area);
        
        System.out.println("사각형의 둘레" + perimeter);

        
    }
}
