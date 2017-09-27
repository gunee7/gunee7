package java07;

import java.util.Scanner;

public class jv07_03_배열로최대최소구하기2 {
    public static void main(String[] args){
    
Scanner keyboard = new Scanner(System.in); //키보드와 프로그램 연결 : 1번만 연결
    
    //키보드에서 배열의 크기를 입력받는다
    System.out.println("학생수(배열의 크기)를 입력하시오:");
    int x = keyboard.nextInt();
    
 
    int[] numbers = new int[x];// //입력 받은 수 만큼의 배열을 만든다.

    //qodufdp sjgsmsek.
    //array(=numbers)[0] = 0;
    //array(=numbers)[1] = 1;
    //array(=numbers)[2] = 2;
    //array(=numbers)[3] = 3;
    //array(=numbers)[4] = 4;
    //array(=numbers)[5] = 5;
    //array(=numbers)[6] = 6;
    //array(=numbers)[7] = 7;
    //array(=numbers)[8] = 8;
    //array(=numbers)[9] = 9;
    
    //키보드에서 입력 받은 값을 배열에 넣는다.
    //키보드 입력을 입력 받은 수 만큼 반복한다.
    //반복:~부터~까지  

   //배열의 선언
    int sum = 0;
    int avg = 0;
    

    //키보드 입력을 입력 받은 수 만큼 반복한다.
    //for문을 이용해서 배열의 합을 구하고 합계를 출력한다.
    //평균을 구하고 평균을 출력한다.

   
   
    //배열의 값을 대입

    for(int i =0; i <=numbers.length-1; i=i+1) {
        System.out.print("배열 정렬 전");//사용자를 위한 텍스트
        numbers[i] = keyboard.nextInt();//정수 입력 받아 i공간에 저장    
    }
    //배열 값을 출력(print) :for문을 이용해서
    //반복:~부터~까지
    // for문을 사용하여 배열의 값 출력
    
    

    for( int i = 0; i <= numbers.length-1 ; i=i+1 ) {
    sum = sum + numbers[i];
    

   
    for( int i = 0; i <= numbers.length-1 ; i=i+1 ) {
    sum = sum + numbers[i];
    
    }
    
    System.out.print("합계는" + sum); //평균을 구하고 평균을 출력한다.
    int avg = sum / numbers.length;
    System.out.println("평균은 : " + avg);
    
    sum = sum +numbers[i]; //sum 함수를 통해서 배열의 값들을 더해줌
    avg = sum / numbers.length; // sum을 배열의 입력 값만큼 나눈다.,
 
       //  평균을 구하고 평균을 출력한다. 
    
       
        }
  
    }
 
}

