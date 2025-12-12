/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class RegularStudent extends Student {

    public RegularStudent(String id, String name, double gpa, String department) {
        super(id, name, gpa, department);
    }

    public void showDetails() {
        System.out.println("----- Regular Student -----");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("GPA: " + getGpa());
        System.out.println("Department: " + getDepartment());
        if (getStudentAddress() != null) {
        System.out.println("Campus: " + getStudentAddress().getcampus());
        System.out.println("Room Number: " + getStudentAddress().getroomNumber());
    }
    }
    
    public double calculateScore() {
        return getGpa();
    }

    public String getLevel() {
        return "Regular";
    }
}
