private static Student inputStudentData(Scanner sc, String id) {
            System.out.print("Name: ");
            String name = sc.nextLine();

            double gpa;
            while (true) {
            System.out.print("GPA: ");
            try {
            gpa = Double.parseDouble(sc.nextLine());
           if (gpa < 0.0 || gpa > 5.0) {
            System.out.println("GPA must be between 0.0 and 5.0.");
            continue;}
            break;
            } catch (NumberFormatException e) {
            System.out.println("Invalid GPA. Try again.");
            }
            }

          System.out.print("Department: ");
          String dept = sc.nextLine();

           System.out.println("\n--- Classification Questions ---");

           int projects;
           while (true) {
           System.out.print("Projects: ");
            try {
            projects = Integer.parseInt(sc.nextLine());
            if (projects < 0) throw new NumberFormatException();
             break;
            } catch (NumberFormatException e) {
            System.out.println("Invalid number. Try again.");
            }
            }
            int study;
            while (true) {
            System.out.print("Study Hours: ");
            try {
                study = Integer.parseInt(sc.nextLine());
                if (study < 0) throw new NumberFormatException();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
            }

        Student student;
        if (projects > 10) {
            System.out.print("Creative Field: ");
            String field = sc.nextLine();
            student = new CreativeStudent(id, name, gpa, dept, projects, field);
        } else if (gpa >= 4.5 && study >= 10) {
            student = new HardWorkerStudent(id, name, gpa, dept, study);
        } else {
            student = new RegularStudent(id, name, gpa, dept);
        }