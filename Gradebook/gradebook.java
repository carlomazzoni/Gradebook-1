import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
//GradeBook Class
public class gradebook{
    //creates a list of classrooms
    public static List<classroom> classList = new ArrayList<classroom>();
    public static void main(String[] args){
        gradebook g = new gradebook();
        System.out.println("Welcome to the gradebook");
        int choice = 1;
        while (choice != 0){
            Scanner userInput = new Scanner (System.in);
            System.out.print("What would you like to do?\n");
            System.out.println("\t1)Add Class\n\t2)Display List of Classes\n\t3)Edit Class\n\t4)Delete Class\n\t0)Exit\n");
            choice = userInput.nextInt();
            switch(choice){
                case 1:
                    g.addClass();
                    break;
                case 2:
                    g.displayClasses();
                    break;
                case 3:
                    g.editClass();
                    break;
                case 4:
                    g.deleteClass();
                    break;
                case 0:
                    break;
            }
        }
    }
    public void displayClasses(){
        for (int i = 0; i < classList.size(); i++){
            System.out.println("Class " + i + ") " + classList.get(i).getName());
        }
    }
    public void addClass(){
        Scanner userInput = new Scanner (System.in);
        System.out.print("Whats the name of the class?");
        String n;
        n = userInput.next();
        classroom c = new classroom(n);
        classList.add(c);
    }
    public void deleteClass(){
        System.out.println("Which one?");
        displayClasses();
        int n; 
        Scanner userInput = new Scanner (System.in);
        n = userInput.nextInt();
        classList.remove(n);
    }
    public void editClass(){
        System.out.println("Which one?");
        displayClasses();
        int n; 
        Scanner userInput = new Scanner (System.in);
        n = userInput.nextInt();
        classList.get(n).edit();
    }
}