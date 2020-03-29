/**
 * GitHub Exercise - Practice using GitHub w/ NetBeans
 * MainOrganizer.java
 * Purpose: Takes in user input to determine program action, as well as organizes 
 * student class list depending on desired attribute
 * 
 * @author <Team Names>
 * @version 1.0 <Date>
 */
// Packages
package githubexercise;

// Imports
import java.util.Scanner;

// Organizer - Java Class
public class MainOrganizer {
    // Main Code
    /**
     * Executes the program
     * 
     * @param args The command line arguments
     */
    public static void main(String args[]) {
        // Variables
        Scanner scan = new Scanner(System.in);
        Class studentClass = new Class();
        int choice = 1;
        while (choice != 0) {
            System.out.print("Would you like to add a student (1), remove a student " +
                            "(2), organize the class (3), display the class (4), or exit (0)?: ");
            choice = scan.nextInt();
            switch(choice) {
                case 1: {
                   // Create code to...
                   // Add student using user-entered info
                   break; 
                }
                case 2: {
                    // Create code to...
                    // Remove student using user-entered name
                    break;
                }
                case 3: {
                    // Display organized students
                    Class newClass = organizeClass(studentClass);
                    System.out.println("Student List:");
                    for (Student student: newClass.getStudents()) {
                        System.out.println(student);
                    }
                    break;
                }
                case 4: {
                    // Display students
                    System.out.println("Student List:");
                    for (Student student: studentClass.getStudents()) {
                        System.out.println(student);
                    }
                    break;
                }
                case 0: {
                    // End program
                    System.out.println("Ending Program");
                    break;
                }
                default: {
                    // Invalid entry
                    System.out.println("Error, invalid entry. Please try again.");
                    break;
                }
            }
            System.out.println(); // Empty line
        }
    }
    
    // Functions
    public static Class organizeClass(Class originalClass) {
        // Student lists
        Student[] originalStudents = originalClass.getStudents();
        Student[] organizedStudents = new Student[originalStudents.length];
        
        // Create code to...
        /* Organize the list of students based on user entry for 
        organization style (Name, year, grade, etc) */
        
        // Display new list
        Class organizedClass = new Class(organizedStudents);
        return organizedClass;
    }
}
