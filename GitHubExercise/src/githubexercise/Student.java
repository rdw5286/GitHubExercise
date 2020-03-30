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
    // Add one new student attributes
    
    // Constructors
    public Student() {
        // Assign default info
        name = "John Doe";
        year = 1;
        grade = 0;
        // Create code to...
        // Assign new default attribute
    }
    public Student(String studentName, int studentYear, int studentGrade) {
        // Assign give info (Parameters may change)
        name = studentName;
        year = studentYear;
        grade = studentGrade;
        // Create code to...
        // Assign new attribute
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
    // Add a new accessor method for new attribute
    
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
    // Create code to...
    // Add a new mutator method for new attribute
    
    // String Method
    /**
     * Overrides the string value returned when printed
     * 
     * @return String of student info
     */
    @Override
    public String toString() {
        // Create printed string
        // Create code to...
        // Add on new attribute to string
        String studentInfo = name + ", Year " + year + ", Grade " + grade;
        return studentInfo;
    }
}
// End of Class