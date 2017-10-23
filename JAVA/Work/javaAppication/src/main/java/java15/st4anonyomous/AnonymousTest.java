package java15.st4anonyomous;

public class AnonymousTest {
    
    public static void main(String[] args) {
     // TODO Auto-generated method stub
        //클래스를 이용한 인스턴스 생성
        TV tv1 = new TV();
        
        //인터페이스에 인스턴스 저장
        RemoteControl tv2 = new TV();
        
        //무명 클래스를 이용한 인스턴스 생성
        RemoteControl tv3 = new RemoteControl(){

            @Override
            public void turnOn() {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void turnOff() {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void moveLeft() {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void moveRight() {
                // TODO Auto-generated method stub
                
            }
            
            
        };
        
    }
    
}
