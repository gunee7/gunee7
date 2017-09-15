package java02;

public class jv02_15_중간점검 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int a = ++x*2;
        int b = y++*2;
        
        System.out.println( (x==y) && (x!= y)     );
        
        System.out.println( (x >y) || (x<  y)     );
        
        System.out.println( (a >=b) || (a <=b)     );
        
        System.out.println( (a==b) && (a!= b) || (a<  b) );
    }
}
