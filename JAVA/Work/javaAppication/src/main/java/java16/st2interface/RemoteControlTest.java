package java16.st2interface;

public class RemoteControlTest {
    
     public void main(String[] args){
        RemoteControl obj = new Television();
        obj.turnOn ();
        obj.turnOff();
         
        Fridge f1 = new Fridge();
        f1.turnOn ();
        f1.turnOff();

        
        Television t1 = new Television();
        t1.turnOn ();
        t1.turnOff();
        
        obj = new Fridge();
        obj.turnOn ();
        obj.turnOff();
        
        
    }
}
