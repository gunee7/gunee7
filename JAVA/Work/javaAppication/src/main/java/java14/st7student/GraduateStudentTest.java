package java14.st7student;

public class GraduateStudentTest {
    public static void main(String[] args) {
        GraduateStudent s1 = new GraduateStudent();
        
        //GraduateStudent 인스턴스 s1을 생성하고
        //필드에 값을 설정한 후 필드 값을 출력하시오.
        
        s1.setNumber(5);
        s1.setName("dd"); 
        s1.phone="2222";
        s1.lab="ddd";
        
        System.out.println(s1.toString());
        
        
    }
    
}
