package lambdas.Comparator;

public class Student {

    public String name;
    public int rollNumber;
   public int marks;
    public Student(String name, int rollNumber,int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "[name: " + this.name + ", rollNumber: " + this.rollNumber + ", marks: " + this.marks + "]\n";
    }
}
