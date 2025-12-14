import java.util.ArrayList;
import java.util.Scanner;

public class Test {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<Student> students = new ArrayList<>();

System.out.println("Welcome! Student Manager");

Thread welcomeThread = new Thread(() -> {
System.out.println("Loading Student System...");
try { Thread.sleep(1000); } catch (InterruptedException e) {}
System.out.println("System Ready!\n");
});
welcomeThread.start();
try { welcomeThread.join(); } catch (Exception e) {}

while (true) {
System.out.println("\nChoose an option:");
System.out.println("1. Add Student");
System.out.println("2. Update Student");
System.out.println("3. Remove Student");
System.out.println("4. Show Students");
System.out.println("5. Search Student by ID");
System.out.println("6. Exit");
System.out.print("Your choice: ");

int choice;
try {
choice = Integer.parseInt(sc.nextLine());
if (choice < 1 || choice > 6) {
System.out.println("Invalid choice. Try again.");
continue;
}
} catch (NumberFormatException e) {
System.out.println("Invalid choice. Try again.");
continue;
}

switch (choice) {
case 1 -> addStudent(sc, students);
case 2 -> updateStudent(sc, students);
case 3 -> removeStudent(sc, students);
case 4 -> showStudents(students);
case 5 -> searchStudent(sc, students);
case 6 -> {
System.out.println("Program closed. Have a nice day!");
sc.close();
return;
   }
  }
 }
}
