package java04;

import java.util.Scanner;

public class ex04_13_구구단_창희연습완성 {
    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        int r = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("구구단의 시작단수 입력:");
        x = keyboard.nextInt();
        
        System.out.println("구구단의 종료단수 입력:");
        y = keyboard.nextInt();
        
        for (int i = x; i <= y; i = i + 1) {
            for (int j = 1; j <= 9; j = j + 1) {
                r = i * j;
                System.out.print(i + "*" + j + "=" + r + " ");
           
                if (j < 9) // J뒷자리가 9보다 작으면
                    System.out.print(",");
                
                else
                    System.out.print(".");
            }
            System.out.println();
        }
        
    }
}
