# Student-Record-Management-System
Project



CreativeStudent class represents a CreativeStudent that extends Student, adding projects and a creative field.
It displays student details, calculates a score based on GPA and projects, and identifies the student level as Creative.



Class Evaluatable defines methods for calculating a score and returning the level.



Class HardWorkerStudent extends Student by adding study hours.
HardWorkerStudent displays student details, calculates a score based on GPA and study hours, and returns the level "Hard Worker".



Class RegularStudent extends Student without adding new attributes.
RegularStudent displays basic student details, calculates the score using GPA only, and returns the level "Regular".




Class Student is an abstract class that implements Evaluatable and represents a general student.
Class Student stores basic information, manages the student address, and requires subclasses to implement the showDetails() method.




StudentAddress class stores campus and room number information for a student and provides setters and getters to access and modify these values.




Test class is the main program for managing students.

Test class provides a menu-driven system to add, update, remove, show, and search students. It uses inputStudentData() to gather student information and classify students as CreativeStudent, HardWorkerStudent, or RegularStudent based on projects, GPA, and study hours. Test class also handles student addresses via StudentAddress class and ensures input validation for GPA, projects, and study hours.
It runs a welcome thread at startup to simulate system loading.



- Exception handling by Wasan suliman ALothaim
- Inheritance by Lama ALhujilan
- Composition by Norah ALfheed
- Encapsulation by Lama ALhujilan
- Polymorphsim by Norah ALfheed 
- Multithreading by Wasan suliman ALothaim   
