package java04;

public class ex04_04_합계구하기 {
    public static void main(String[] args){
        
        int x = 0;
        int y = 0;
        int r = 0;
        
        Scanner keyboard = new Scanner (System.in);
        System.out.println("시작값을 입력하세요.");
        x = keyboard.nextInt(); //정수 입력
        System.out.println("종료값을 입력하세요");
        y = keyboard.nextInt();
       
        for (int i=1; i<=4; i=i+1) {
            r = r + i;
        }
        System.out.println(x +"부터"+y +"까지의 합계는" + r + "입니다.");
        
    }
}



