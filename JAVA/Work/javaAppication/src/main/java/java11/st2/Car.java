package java11.st2;

public class Car {
    private String color = "파랑" ;
    private int    speed = 60;
    private int    gear  = 3;
    
    //동작; 메서드
    void speedUp(int s ) {
        speed = speed + s; // speed +=s ;
    }
    void speedDown(int s) {
        speed = speed - s; // speed -=s ;
    }
    void speedPrint() {
        System.out.println("속도" + speed + "km");
        
}
    //getter&setter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getGear() {
        return gear;
    }
    public void setGear(int gear) {
        this.gear = gear;
    }
    
    //construtor(생성자)
    public Car() {
        super();
    }
    public Car(String color, int speed, int gear) {
        super();
        this.color = color;
        this.speed = speed;
        this.gear = gear;
    }
  //toString
    
    @Override
    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear
                + "]";
    }
      
    
    
}
