package java03;

import java.util.Scanner;

public class ex03_02_MaxNumber {

    public static void main(String[] args) {
        
        int x = 0;
        int y = 0;
        int z = 0;
        
        Scanner keyborad = new Scanner(System.in);
        System.out.println("x:");
        System.out.println("y:");
        System.out.println("z:"); 
        x = keyborad.nextInt(); 
        y = keyborad.nextInt();
        z = keyborad.nextInt();
                
        if(x >=y ) {
            System.out.println("입력 받은 수중 가장 큰 수:");            
            }
        if(y >= z ) {
            System.out.println("입력 받은 수중 중간 수:");     
        }         
        else {
            System.out.println("입력 받은 수중 중간 수 :");            
            }
        
            }
        }

                  
