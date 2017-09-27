package java07;

import static org.junit.Assert.assertNotEquals;

import java.util.Scanner;

public class jv07_03_01_연습1 {
    public static void main(String[] args){
    
    //키보드와 프로그램 연결  
    Scanner keyboard = new Scanner(System.in); //키보드와 프로그램 연결 : 1번만 연결
    
    //키보드에서 배열의 크기를 입력받는다
    System.out.println("학생수(배열의 크기)를 입력하시오:");
   
    
    int x = keyboard.nextInt();
    int[] numbers = new int[x];// 정수 입력 받아 배열
        
    
    //qodufdp sjgsmsek.
    //array(=numbers)[0] = 0;
    //array(=numbers)[1] = 1;
    //array(=numbers)[2] = 2;
    
    //키보드에서 입력 받은 값을 배열에 넣는다.
    //키보드 입력을 입력 받은 수 만큼 반복한다.
    //반복:~부터~까지
    
   //배열의 선언
    int sum = 0;
    int avg = 0;
   
    //배열의 값을 대입
    for(int i =0; i <=numbers.length-1; i=i+1) {
        System.out.print("성적을 입력하시오:");//사용자를 위한 텍스트
        numbers[i] = keyboard.nextInt();//정수 입력 받아 i공간에 저장
   
    }
    //배열 값을 출력(print) :for문을 이용해서
    //반복:~부터~까지
    // for문을 사용하여 배열의 값 출력
    
    for (int i = 0; i <= numbers.length -1; i=i+1) {
       sum = sum +numbers[i]; //sum 함수를 통해서 배열의 값들을 더해줌
       avg = sum / numbers.length; // sum을 배열의 입력 값만큼 나눈다.,
       
    
        }
    System.out.println("합계는 : " + sum);
    System.out.println("평균은 ; " + avg);
    }
 
}
