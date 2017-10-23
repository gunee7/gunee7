package java15.enumeration;


import java.util.Scanner;

public class PhoneHeaderTest {
    public static void main(String[] args) {
        
        // 키보드로부터 폰번호를 입력받아 String 타입의 phone변수에 넣는다.
        String phone;
        Scanner sc = new Scanner(System.in);
        System.out.println("폰번호를 입력하시오");
        phone = sc.next();
        
        // 입력 받은 폰번호, phone 변수에서 앞에서부터 3자리 추출하여
        // 추출된 값을 header변수 넣는다
        String header = phone.substring(0, 3);

        if (header.equals( PhoneHeaderClass.P010)) {
            System.out.println("general");
        } 
        else if (header.equals( PhoneHeaderClass.P011)) {
            System.out.println("sk");
        } 
        else if (header.equals( PhoneHeaderClass.P016)) {
            System.out.println("kt");
        } 
        else if (header.equals( PhoneHeaderClass.P019)) {
            System.out.println("lg");
        }
        // 3.클래스 방식의 열거형 . 도전
        // PhoneHeaderClass를 사용하여 아래를 출력되게 하시오.
        // header가 010이면 general, 011이면, sk, 016이면 kt,019이면 lg
    }

        
    }

