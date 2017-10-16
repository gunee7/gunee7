package java11.st3;

import java11.st2.Car;

public class BoxTest {
    public static void main(String[] args) {
     
    //box 인스턴스생성하시오    
     
    Box c = new Box(100,100,100);
    
    Box b = new Box();
    //width :100
    b.setWidth(100) ;
    //Length :100
    b.setLength(100);
    //Height :100
    b.setHeight(100);
    
    c.printVolumn();
    
    b.printVolumn();
    
   
        
     
        }
}
