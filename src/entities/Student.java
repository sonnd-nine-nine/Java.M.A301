package entities;

public class Student extends Person{
    private String idStudent;
    private double theory;
    private double practice;

    public Student() {
    }

    public Student(String idStudent, double theory, double practice) {
        this.idStudent = idStudent;
        this.theory = theory;
        this.practice = practice;
    }

    public Student(String name, String gender, String phoneNumber, String email, String idStudent, double theory, double practice) {
        super(name, gender, phoneNumber, email);
        this.idStudent = idStudent;
        this.theory = theory;
        this.practice = practice;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public double getTheory() {
        return theory;
    }

    public void setTheory(double theory) {
        if(theory>=0 && theory<=10)
            this.theory = theory;
        else
            System.out.println("Enter theory mark (0>10)!");
    }

    public double getPractice() {
        return practice;
    }

    public void setPractice(double pactice) {
        if(theory>=0 && theory<=10)
            this.practice = pactice;
        else
            System.out.println("Enter pactice mark (0>10)!");
    }

    public double calculateFinalMark(){
        return (theory + practice)/2;
    }

    public String toString(){
        return "Name: " + getName() + "\nGender: " +getGender()+
                "\nPhone: "+getPhoneNumber()+"\nEmail: " +getEmail()+
                "\nId Student: "+getIdStudent()+"\nFinal Mark: " +calculateFinalMark();
    }
}
