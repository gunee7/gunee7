package java17.st1shape;

public class ShapeTest2 {
    public static void main (String arg[]) {
        
        //클래스 상향 형변환
        Shape s = null;
        Rectangle r = new Rectangle();
        r.x = 0;
        r.y = 0;
        r.width =100;
        r.height = 100;
        System.out.println( "r" + r.toString());
        
        s=r ; // 클래스 형변환 발생; Rectangle ===> Shape
        System.out.println( "s" + s.toString());
        
        
    }
}
