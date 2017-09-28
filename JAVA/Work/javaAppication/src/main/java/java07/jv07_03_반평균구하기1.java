package java07;

import java.lang.reflect.Array;
import java.util.Scanner;

public class jv07_03_반평균구하기1 {
    public static void main(String[] args){
        
        int size = 3;
        int[] array = new int[size];
        
        Scanner sc = new Scanner(System.in); //키보다와 프로그램 연결 : 1번만 연결


        int sum = 0;
        for(int i = 0; i<=array.length-1 ; i=i+1){
        System.out.println("숫자를 입력하세요 :");  //사용자를 위한 텍스트 출력
        array[i] = sc.nextInt(); // 정수 입력 받아 x 공간에 저장.
        
        //배열 값을 출력
        }
        System.out.print("배열의 값을:");
        for(int i = 0 ; i<=array.length -1 ; i=i+1){
            System.out.println( array[i] );
            
            if(i==array.length -1 ) {
                
            }
            else {
                System.out.print(", ");
                
            }
            System.out.println();
            
            //배열 값을 출력 : format를 이용해서
            System.out.format("배열의 값은:%d,%d,%d", array[1], array[2], array[3]);
        }
      
        }  
        

    
}
