package entities;

public class Teacher extends Person{
    private double basicSalary;
    private double subsidy;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }

    public Teacher(double basicSalary, double subsidy) {
        this.basicSalary = basicSalary;
        this.subsidy = subsidy;
    }

    public Teacher(String name, String gender, String phoneNumber, String email, double basicSalary, double subsidy) {
        super(name, gender, phoneNumber, email);
        this.basicSalary = basicSalary;
        this.subsidy = subsidy;
    }

    public double calculateSalary(){
        return basicSalary + subsidy;
    }

    public String toString(){
        return "Name: "+getName()+"\nGender: "+getGender()+
                "\nEmail: "+getEmail()+"\nPhone: "+getPhoneNumber()+
                "\nSalayry: " + calculateSalary();
    }
}
