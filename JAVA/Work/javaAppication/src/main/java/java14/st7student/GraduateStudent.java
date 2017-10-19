package java14.st7student;

public class GraduateStudent extends student {
    public String lab="";

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    @Override
    public String toString() {
        return "GraduateStudent [lab=" + lab + ", toString()="
                + super.toString() + "]";
    }

    public GraduateStudent() {
        super();
    }

    public GraduateStudent(String lab) {
        super();
        this.lab = lab;
    }

    

    
    }
    

