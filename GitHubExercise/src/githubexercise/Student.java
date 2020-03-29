/**
 * GitHub Exercise - Practice using GitHub w/ NetBeans
 * Student.java
 * Purpose: Creates a new student object which holds information on a singular 
 * student such as name, year, grade, and more.
 * 
 * @author <Team Names>
 * @version 1.0 <Date>
 */
// Packages
package githubexercise;

// Student - Java Class
public class Student {
    // Class Variables
    private String name; // Student Name
    private int year; // Student Year
    private int grade; // Student Grade (0-100)
    // Create code to...
    // Add two new student attributes
    
    // Constructors
    public Student() {
        // Assign default info
        name = "John Doe";
        year = 1;
        grade = 0;
        // Create code to...
        // Assign new default attributes
    }
    public Student(String studentName, int studentYear, int studentGrade) {
        // Assign give info (Parameters may change)
        name = studentName;
        year = studentYear;
        grade = studentGrade;
        // Create code to...
        // Assign new attributes
    }
    
    // Accessors
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public int getGrade() {
        return grade;
    }
    // Create code to...
    // Add two new accessor methods for new attributes
    
    // Mutators
    public void setName(String newName) {
        name = newName;
    }
    public void setYear(int newYear) {
        year = newYear;
    }
    public void setGrade(int newGrade) {
        grade = newGrade;
    }
    // Creat code to...
    // Add two new mutator methods for new attributes
    
    // String Method
    /**
     * Overrides the string value returned when printed
     * 
     * @return 
     */
    @Override
    public String toString() {
        // Create code to...
        // Add readable statement for student info
        return null; // Syntax Placeholder
    }
}
