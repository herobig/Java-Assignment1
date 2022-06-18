package Assignment1.Q10;

public class Student {
    private  String name;

    public Student() {
        this.name = "Unknown";
    }
    public Student(String abc){
        this.name = abc;
    }

    public void printName(){
        System.out.println("Name of the Student is: " + name);
    }

}
