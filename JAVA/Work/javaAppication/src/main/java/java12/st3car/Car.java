package java12.st3car;

public class Car {
    private String color = "빨랑" ;
    private int    speed = 100;
    private int    gear  = 4;
    
    //static 필드 선언
    private static int numberOfCar=0;

    public static int getNumberOfCar() {
        return numberOfCar;
    }
    
    //동작:메서드
    public static void setNumberOfCar(int numberOfCar) {
        Car.numberOfCar = numberOfCar;
    }
    public static int getNumberOfCars() {
        return numberOfCars;
    }
    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }

    //실체화된 car 객체의 개수를 위한 정적 변수
    private static int numberOfCars=0;
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
        carid = ++numberOfCars;
    }
    public Car(String color, int speed, int gear) {
        super();
        this.color = color;
        this.speed = speed;
        this.gear = gear;
        carid = ++numberOfCars;
    }
  //toString
    
    @Override
    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear
                + "]";
    }
      
    
    
}
