package java07;

import java.awt.RenderingHints.Key;
import java.util.Scanner;

public class jv07_03_반평균구하기2 {
public static void main(String[] args) {

        
    
        Scanner keyboard = new Scanner(System.in);
        System.out.print("학생수를 입력하시오:");
        int s= keyboard.nextInt();

        int [] numbers = new int[s];
        
        int sum=0; 
        int avg=0;

        for (int i =0 ; i<numbers.length ; i=i+1) {
        System.out.print("성적을 입력하시오:");
          numbers[i]= keyboard.nextInt();
        }
        for (int j =0 ; j<numbers.length ; j=j+1) {

        sum= sum + numbers[j]; 
        avg= sum / numbers.length;
    
    }
        System.out.println("합계는:" + sum);
        System.out.println("평균은:" + avg);

}
}


