/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class CreativeStudent extends Student {

    private int projects;
    private String creativeField;

    public CreativeStudent(String id, String name, double gpa, String department,
                           int projects, String creativeField) {
        super(id, name, gpa, department);
        this.projects = projects;
        this.creativeField = creativeField;
    }

    public void showDetails() {
        System.out.println("----- Creative Student -----");
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
        return getGpa() + (projects * 0.2);
    }

    public String getLevel() {
        return "Creative";
    }
    }






