package java06;

public class jv06_01_왜매서드를쓰는가 {
    public static int getSum(int start, int end) {
        
        int sum = 0;
        
        for(int i = 0; i<=10; i=i+1){ 
            sum = sum + i;
        }
        
        return sum;
    }    
        
        
    public static void main(String[] args) {

        //1부터 10까지의 합계를 구하고
        //그 합계를 sum에 저장하고 출력한다.ㅣ
        int sum = getSum( 1, 100);
        System.out.println("1부터 10까지 합계 =" +sum );
        
        System.out.println("");
        
    }
}
