package test;

import java.util.Scanner;

public class tw04_04_합계구하기swap {
        public static void main(String[] args) {
            int A;
            int B;
            int sum = 0;
            
            Scanner keyborad = new Scanner(System.in);
            System.out.println("시작값을 입력하세요:");
            A = keyborad.nextInt(); // 정수를 입력받고 A에 저장하시오
            System.out.println("종료값을 입력하세요:");
            B = keyborad.nextInt(); // 정수를 입력받고 B에 저장하시오
            
            if (A > B) // 시작값이 종료값보다 큰 경우 for문에서 n부터 ㅜ까지 더하려면 최대 기준점 필요
            {
                for (int i = B; i <= A; i = i + 1) {
                    sum += i;
                }
            } else // A가B보다 작을 경우 여기서 실행
            {
                for (int i = A; i <= B; i = i + 1) {
                    sum += i;
                }
            }
            System.out.println(A + " 부터" + B + "까지의 합:" + sum);
        }
        
    }

}
