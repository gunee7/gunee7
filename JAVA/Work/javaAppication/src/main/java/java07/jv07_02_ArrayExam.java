package java07;

public class jv07_02_ArrayExam {
    public static void main(String[] args){
        //배열의 선언
        int size = 6;
        int [] numbers = new int[size];

        
        //배열에 for문을 이용하여 값을 대입하시오
        for (int i = 0 ; i < numbers.length ; i=i+1){
        numbers[i] = i;
        }
        for (int i = 0 ; i < numbers.length ; i=i+1){
        System.out.println( numbers[i]);
    }
        }
        
}