package java04;

import static org.junit.Assert.fail;

public class jv04_01_for {
    
    public static void main(String[] args) {
        
        for(int i=0; 
                     i<=10 ; 
                             i=i+1 ) {
            
            System.out.println(i);       
            
        }
        
        int sum = 0;
        for(int i=0; 
                     i<=10; 
                            i=i+1) {          
            sum = sum + i;
        }
        System.out.println("합은" + sum);
    }
}
