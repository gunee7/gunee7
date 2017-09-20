package test;

public class ex04_14_for실습예제 {
    public static void main(String[] args) {
        
        int sum = 0;
        
        for (int i = 1; i <= 9; i = i + 1) {
            
            sum = i * 2; // for문 안에서 출력 : 9번
            
            System.out.print("2*" + i + "=" + sum);            
            if (i<9) //i가 9보다 작으면
                System.out.printf("  ");
            else //그렇지 않으면
                System.out.printf("  ");    
        }
    }
}
