package java00.시험;

import java.util.Arrays;

public class Test {
    public static void main (String[] args){
    String prov = "abc defg ijklm nop qrs wx ys";
    
    int length = prov.length();
    System.out.println(prov.length());
    
    String defg = prov.substring(4, 8);
    System.out.println(defg);
    
    String s1 = prov.replace("ijk", "*#$%^");
    System.out.println(s1);
    
    String prov2 = "74 874 9883 73 9 73646 774"; 
    
    String[] sArray = prov2.split(" ");
    
    int[] iArray  = new int [sArray.length];
    for (int i = 0; i <= sArray.length -1; i = i +1) {
        
        String s = sArray[i];
        
        int t = Integer.valueOf(s);
                
                iArray[i] = t;
    }
    Arrays.sort(iArray);
    
    System.out.println((iArray[iArray.length -1]));
            
}
}
