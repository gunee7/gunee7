package java07;

import java.util.Scanner;

public class jv07_03_반평균구하기 {
    public static void main(String[] args) {

        
        int x=0;
        int y=0;
        int z=0; 
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("숫자를 입력하시오:");
        x= keyboard.nextInt();
        
        System.out.print("숫자를 입력하시오:");
        y= keyboard.nextInt();
        
        System.out.print("숫자를 입력하시오:");
        z= keyboard.nextInt();
       
        
        int size = 0;
        int [] numbers = new int[size];
  
        
        for (int i =0 ; i<numbers.length ; i=i+1) {
            numbers[i] = i;
               
        }    

        for (int j =0 ; j<numbers.length ; j=j+1) {
                numbers[j] = j;
        }
         System.out.println("배열의 값은:" + x+","+y+","+z);
        
    }
}
