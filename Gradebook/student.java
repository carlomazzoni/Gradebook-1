import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class student{   
    String firstName;
    String lastName;
    double average;
    int age;
    String idNumber;
    public static List<gradedAssignment> AssignmentList = new ArrayList<gradedAssignment>();
    public student(){

    }
    public student(String fName, String lName, double avg, int a, String id){
        firstName = fName;
        lastName = lName;
        average = avg;
        age = a;
        idNumber = id;
    }

    /*public static void main( String[] args ){
        student x = new student();
        x.inputStudent();
        x.displayStudent();
        
    }*/
    public student(student s){
        firstName = s.firstName;
        lastName = s.lastName;
        average = s.average;
        age = s.age;
        idNumber = s.idNumber;
    }
    public void setFirstName(String f){
        firstName = f;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String l){
        lastName = l;
    }
    public String getLastName(){
        return lastName;
    }
    public student inputStudent(){
        Scanner user_input = new Scanner( System.in );
        System.out.println("Input info for student");
        System.out.println("Sutdents First name: ");
        firstName = user_input.next();
        System.out.println("Sutdents Last name: ");
        lastName = user_input.next();
        System.out.println("Sutdents age: ");
        age = user_input.nextInt();
        System.out.println("Student Identification Number");
        idNumber = user_input.next();
        return this;
    }
    public void displayStudent(){
        System.out.print("Name: " + firstName + " " + lastName + "\n");
        System.out.print("Age: " + age + "\n");
        System.out.print("Id: " + idNumber+ "\n");
        System.out.print("Grades" + AssignmentList.size() + ": \n\n");
        for(int i = 0; i < AssignmentList.size(); i++){
            System.out.print(AssignmentList.get(i).getName() + " " + AssignmentList.get(i).getScore());
        }
    }
    public void addAssignment(){
        Scanner user_input = new Scanner( System.in );
        gradedAssignment assignment = new gradedAssignment();
        System.out.print("Add a new graded Assignment\n");
        assignment.inputInfo();
        AssignmentList.add(assignment);
    }
}