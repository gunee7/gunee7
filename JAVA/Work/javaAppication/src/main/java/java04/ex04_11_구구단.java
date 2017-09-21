package java04;

import java.util.Scanner;

public class ex04_11_구구단 {
    public static void main(String[] args) {
        
       
        int r = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("시작 단수를 입력하세요 : ");
        int 시작값 = keyboard.nextInt(); // A 입력
        System.out.print("종료 단수를 입력하세요 : ");
        int 종료값 = keyboard.nextInt(); // B 입력

        for (int i = 시작값; i <= 종료값; i = i + 1) { //i에A입력밧을 넣는다.
            for (int j = 1; j <= 9; j = j + 1) {
                r = i * j;
                
                System.out.print(i + "*" + j + " = " + r);

            if ( j<9  ) //J뒷자리가 9보다 작으면
                System.out.print(",") ;
                
             else 
                System.out.print(".") ;
        }
            System.out.println();
        }
        //줄바꿈을 넣을 수 있는 곳 두번째곳 (FOR가 끝나는
    }
    
}

