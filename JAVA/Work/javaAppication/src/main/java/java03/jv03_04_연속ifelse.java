package java03;

import java.util.Scanner;

public class jv03_04_연속ifelse {
    public static void main(String[] args) {
        
        int x = 0;
        Scanner keyboard = new Scanner(System.in); // 키보드와 프로그램 연결
        System.out.println("점수를 입력하시오");
        x = keyboard.nextInt(); // 값을 입력 받아 salart 공간에 저장
        
        if (x >= 90) {
            System.out.println("학점: A ");
        } else if (x >= 80) {
            System.out.println("학점: B ");
        } else if (x >= 70) {
            System.out.println("학점: C ");
        } else if (x >= 60) {
            System.out.println("학점: D ");
        } else
        {
            System.out.println("학점: E ");
        }
    }
}
