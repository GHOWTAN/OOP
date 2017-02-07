public class Student {

    private String name;  
    private int ID;       //unique ID number
    private double grade1, grade2;   
                                                   
    // Class variable for storing next ID
    private static int nextID = 0;

    //Constructor gets name as parameter and it also assigns
    //value to ID number.
    public Student(String name) {
        this.name = name;
        nextID++;
        ID = nextID;
    }
           
    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public String getName() {
        return name;
    }
           
    public int getID() {
        return ID;
    }
           
    public double average() {  
        return (grade1 + grade2) / 2;
    }
} //End of Student class