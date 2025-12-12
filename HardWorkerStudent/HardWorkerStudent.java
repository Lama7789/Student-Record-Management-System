
public class HardWorkerStudent extends Student {

    private int studyHours;

    public HardWorkerStudent(String id, String name, double gpa, String department,
                             int studyHours) {
        super(id, name, gpa, department);
        this.studyHours = studyHours;
    }

    public void showDetails() {
        System.out.println("----- Hard Worker Student -----");
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
        return getGpa() + (studyHours * 0.1);
    }

    public String getLevel() {
        return "Hard Worker";
    }

    }
