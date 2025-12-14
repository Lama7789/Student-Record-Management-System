private static void removeStudent(Scanner sc, ArrayList<Student> students) {
System.out.print("ID to remove: ");
String id = sc.nextLine();

Student found = findStudentById(students, id);

if (found != null) {
students.remove(found);
System.out.println("Student removed!");
} else {
System.out.println("Student not found! Try again.");
 }
}
