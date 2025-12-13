private static void showStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students yet.");
            return;
        }

        for (Student s : students) {
            s.showDetails();
            System.out.println("---------------------------");
        }
        }

    private static void searchStudent(Scanner sc, ArrayList<Student> students) {
        System.out.print("ID to search: ");
        String id = sc.nextLine();

        Student found = findStudentById(students, id);

        if (found != null) {
            found.showDetails();
            System.out.println("------------------------");
            System.out.println("Student found!");
        } else {
            System.out.println("Student not found! Try again.");
        }
        }
        }
