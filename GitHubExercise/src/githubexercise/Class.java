/**
 * GitHub Exercise - Practice using GitHub w/ NetBeans
 * Class.java
 * Purpose: Contains an array of student objects, and can add or remove students 
 * to the class list
 * 
 * @author <Team Names>
 * @version 1.0 <Date>
 */
// Packages
package githubexercise;

// Class - Java Class
public class Class {
    // Class Variables
    private Student[] students;
    private int studentCount;
    
    // Constructors
    public Class() {
        // Create Empty Class
        students = new Student[0];
        studentCount = students.length;
    }
    public Class(Student[] newStudents) {
        // Assign Given Students to Class
        students = newStudents;
        studentCount = students.length;
    }
    
    // Methods
    public void addStudent(String name, int year, int grade) {
        // Create code to...
        // Add student to list using given info (Parameters may change)
    }
    public String removeStudent(String studentName) {
        // Create code to...
        // Remove student from list using name (Return message if student not found)
        return null; // Syntax Placeholder
    }
    
    // Accessors
    public Student[] getStudents() {
        return students;
    }
    public int getStudentCount() {
        return studentCount;
    }
}
