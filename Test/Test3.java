System.out.println("\n--- Address Information ---");
        System.out.print("Enter Campus: ");
        String campus = sc.nextLine();

        System.out.print("Enter Room Number: ");
        String room = sc.nextLine();

        student.setStudentAddress(new StudentAddress(campus, room));
        return student;
    }

    private static void addStudent(Scanner sc, ArrayList<Student> students) {
        System.out.print("ID: ");
        String id = sc.nextLine();
        Student student = inputStudentData(sc, id);
        students.add(student);
        System.out.println("Successfully added!\n");
    }

    private static Student findStudentById(ArrayList<Student> students, String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }}
        return null;
            }
    private static void updateStudent(Scanner sc, ArrayList<Student> students) {
        System.out.print("ID to update: ");
        String id = sc.nextLine();

        Student old = findStudentById(students, id);

        if (old == null) {
            System.out.println("Student not found! Try again.");
            return;
        }

        Student newStudent = inputStudentData(sc, id);
        students.remove(old);
        students.add(newStudent);
        System.out.println("Student updated!");
    }
