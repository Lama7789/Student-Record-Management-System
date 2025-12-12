
public abstract class Student implements Evaluatable {

    protected String id;
    protected String name;
    protected double gpa;
    protected String department;
    private StudentAddress address;
        
   
    public Student(String id, String name, double gpa, String department) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getDepartment() {
        return department;
    }
    
    public void setStudentAddress( StudentAddress address){
        this.address=address;
    }
     public StudentAddress getStudentAddress(){
         return address ;
    }

    public abstract void showDetails();

    }
