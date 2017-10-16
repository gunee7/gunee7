package java08;

public class JV08_08_StringFormat {
    public static void main(String[] args) {
        
        String for3 = String.format("H_%d", 2); 
                System.out.println(for3);
         
                String for4 = String.format("%04d", 2); 
                System.out.println(for4); //0030
                
                String for5 = String.format("%, d, 1000000000"); 
                System.out.println(for5); //1,000,000,000
                
                String for6 = String.format("%.2f", 44444444.44444444); 
                System.out.println(for3); //444444.44
                
                String for7 = String.format("%.2f", 44444444.44444444); 
                System.out.println(for3); // 44,444,444.44
                
    }
    
}
